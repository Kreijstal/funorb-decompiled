/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareReflectionEffect extends ShaderEffect {
    private boolean active;
    static RendererPreference[] field_e;

    final static String a(boolean param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        CharSequence[] var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            var3 = (CharSequence[]) null;
            HardwareReflectionEffect.a(false, (CharSequence[]) null);
          }
          stackIn_3_0 = LoginCredentials.joinCharSequences(param1, 0, param1.length, 14156);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("uo.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void refreshState(boolean lighting, byte guard) {
        this.toolkit.setTextureCombineOperations((byte) -83, LegacyOpenGlRenderBufferSet.REPLACE, SlowBurstParticle.MODULATE);
        if (guard > -71) {
          this.active = false;
        }
    }

    final void setParameters(int guard, int parameters1, int parameters0) {
        if (guard != 34023) {
          field_e = (RendererPreference[]) null;
        }
    }

    final static byte a(boolean param0, char param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (param0) {
          regionExit1: {
            if ((param1 <= 0 ||
              param1 >= 128) &&
              (param1 < 160 ||
              param1 > 255)) {
              if (8364 == param1) {
                var2 = -128;
              } else {
                if (param1 == 8218) {
                  var2 = -126;
                } else {
                  if (param1 == 402) {
                    var2 = -125;
                    return (byte) var2;
                  }
                  if (param1 == 8222) {
                    var2 = -124;
                  } else {
                    if (param1 == 8230) {
                      var2 = -123;
                      return (byte) var2;
                    }
                    if (param1 == 8224) {
                      var2 = -122;
                      return (byte) var2;
                    }
                    if (8225 == param1) {
                      var2 = -121;
                      return (byte) var2;
                    }
                    if (param1 == 710) {
                      var2 = -120;
                    } else {
                      if (param1 == 8240) {
                        var2 = -119;
                        return (byte) var2;
                      }
                      if (param1 == 352) {
                        var2 = -118;
                        return (byte) var2;
                      }
                      if (8249 == param1) {
                        var2 = -117;
                        return (byte) var2;
                      }
                      if (338 == param1) {
                        var2 = -116;
                      } else {
                        if (param1 == 381) {
                          var2 = -114;
                        } else {
                          if (param1 == 8216) {
                            var2 = -111;
                          } else {
                            if (param1 == 8217) {
                              var2 = -110;
                            } else {
                              if (param1 == 8220) {
                                var2 = -109;
                              } else {
                                if (8221 == param1) {
                                  var2 = -108;
                                } else {
                                  if (8226 == param1) {
                                    var2 = -107;
                                  } else {
                                    if (param1 == 8211) {
                                      var2 = -106;
                                    } else {
                                      if (8212 == param1) {
                                        var2 = -105;
                                      } else {
                                        if (param1 == 732) {
                                          var2 = -104;
                                        } else {
                                          if (param1 == 8482) {
                                            var2 = -103;
                                          } else {
                                            if (param1 == 353) {
                                              var2 = -102;
                                            } else {
                                              if (8250 == param1) {
                                                var2 = -101;
                                              } else {
                                                if (param1 == 339) {
                                                  var2 = -100;
                                                } else {
                                                  if (param1 == 382) {
                                                    var2 = -98;
                                                  } else {
                                                    if (param1 != 376) {
                                                      var2 = 63;
                                                    } else {
                                                      var2 = -97;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
              break regionExit1;
            }
            var2 = (byte)param1;
          }
          return (byte) var2;
        }
        HardwareReflectionEffect.releaseStatics((byte) 83);
        if (param1 <= 0) {
          if (param1 < 160) {
            if (8364 != param1) {
              if (param1 != 8218) {
                if (param1 == 402) {
                  var2Lifetime1 = -125;
                } else {
                  if (param1 != 8222) {
                    if (param1 == 8230) {
                      var2Lifetime1 = -123;
                    } else {
                      if (param1 == 8224) {
                        var2Lifetime1 = -122;
                      } else {
                        if (8225 == param1) {
                          var2Lifetime1 = -121;
                        } else {
                          if (param1 != 710) {
                            if (param1 == 8240) {
                              var2Lifetime1 = -119;
                            } else {
                              if (param1 == 352) {
                                var2Lifetime1 = -118;
                              } else {
                                if (8249 == param1) {
                                  var2Lifetime1 = -117;
                                } else {
                                  if (338 == param1) {
                                    var2Lifetime1 = -116;
                                  } else {
                                    if (param1 == 381) {
                                      var2Lifetime1 = -114;
                                    } else {
                                      if (param1 != 8216) {
                                        if (param1 != 8217) {
                                          if (param1 == 8220) {
                                            var2Lifetime1 = -109;
                                          } else {
                                            if (8221 == param1) {
                                              var2Lifetime1 = -108;
                                            } else {
                                              if (8226 == param1) {
                                                var2Lifetime1 = -107;
                                              } else {
                                                if (param1 == 8211) {
                                                  var2Lifetime1 = -106;
                                                } else {
                                                  if (8212 != param1) {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2Lifetime1 = -103;
                                                      } else {
                                                        if (param1 != 353) {
                                                          if (8250 == param1) {
                                                            var2Lifetime1 = -101;
                                                          } else {
                                                            if (param1 != 339) {
                                                              if (param1 != 382) {
                                                                var2Lifetime1 = (param1 != 376) ? 63 : -97;
                                                              } else {
                                                                var2Lifetime1 = -98;
                                                              }
                                                            } else {
                                                              var2Lifetime1 = -100;
                                                            }
                                                          }
                                                        } else {
                                                          var2Lifetime1 = -102;
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime1 = -104;
                                                    }
                                                  } else {
                                                    var2Lifetime1 = -105;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          var2Lifetime1 = -110;
                                        }
                                      } else {
                                        var2Lifetime1 = -111;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var2Lifetime1 = -120;
                          }
                        }
                      }
                    }
                  } else {
                    var2Lifetime1 = -124;
                  }
                }
              } else {
                var2Lifetime1 = -126;
              }
            } else {
              var2Lifetime1 = -128;
            }
          } else {
            if (param1 <= 255) {
              var2Lifetime1 = (byte)param1;
            } else {
              if (8364 != param1) {
                if (param1 != 8218) {
                  if (param1 == 402) {
                    var2Lifetime1 = -125;
                  } else {
                    if (param1 != 8222) {
                      if (param1 == 8230) {
                        var2Lifetime1 = -123;
                      } else {
                        if (param1 == 8224) {
                          var2Lifetime1 = -122;
                        } else {
                          if (8225 == param1) {
                            var2Lifetime1 = -121;
                          } else {
                            if (param1 != 710) {
                              if (param1 == 8240) {
                                var2Lifetime1 = -119;
                              } else {
                                if (param1 == 352) {
                                  var2Lifetime1 = -118;
                                } else {
                                  if (8249 == param1) {
                                    var2Lifetime1 = -117;
                                  } else {
                                    if (338 == param1) {
                                      var2Lifetime1 = -116;
                                    } else {
                                      if (param1 == 381) {
                                        var2Lifetime1 = -114;
                                      } else {
                                        if (param1 != 8216) {
                                          if (param1 != 8217) {
                                            if (param1 == 8220) {
                                              var2Lifetime1 = -109;
                                            } else {
                                              if (8221 == param1) {
                                                var2Lifetime1 = -108;
                                              } else {
                                                if (8226 == param1) {
                                                  var2Lifetime1 = -107;
                                                } else {
                                                  if (param1 == 8211) {
                                                    var2Lifetime1 = -106;
                                                  } else {
                                                    if (8212 != param1) {
                                                      if (param1 != 732) {
                                                        if (param1 == 8482) {
                                                          var2Lifetime1 = -103;
                                                        } else {
                                                          if (param1 != 353) {
                                                            if (8250 == param1) {
                                                              var2Lifetime1 = -101;
                                                            } else {
                                                              if (param1 != 339) {
                                                                if (param1 != 382) {
                                                                  var2Lifetime1 = (param1 != 376) ? 63 : -97;
                                                                } else {
                                                                  var2Lifetime1 = -98;
                                                                }
                                                              } else {
                                                                var2Lifetime1 = -100;
                                                              }
                                                            }
                                                          } else {
                                                            var2Lifetime1 = -102;
                                                          }
                                                        }
                                                      } else {
                                                        var2Lifetime1 = -104;
                                                      }
                                                    } else {
                                                      var2Lifetime1 = -105;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var2Lifetime1 = -110;
                                          }
                                        } else {
                                          var2Lifetime1 = -111;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              var2Lifetime1 = -120;
                            }
                          }
                        }
                      }
                    } else {
                      var2Lifetime1 = -124;
                    }
                  }
                } else {
                  var2Lifetime1 = -126;
                }
              } else {
                var2Lifetime1 = -128;
              }
            }
          }
          return (byte) var2Lifetime1;
        }
        if (param1 < 128) {
          var2Lifetime2 = (byte)param1;
          return (byte) var2Lifetime2;
        }
        if (param1 < 160) {
          if (8364 != param1) {
            if (param1 != 8218) {
              if (param1 == 402) {
                var2Lifetime3 = -125;
              } else {
                if (param1 != 8222) {
                  if (param1 == 8230) {
                    var2Lifetime3 = -123;
                  } else {
                    if (param1 == 8224) {
                      var2Lifetime3 = -122;
                    } else {
                      if (8225 == param1) {
                        var2Lifetime3 = -121;
                      } else {
                        if (param1 != 710) {
                          if (param1 == 8240) {
                            var2Lifetime3 = -119;
                          } else {
                            if (param1 == 352) {
                              var2Lifetime3 = -118;
                            } else {
                              if (8249 == param1) {
                                var2Lifetime3 = -117;
                              } else {
                                if (338 == param1) {
                                  var2Lifetime3 = -116;
                                } else {
                                  if (param1 == 381) {
                                    var2Lifetime3 = -114;
                                  } else {
                                    if (param1 != 8216) {
                                      if (param1 != 8217) {
                                        if (param1 == 8220) {
                                          var2Lifetime3 = -109;
                                        } else {
                                          if (8221 == param1) {
                                            var2Lifetime3 = -108;
                                          } else {
                                            if (8226 == param1) {
                                              var2Lifetime3 = -107;
                                            } else {
                                              if (param1 == 8211) {
                                                var2Lifetime3 = -106;
                                              } else {
                                                if (8212 != param1) {
                                                  if (param1 != 732) {
                                                    if (param1 == 8482) {
                                                      var2Lifetime3 = -103;
                                                    } else {
                                                      if (param1 != 353) {
                                                        if (8250 == param1) {
                                                          var2Lifetime3 = -101;
                                                        } else {
                                                          if (param1 == 339) {
                                                            var2Lifetime3 = -100;
                                                          } else {
                                                            if (param1 == 382) {
                                                              var2Lifetime3 = -98;
                                                            } else {
                                                              if (param1 != 376) {
                                                                var2Lifetime3 = 63;
                                                              } else {
                                                                var2Lifetime3 = -97;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2Lifetime3 = -102;
                                                      }
                                                    }
                                                  } else {
                                                    var2Lifetime3 = -104;
                                                  }
                                                } else {
                                                  var2Lifetime3 = -105;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var2Lifetime3 = -110;
                                      }
                                    } else {
                                      var2Lifetime3 = -111;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var2Lifetime3 = -120;
                        }
                      }
                    }
                  }
                } else {
                  var2Lifetime3 = -124;
                }
              }
            } else {
              var2Lifetime3 = -126;
            }
          } else {
            var2Lifetime3 = -128;
          }
          return (byte) var2Lifetime3;
        }
        if (param1 > 255) {
          if (8364 != param1) {
            if (param1 != 8218) {
              if (param1 == 402) {
                var2Lifetime4 = -125;
              } else {
                if (param1 != 8222) {
                  if (param1 == 8230) {
                    var2Lifetime4 = -123;
                    return (byte) var2Lifetime4;
                  }
                  if (param1 == 8224) {
                    var2Lifetime4 = -122;
                    return (byte) var2Lifetime4;
                  }
                  if (8225 == param1) {
                    var2Lifetime4 = -121;
                    return (byte) var2Lifetime4;
                  }
                  if (param1 != 710) {
                    if (param1 == 8240) {
                      var2Lifetime4 = -119;
                      return (byte) var2Lifetime4;
                    }
                    if (param1 == 352) {
                      var2Lifetime4 = -118;
                      return (byte) var2Lifetime4;
                    }
                    if (8249 == param1) {
                      var2Lifetime4 = -117;
                      return (byte) var2Lifetime4;
                    }
                    if (338 == param1) {
                      var2Lifetime4 = -116;
                      return (byte) var2Lifetime4;
                    }
                    if (param1 == 381) {
                      var2Lifetime4 = -114;
                      return (byte) var2Lifetime4;
                    }
                    if (param1 != 8216) {
                      if (param1 != 8217) {
                        if (param1 == 8220) {
                          var2Lifetime4 = -109;
                          return (byte) var2Lifetime4;
                        }
                        if (8221 == param1) {
                          var2Lifetime4 = -108;
                          return (byte) var2Lifetime4;
                        }
                        if (8226 == param1) {
                          var2Lifetime4 = -107;
                          return (byte) var2Lifetime4;
                        }
                        if (param1 == 8211) {
                          var2Lifetime4 = -106;
                          return (byte) var2Lifetime4;
                        }
                        if (8212 != param1) {
                          if (param1 != 732) {
                            if (param1 == 8482) {
                              var2Lifetime4 = -103;
                              return (byte) var2Lifetime4;
                            }
                            if (param1 != 353) {
                              if (8250 == param1) {
                                var2Lifetime4 = -101;
                              } else {
                                if (param1 == 339) {
                                  var2Lifetime4 = -100;
                                } else {
                                  if (param1 == 382) {
                                    var2Lifetime4 = -98;
                                  } else {
                                    if (param1 != 376) {
                                      var2Lifetime4 = 63;
                                    } else {
                                      var2Lifetime4 = -97;
                                    }
                                  }
                                }
                              }
                              return (byte) var2Lifetime4;
                            }
                            var2Lifetime4 = -102;
                          } else {
                            var2Lifetime4 = -104;
                          }
                        } else {
                          var2Lifetime4 = -105;
                        }
                      } else {
                        var2Lifetime4 = -110;
                      }
                    } else {
                      var2Lifetime4 = -111;
                    }
                  } else {
                    var2Lifetime4 = -120;
                  }
                } else {
                  var2Lifetime4 = -124;
                }
              }
            } else {
              var2Lifetime4 = -126;
            }
          } else {
            var2Lifetime4 = -128;
          }
        } else {
          var2Lifetime4 = (byte)param1;
        }
        return (byte) var2Lifetime4;
    }

    final void enable(boolean lighting, int guard) {
        AffineTransform3D var4 = null;
        CubeTexture var3 = this.toolkit.environmentCubeTexture((byte) 122);
        if (guard != 20186) {
          return;
        }
        if (var3 == null) {
          this.toolkit.setAlphaCombineSource(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
          return;
        }
        if (lighting) {
          this.toolkit.setActiveTextureUnit(1, -122);
          this.toolkit.bindTexture(var3, 91);
          this.toolkit.applyTexCoordGeneration(guard - 6432, LabeledWidget.REFLECTION_MAP);
          this.toolkit.setActiveTextureUnit(1, -114);
          this.toolkit.setTextureCombineOperations((byte) -83, LegacyOpenGlRenderBufferSet.REPLACE, OpenGlBuffer.INTERPOLATE);
          this.toolkit.setColorCombineSource((byte) 101, 2, true, false, FontMetrics.PREVIOUS);
          this.toolkit.setAlphaCombineSource(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
          var4 = this.toolkit.textureTransform(0);
          var4.copyLinearFrom(this.toolkit.scratchTransform(true), true);
          this.toolkit.setTextureTransformMode(LegacyRidgedWaterNoise.TEXTURE_COUNT3, 28880);
          this.toolkit.setActiveTextureUnit(0, -124);
          this.active = true;
          return;
        }
        this.toolkit.setAlphaCombineSource(NetworkResourceRequest.PRIMARY_COLOR, 0, true);
    }

    final boolean isSupported(byte guard) {
        if (guard > -8) {
          field_e = (RendererPreference[]) null;
          return true;
        }
        return true;
    }

    HardwareReflectionEffect(HardwareGraphicsToolkit owner) {
        super(owner);
        this.active = false;
    }

    final void disable(boolean guard) {
        if (!guard) {
          if (this.active) {
            this.toolkit.setActiveTextureUnit(1, -111);
            this.toolkit.applyTexCoordGeneration(13754, LegacyOpenGlRenderBufferSet.DISABLED);
            this.toolkit.setTextureCombineOperations((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
            this.toolkit.setColorCombineSource(AccountRequestState.CONSTANT, 2, 0);
            this.toolkit.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, true);
            this.toolkit.resetTextureTransform(0);
            this.toolkit.bindTexture((GpuTexture) null, 98);
            this.toolkit.setActiveTextureUnit(0, -120);
            this.active = false;
          } else {
            this.toolkit.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, !guard ? true : false);
          }
          this.toolkit.setTextureCombineOperations((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
          return;
        }
        this.active = false;
        if (this.active) {
          this.toolkit.setActiveTextureUnit(1, -111);
          this.toolkit.applyTexCoordGeneration(13754, LegacyOpenGlRenderBufferSet.DISABLED);
          this.toolkit.setTextureCombineOperations((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
          this.toolkit.setColorCombineSource(AccountRequestState.CONSTANT, 2, 0);
          this.toolkit.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, !guard ? true : false);
          this.toolkit.resetTextureTransform(0);
          this.toolkit.bindTexture((GpuTexture) null, 98);
          this.toolkit.setActiveTextureUnit(0, -120);
          this.active = false;
        } else {
          this.toolkit.setAlphaCombineSource(LegacyVertexAttribute.TEXTURE, 0, !guard ? true : false);
        }
        this.toolkit.setTextureCombineOperations((byte) -83, SlowBurstParticle.MODULATE, SlowBurstParticle.MODULATE);
    }

    final void bindTexture(int combineMode, int guard, GpuTexture texture) {
        try {
          this.toolkit.bindTexture(texture, 113);
          this.toolkit.setTextureCombineMode(guard ^ 18900, combineMode);
          if (guard != 18834) {
            CharSequence[] var5 = (CharSequence[]) null;
            HardwareReflectionEffect.a(true, (CharSequence[]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "uo.E(" + combineMode + ',' + guard + ',' + (texture != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 < 25) {
          field_e = (RendererPreference[]) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    static {
    }
}
