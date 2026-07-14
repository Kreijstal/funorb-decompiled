/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe extends bd {
    private int field_y;
    static int[] field_s;
    static String field_w;
    private int field_t;
    private int field_u;
    static String field_v;
    private int field_A;
    static je field_x;
    private int field_z;

    final void a(int param0, ha param1) {
        param1.field_l.a((byte) -119, (tc) (Object) new kf(((pe) this).field_u, ((pe) this).field_y, ((pe) this).field_t, ((pe) this).field_A, ((pe) this).field_z, ((pe) this).field_m));
        if (param0 != 64) {
            String discarded$0 = pe.a(53, false, (String[][]) null);
        }
    }

    final static String a(int param0, boolean param1, String[][] param2) {
        String var3 = param2[param0][0];
        if (kq.a(var3, param1)) {
            return null;
        }
        return var3;
    }

    public static void a(byte param0) {
        int var1 = -106 / ((param0 - 59) / 60);
        field_x = null;
        field_s = null;
        field_v = null;
        field_w = null;
    }

    final static int b(int param0, int param1) {
        double var2 = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = (double)(255 & param1 >> -1126195952) / 256.0;
        var4 = (double)((param1 & 65459) >> 1736684840) / 256.0;
        if (param0 >= 22) {
          L0: {
            var6 = (double)(param1 & 255) / 256.0;
            var8 = var2;
            if (var8 > var4) {
              var8 = var4;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (var8 > var6) {
              var8 = var6;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var10 = var2;
            if (var10 < var4) {
              var10 = var4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (var10 >= var6) {
              break L3;
            } else {
              var10 = var6;
              break L3;
            }
          }
          var12 = 0.0;
          var14 = 0.0;
          var16 = (var8 + var10) / 2.0;
          if (var8 != var10) {
            L4: {
              if (var16 < 0.5) {
                var14 = (-var8 + var10) / (var10 + var8);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var10 != var2) {
                if (var4 == var10) {
                  var12 = 2.0 + (-var2 + var6) / (-var8 + var10);
                  break L5;
                } else {
                  if (var6 == var10) {
                    var12 = 4.0 + (-var4 + var2) / (-var8 + var10);
                    break L5;
                  } else {
                    L6: {
                      if (0.5 <= var16) {
                        var14 = (var10 - var8) / (2.0 - var10 - var8);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var12 = var12 / 6.0;
                    var18 = (int)(256.0 * var12);
                    var19 = (int)(256.0 * var14);
                    var20 = (int)(var16 * 256.0);
                    if (0 > var19) {
                      L7: {
                        var19 = 0;
                        if (0 > var20) {
                          var20 = 0;
                          break L7;
                        } else {
                          if (var20 >= -256) {
                            break L7;
                          } else {
                            L8: {
                              var20 = 255;
                              if (243 < var20) {
                                var19 = var19 >> 4;
                                break L8;
                              } else {
                                if (-218 >= var20) {
                                  if (192 < var20) {
                                    var19 = var19 >> 2;
                                    break L8;
                                  } else {
                                    if (var20 <= 179) {
                                      break L8;
                                    } else {
                                      var19 = var19 >> 1;
                                      break L8;
                                    }
                                  }
                                } else {
                                  var19 = var19 >> 3;
                                  break L8;
                                }
                              }
                            }
                            return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                          }
                        }
                      }
                      if (243 >= var20) {
                        if (-218 <= (var20 ^ -1)) {
                          if (192 >= var20) {
                            if (var20 > 179) {
                              var19 = var19 >> 1;
                              return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                            } else {
                              return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                            }
                          } else {
                            var19 = var19 >> 2;
                            return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                          }
                        } else {
                          var19 = var19 >> 3;
                          return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                        }
                      } else {
                        var19 = var19 >> 4;
                        return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                      }
                    } else {
                      if (var19 <= 255) {
                        L9: {
                          if (0 > var20) {
                            var20 = 0;
                            break L9;
                          } else {
                            if (var20 >= -256) {
                              break L9;
                            } else {
                              var20 = 255;
                              break L9;
                            }
                          }
                        }
                        L10: {
                          if (243 < var20) {
                            var19 = var19 >> 4;
                            break L10;
                          } else {
                            if (-218 >= var20) {
                              if (192 < var20) {
                                var19 = var19 >> 2;
                                break L10;
                              } else {
                                if (var20 <= 179) {
                                  break L10;
                                } else {
                                  var19 = var19 >> 1;
                                  break L10;
                                }
                              }
                            } else {
                              var19 = var19 >> 3;
                              break L10;
                            }
                          }
                        }
                        return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                      } else {
                        L11: {
                          var19 = 255;
                          if (0 > var20) {
                            var20 = 0;
                            break L11;
                          } else {
                            if (var20 >= -256) {
                              break L11;
                            } else {
                              var20 = 255;
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (243 < var20) {
                            var19 = var19 >> 4;
                            break L12;
                          } else {
                            if (-218 >= var20) {
                              if (192 < var20) {
                                var19 = var19 >> 2;
                                break L12;
                              } else {
                                if (var20 <= 179) {
                                  break L12;
                                } else {
                                  var19 = var19 >> 1;
                                  break L12;
                                }
                              }
                            } else {
                              var19 = var19 >> 3;
                              break L12;
                            }
                          }
                        }
                        return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                      }
                    }
                  }
                }
              } else {
                var12 = (-var6 + var4) / (var10 - var8);
                break L5;
              }
            }
            L13: {
              if (0.5 <= var16) {
                var14 = (var10 - var8) / (2.0 - var10 - var8);
                break L13;
              } else {
                break L13;
              }
            }
            var12 = var12 / 6.0;
            var18 = (int)(256.0 * var12);
            var19 = (int)(256.0 * var14);
            var20 = (int)(var16 * 256.0);
            if (0 > var19) {
              L14: {
                var19 = 0;
                if (0 > var20) {
                  var20 = 0;
                  break L14;
                } else {
                  if (var20 >= -256) {
                    break L14;
                  } else {
                    var20 = 255;
                    if (243 >= var20) {
                      if (-218 >= var20) {
                        if (192 >= var20) {
                          if (var20 > 179) {
                            var19 = var19 >> 1;
                            return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                          } else {
                            return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                          }
                        } else {
                          var19 = var19 >> 2;
                          return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                        }
                      } else {
                        var19 = var19 >> 3;
                        return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                      }
                    } else {
                      var19 = var19 >> 4;
                      return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                    }
                  }
                }
              }
              if (243 >= var20) {
                if (-218 <= (var20 ^ -1)) {
                  if (192 < var20) {
                    var19 = var19 >> 2;
                    return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                  } else {
                    if (var20 <= 179) {
                      return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                    } else {
                      var19 = var19 >> 1;
                      return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                    }
                  }
                } else {
                  var19 = var19 >> 3;
                  return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                }
              } else {
                var19 = var19 >> 4;
                return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
              }
            } else {
              if (var19 > 255) {
                L15: {
                  var19 = 255;
                  if (0 > var20) {
                    var20 = 0;
                    break L15;
                  } else {
                    if (var20 >= -256) {
                      break L15;
                    } else {
                      var20 = 255;
                      break L15;
                    }
                  }
                }
                if (243 >= var20) {
                  if (-218 >= var20) {
                    if (192 >= var20) {
                      if (var20 <= 179) {
                        return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                      } else {
                        var19 = var19 >> 1;
                        return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                      }
                    } else {
                      var19 = var19 >> 2;
                      return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                    }
                  } else {
                    var19 = var19 >> 3;
                    return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                  }
                } else {
                  var19 = var19 >> 4;
                  return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                }
              } else {
                L16: {
                  if (0 > var20) {
                    var20 = 0;
                    break L16;
                  } else {
                    if (var20 >= -256) {
                      break L16;
                    } else {
                      var20 = 255;
                      break L16;
                    }
                  }
                }
                L17: {
                  if (243 < var20) {
                    var19 = var19 >> 4;
                    break L17;
                  } else {
                    if (-218 >= var20) {
                      if (192 < var20) {
                        var19 = var19 >> 2;
                        break L17;
                      } else {
                        if (var20 <= 179) {
                          break L17;
                        } else {
                          var19 = var19 >> 1;
                          break L17;
                        }
                      }
                    } else {
                      var19 = var19 >> 3;
                      break L17;
                    }
                  }
                }
                return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
              }
            }
          } else {
            var12 = var12 / 6.0;
            var18 = (int)(256.0 * var12);
            var19 = (int)(256.0 * var14);
            var20 = (int)(var16 * 256.0);
            if (0 > var19) {
              L18: {
                var19 = 0;
                if (0 > var20) {
                  var20 = 0;
                  break L18;
                } else {
                  if (var20 >= -256) {
                    break L18;
                  } else {
                    L19: {
                      var20 = 255;
                      if (243 < var20) {
                        var19 = var19 >> 4;
                        break L19;
                      } else {
                        if (-218 >= var20) {
                          if (192 < var20) {
                            var19 = var19 >> 2;
                            break L19;
                          } else {
                            if (var20 <= 179) {
                              break L19;
                            } else {
                              var19 = var19 >> 1;
                              break L19;
                            }
                          }
                        } else {
                          var19 = var19 >> 3;
                          break L19;
                        }
                      }
                    }
                    return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                  }
                }
              }
              if (243 >= var20) {
                if (-218 <= (var20 ^ -1)) {
                  if (192 >= var20) {
                    if (var20 > 179) {
                      var19 = var19 >> 1;
                      return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                    } else {
                      return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                    }
                  } else {
                    var19 = var19 >> 2;
                    return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                  }
                } else {
                  var19 = var19 >> 3;
                  return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
                }
              } else {
                var19 = var19 >> 4;
                return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
              }
            } else {
              if (var19 <= 255) {
                L20: {
                  if (0 > var20) {
                    var20 = 0;
                    break L20;
                  } else {
                    if (var20 >= -256) {
                      break L20;
                    } else {
                      var20 = 255;
                      break L20;
                    }
                  }
                }
                L21: {
                  if (243 < var20) {
                    var19 = var19 >> 4;
                    break L21;
                  } else {
                    if (-218 >= var20) {
                      if (192 < var20) {
                        var19 = var19 >> 2;
                        break L21;
                      } else {
                        if (var20 <= 179) {
                          break L21;
                        } else {
                          var19 = var19 >> 1;
                          break L21;
                        }
                      }
                    } else {
                      var19 = var19 >> 3;
                      break L21;
                    }
                  }
                }
                return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
              } else {
                L22: {
                  var19 = 255;
                  if (0 > var20) {
                    var20 = 0;
                    break L22;
                  } else {
                    if (var20 >= -256) {
                      break L22;
                    } else {
                      var20 = 255;
                      break L22;
                    }
                  }
                }
                L23: {
                  if (243 < var20) {
                    var19 = var19 >> 4;
                    break L23;
                  } else {
                    if (-218 >= var20) {
                      if (192 < var20) {
                        var19 = var19 >> 2;
                        break L23;
                      } else {
                        if (var20 <= 179) {
                          break L23;
                        } else {
                          var19 = var19 >> 1;
                          break L23;
                        }
                      }
                    } else {
                      var19 = var19 >> 3;
                      break L23;
                    }
                  }
                }
                return ((var18 & 255) >> -1326842270 << 1421518218) - (-(var19 >> 1870965381 << -786722809) + -(var20 >> 238037569));
              }
            }
          }
        } else {
          return -33;
        }
    }

    pe(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((pe) this).field_u = param0;
        ((pe) this).field_t = param2;
        ((pe) this).field_y = param1;
        ((pe) this).field_A = param3;
        ((pe) this).field_z = param4;
        ((pe) this).field_m = param5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Back";
        field_v = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
