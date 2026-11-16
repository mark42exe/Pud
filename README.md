# YouTube Liquid Glass (ReVanced patch)

Experimental ReVanced patch project targeting **YouTube 20.40.45** (`com.google.android.youtube`).

## Goal

Replace the standard bottom navigation presentation with a horizontally centered floating glass-style navigation surface. The intended destinations are Home, Shorts, Create, Subscriptions, and You. The design target includes a translucent dark surface, subtle highlights, a selected-item treatment, and layout adaptation for portrait and landscape.

## Current status

This repository is the build scaffold, not a finished patch. The patch currently contains no YouTube bytecode modifications.

The exact APK must be disassembled and inspected before implementation. In particular, the navigation view/layout identifiers, method fingerprints, and resource structure must be verified against YouTube 20.40.45. Guessing those targets would produce a brittle patch and could break app startup.

## Build

The GitHub Actions workflow builds the ReVanced patch project and uploads its build output as an artifact. A successful project build does **not** mean the navigation patch is implemented or compatible.

## Target

- Package: `com.google.android.youtube`
- Version: `20.40.45`
- Intended output: ReVanced patch bundle (`.rvp`) after implementation and validation

## Safety and distribution

This project is an independent customization. It does not include or redistribute YouTube APK files.
