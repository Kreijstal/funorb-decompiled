/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends tja {
    private js field_q;
    private byte[] field_s;
    private ta field_g;
    private vm field_n;
    private rf field_d;
    private int field_k;
    private byte[] field_w;
    private cga field_i;
    static String field_t;
    private ea field_r;
    static po field_f;
    private int field_c;
    private ta field_h;
    private int field_o;
    private boolean field_j;
    private eaa field_v;
    private eaa field_l;
    private boolean field_e;
    private int field_u;
    private long field_m;
    private boolean field_p;

    final byte[] a(byte param0, int param1) {
        cga var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
        byte[] stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_5_0 = null;
        try {
          L0: {
            var3 = this.a(0, 123, param1);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              var4 = var3.d((byte) -65);
              var5 = -54 / ((param0 - 49) / 43);
              var3.a(false);
              stackOut_5_0 = (byte[]) var4;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "fp.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        cga var2_ref = null;
        bw var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        byte stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_118_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        byte stackOut_54_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_67_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_65_0 = 0;
        boolean stackOut_99_0 = false;
        int stackOut_117_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                if (((fp) this).field_v != null) {
                  if (null == ((fp) this).b(-82)) {
                    return;
                  } else {
                    L3: {
                      if (((fp) this).field_j) {
                        break L3;
                      } else {
                        L4: {
                          if (((fp) this).field_e) {
                            break L4;
                          } else {
                            ((fp) this).field_v = null;
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var2_int = 1;
                        var3 = ((fp) this).field_v.b((byte) 90);
                        L5: while (true) {
                          L6: {
                            L7: {
                              if (null == var3) {
                                break L7;
                              } else {
                                var4 = (int)var3.field_c;
                                stackOut_17_0 = ((fp) this).field_s[var4];
                                stackOut_17_1 = 1;
                                stackIn_29_0 = stackOut_17_0;
                                stackIn_29_1 = stackOut_17_1;
                                stackIn_18_0 = stackOut_17_0;
                                stackIn_18_1 = stackOut_17_1;
                                if (var5 != 0) {
                                  L8: while (true) {
                                    if (stackIn_29_0 <= stackIn_29_1) {
                                      break L6;
                                    } else {
                                      stackOut_30_0 = -1;
                                      stackOut_30_1 = ~((fp) this).field_d.field_e[((fp) this).field_u];
                                      stackIn_119_0 = stackOut_30_0;
                                      stackIn_119_1 = stackOut_30_1;
                                      stackIn_31_0 = stackOut_30_0;
                                      stackIn_31_1 = stackOut_30_1;
                                      if (var5 != 0) {
                                        break L1;
                                      } else {
                                        stackOut_31_0 = stackIn_31_0;
                                        stackOut_31_1 = stackIn_31_1;
                                        stackIn_33_0 = stackOut_31_0;
                                        stackIn_33_1 = stackOut_31_1;
                                        L9: {
                                          L10: {
                                            if (stackIn_33_0 == stackIn_33_1) {
                                              ((fp) this).field_u = ((fp) this).field_u + 1;
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L10;
                                              }
                                            } else {
                                              break L10;
                                            }
                                          }
                                          L11: {
                                            if (!((fp) this).field_n.a(false)) {
                                              break L11;
                                            } else {
                                              var2_int = 0;
                                              if (var5 == 0) {
                                                break L6;
                                              } else {
                                                break L11;
                                              }
                                            }
                                          }
                                          L12: {
                                            if (1 == ((fp) this).field_s[((fp) this).field_u]) {
                                              break L12;
                                            } else {
                                              cga discarded$4 = this.a(2, -107, ((fp) this).field_u);
                                              break L12;
                                            }
                                          }
                                          L13: {
                                            if (((fp) this).field_s[((fp) this).field_u] == 1) {
                                              break L13;
                                            } else {
                                              var3 = new bw();
                                              var3.field_c = (long)((fp) this).field_u;
                                              var2_int = 0;
                                              ((fp) this).field_v.a(var3, true);
                                              break L13;
                                            }
                                          }
                                          ((fp) this).field_u = ((fp) this).field_u + 1;
                                          if (var5 == 0) {
                                            break L9;
                                          } else {
                                            break L6;
                                          }
                                        }
                                        stackOut_28_0 = ~((fp) this).field_u;
                                        stackOut_28_1 = ~((fp) this).field_d.field_e.length;
                                        stackIn_29_0 = stackOut_28_0;
                                        stackIn_29_1 = stackOut_28_1;
                                        continue L8;
                                      }
                                    }
                                  }
                                } else {
                                  L14: {
                                    if (stackIn_18_0 != stackIn_18_1) {
                                      cga discarded$5 = this.a(2, param0 + -14193, var4);
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    L16: {
                                      if (1 == ((fp) this).field_s[var4]) {
                                        break L16;
                                      } else {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L15;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var3.a(false);
                                    break L15;
                                  }
                                  var3 = ((fp) this).field_v.c(0);
                                  if (var5 == 0) {
                                    continue L5;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                            L17: while (true) {
                              stackOut_28_0 = ~((fp) this).field_u;
                              stackOut_28_1 = ~((fp) this).field_d.field_e.length;
                              stackIn_29_0 = stackOut_28_0;
                              stackIn_29_1 = stackOut_28_1;
                              if (stackIn_29_0 <= stackIn_29_1) {
                                break L6;
                              } else {
                                stackOut_30_0 = -1;
                                stackOut_30_1 = ~((fp) this).field_d.field_e[((fp) this).field_u];
                                stackIn_119_0 = stackOut_30_0;
                                stackIn_119_1 = stackOut_30_1;
                                stackIn_31_0 = stackOut_30_0;
                                stackIn_31_1 = stackOut_30_1;
                                if (var5 != 0) {
                                  break L1;
                                } else {
                                  stackOut_31_0 = stackIn_31_0;
                                  stackOut_31_1 = stackIn_31_1;
                                  stackIn_33_0 = stackOut_31_0;
                                  stackIn_33_1 = stackOut_31_1;
                                  L18: {
                                    if (stackIn_33_0 == stackIn_33_1) {
                                      ((fp) this).field_u = ((fp) this).field_u + 1;
                                      if (var5 == 0) {
                                        continue L17;
                                      } else {
                                        break L18;
                                      }
                                    } else {
                                      break L18;
                                    }
                                  }
                                  L19: {
                                    if (!((fp) this).field_n.a(false)) {
                                      break L19;
                                    } else {
                                      var2_int = 0;
                                      if (var5 == 0) {
                                        break L6;
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  L20: {
                                    if (1 == ((fp) this).field_s[((fp) this).field_u]) {
                                      break L20;
                                    } else {
                                      cga discarded$4 = this.a(2, -107, ((fp) this).field_u);
                                      break L20;
                                    }
                                  }
                                  L21: {
                                    if (((fp) this).field_s[((fp) this).field_u] == 1) {
                                      break L21;
                                    } else {
                                      var3 = new bw();
                                      var3.field_c = (long)((fp) this).field_u;
                                      var2_int = 0;
                                      ((fp) this).field_v.a(var3, true);
                                      break L21;
                                    }
                                  }
                                  ((fp) this).field_u = ((fp) this).field_u + 1;
                                  if (var5 == 0) {
                                    continue L17;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (var2_int == 0) {
                              break L22;
                            } else {
                              ((fp) this).field_e = false;
                              ((fp) this).field_u = 0;
                              break L22;
                            }
                          }
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((fp) this).field_v.b((byte) 90);
                    L23: while (true) {
                      L24: {
                        L25: {
                          if (null == var3) {
                            break L25;
                          } else {
                            var4 = (int)var3.field_c;
                            stackOut_54_0 = ((fp) this).field_s[var4];
                            stackIn_66_0 = stackOut_54_0;
                            stackIn_55_0 = stackOut_54_0;
                            if (var5 != 0) {
                              L26: while (true) {
                                if (stackIn_66_0 <= ((fp) this).field_u) {
                                  break L24;
                                } else {
                                  stackOut_67_0 = 0;
                                  stackOut_67_1 = ((fp) this).field_d.field_e[((fp) this).field_u];
                                  stackIn_119_0 = stackOut_67_0;
                                  stackIn_119_1 = stackOut_67_1;
                                  stackIn_68_0 = stackOut_67_0;
                                  stackIn_68_1 = stackOut_67_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_68_0 = stackIn_68_0;
                                    stackOut_68_1 = stackIn_68_1;
                                    stackIn_70_0 = stackOut_68_0;
                                    stackIn_70_1 = stackOut_68_1;
                                    L27: {
                                      L28: {
                                        if (stackIn_70_0 == stackIn_70_1) {
                                          ((fp) this).field_u = ((fp) this).field_u + 1;
                                          if (var5 == 0) {
                                            break L27;
                                          } else {
                                            break L28;
                                          }
                                        } else {
                                          break L28;
                                        }
                                      }
                                      L29: {
                                        if (((fp) this).field_r.field_b < 250) {
                                          break L29;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L24;
                                          } else {
                                            break L29;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (((fp) this).field_s[((fp) this).field_u] != 0) {
                                          break L30;
                                        } else {
                                          cga discarded$6 = this.a(1, 34, ((fp) this).field_u);
                                          break L30;
                                        }
                                      }
                                      L31: {
                                        if (0 == ((fp) this).field_s[((fp) this).field_u]) {
                                          var3 = new bw();
                                          var3.field_c = (long)((fp) this).field_u;
                                          var2_int = 0;
                                          ((fp) this).field_v.a(var3, true);
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      ((fp) this).field_u = ((fp) this).field_u + 1;
                                      if (var5 == 0) {
                                        break L27;
                                      } else {
                                        break L24;
                                      }
                                    }
                                    stackOut_65_0 = ((fp) this).field_d.field_e.length;
                                    stackIn_66_0 = stackOut_65_0;
                                    continue L26;
                                  }
                                }
                              }
                            } else {
                              L32: {
                                if (stackIn_55_0 == 0) {
                                  cga discarded$7 = this.a(1, 127, var4);
                                  break L32;
                                } else {
                                  break L32;
                                }
                              }
                              L33: {
                                L34: {
                                  if (0 != ((fp) this).field_s[var4]) {
                                    break L34;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L33;
                                    } else {
                                      break L34;
                                    }
                                  }
                                }
                                var3.a(false);
                                break L33;
                              }
                              var3 = ((fp) this).field_v.c(0);
                              if (var5 == 0) {
                                continue L23;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        L35: while (true) {
                          stackOut_65_0 = ((fp) this).field_d.field_e.length;
                          stackIn_66_0 = stackOut_65_0;
                          if (stackIn_66_0 <= ((fp) this).field_u) {
                            break L24;
                          } else {
                            stackOut_67_0 = 0;
                            stackOut_67_1 = ((fp) this).field_d.field_e[((fp) this).field_u];
                            stackIn_119_0 = stackOut_67_0;
                            stackIn_119_1 = stackOut_67_1;
                            stackIn_68_0 = stackOut_67_0;
                            stackIn_68_1 = stackOut_67_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_68_0 = stackIn_68_0;
                              stackOut_68_1 = stackIn_68_1;
                              stackIn_70_0 = stackOut_68_0;
                              stackIn_70_1 = stackOut_68_1;
                              L36: {
                                if (stackIn_70_0 == stackIn_70_1) {
                                  ((fp) this).field_u = ((fp) this).field_u + 1;
                                  if (var5 == 0) {
                                    continue L35;
                                  } else {
                                    break L36;
                                  }
                                } else {
                                  break L36;
                                }
                              }
                              L37: {
                                if (((fp) this).field_r.field_b < 250) {
                                  break L37;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L24;
                                  } else {
                                    break L37;
                                  }
                                }
                              }
                              L38: {
                                if (((fp) this).field_s[((fp) this).field_u] != 0) {
                                  break L38;
                                } else {
                                  cga discarded$6 = this.a(1, 34, ((fp) this).field_u);
                                  break L38;
                                }
                              }
                              L39: {
                                if (0 == ((fp) this).field_s[((fp) this).field_u]) {
                                  var3 = new bw();
                                  var3.field_c = (long)((fp) this).field_u;
                                  var2_int = 0;
                                  ((fp) this).field_v.a(var3, true);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              ((fp) this).field_u = ((fp) this).field_u + 1;
                              if (var5 == 0) {
                                continue L35;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int != 0) {
                        ((fp) this).field_u = 0;
                        ((fp) this).field_j = false;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              L40: {
                L41: {
                  if (!((fp) this).field_p) {
                    break L41;
                  } else {
                    if (((fp) this).field_m <= f.b((byte) 73)) {
                      var2_ref = (cga) (Object) ((fp) this).field_q.b(-13023);
                      L42: while (true) {
                        L43: {
                          if (var2_ref == null) {
                            break L43;
                          } else {
                            stackOut_99_0 = var2_ref.field_n;
                            stackIn_118_0 = stackOut_99_0 ? 1 : 0;
                            stackIn_100_0 = stackOut_99_0;
                            if (var5 != 0) {
                              break L40;
                            } else {
                              L44: {
                                if (stackIn_100_0) {
                                  break L44;
                                } else {
                                  L45: {
                                    if (var2_ref.field_o) {
                                      break L45;
                                    } else {
                                      var2_ref.field_o = true;
                                      if (var5 == 0) {
                                        break L44;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                  if (var2_ref.field_q) {
                                    var2_ref.a(false);
                                    break L44;
                                  } else {
                                    throw new RuntimeException();
                                  }
                                }
                              }
                              var2_ref = (cga) (Object) ((fp) this).field_q.c(-21446);
                              if (var5 == 0) {
                                continue L42;
                              } else {
                                break L43;
                              }
                            }
                          }
                        }
                        ((fp) this).field_m = f.b((byte) 73) - -1000L;
                        break L41;
                      }
                    } else {
                      break L41;
                    }
                  }
                }
                stackOut_117_0 = param0;
                stackIn_118_0 = stackOut_117_0;
                break L40;
              }
              stackOut_118_0 = stackIn_118_0;
              stackOut_118_1 = 14075;
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              break L1;
            }
            L46: {
              if (stackIn_119_0 == stackIn_119_1) {
                break L46;
              } else {
                ((fp) this).field_m = -36L;
                break L46;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "fp.D(" + param0 + ')');
        }
    }

    final void a(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((fp) this).field_h != null) {
              L1: {
                if (param0 == 90) {
                  break L1;
                } else {
                  ((fp) this).a((byte) 110);
                  break L1;
                }
              }
              L2: {
                ((fp) this).field_e = true;
                if (((fp) this).field_v != null) {
                  break L2;
                } else {
                  ((fp) this).field_v = new eaa();
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "fp.G(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        cga var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            var3 = (cga) (Object) ((fp) this).field_q.a(true, (long)param1);
            if (var3 != null) {
              stackOut_3_0 = var3.e(-6298);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (param0 == 8192) {
                  break L1;
                } else {
                  int discarded$2 = ((fp) this).a(-44, -17);
                  break L1;
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var3_ref, "fp.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    private final cga a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        Exception var7 = null;
        RuntimeException var7_ref = null;
        int var7_int = 0;
        int var8_int = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_60_0 = null;
        byte stackIn_80_0 = 0;
        byte stackIn_80_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        Object stackIn_99_0 = null;
        Object stackIn_106_0 = null;
        int stackIn_126_0 = 0;
        int stackIn_126_1 = 0;
        Object stackIn_142_0 = null;
        int stackIn_147_0 = 0;
        int stackIn_147_1 = 0;
        Object stackIn_155_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_51_0 = null;
        Object stackOut_41_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_125_0 = 0;
        int stackOut_125_1 = 0;
        Object stackOut_141_0 = null;
        int stackOut_146_0 = 0;
        int stackOut_146_1 = 0;
        Object stackOut_154_0 = null;
        byte stackOut_79_0 = 0;
        byte stackOut_79_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        Object stackOut_98_0 = null;
        Object stackOut_105_0 = null;
        var11 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4 = (Object) (Object) (cga) (Object) ((fp) this).field_q.a(true, (long)param2);
              if (var4 == null) {
                break L1;
              } else {
                if (0 != param0) {
                  break L1;
                } else {
                  if (((cga) var4).field_q) {
                    break L1;
                  } else {
                    if (((cga) var4).field_n) {
                      ((cga) var4).a(false);
                      var4 = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            L2: {
              if (var4 != null) {
                break L2;
              } else {
                L3: {
                  if (param0 == 0) {
                    L4: {
                      L5: {
                        if (((fp) this).field_h == null) {
                          break L5;
                        } else {
                          if (((fp) this).field_s[param2] != -1) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (!((fp) this).field_n.b(20)) {
                        var4 = (Object) (Object) ((fp) this).field_n.a(((fp) this).field_o, param2, 127, (byte) 2, true);
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        stackOut_51_0 = null;
                        stackIn_52_0 = stackOut_51_0;
                        return (cga) (Object) stackIn_52_0;
                      }
                    }
                    var4 = (Object) (Object) ((fp) this).field_r.a(param2, (byte) 112, ((fp) this).field_h);
                    break L3;
                  } else {
                    L6: {
                      if (1 != param0) {
                        break L6;
                      } else {
                        if (((fp) this).field_h != null) {
                          var4 = (Object) (Object) ((fp) this).field_r.a(((fp) this).field_h, (byte) -124, param2);
                          if (var11 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    }
                    if (param0 != 2) {
                      throw new RuntimeException();
                    } else {
                      if (((fp) this).field_h != null) {
                        if (((fp) this).field_s[param2] != -1) {
                          throw new RuntimeException();
                        } else {
                          L7: {
                            if (((fp) this).field_n.a(false)) {
                              break L7;
                            } else {
                              var4 = (Object) (Object) ((fp) this).field_n.a(((fp) this).field_o, param2, 126, (byte) 2, false);
                              if (var11 == 0) {
                                break L3;
                              } else {
                                break L7;
                              }
                            }
                          }
                          stackOut_41_0 = null;
                          stackIn_42_0 = stackOut_41_0;
                          return (cga) (Object) stackIn_42_0;
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                }
                ((fp) this).field_q.a((long)param2, (byte) -93, (bw) var4);
                break L2;
              }
            }
            if (((cga) var4).field_n) {
              stackOut_59_0 = null;
              stackIn_60_0 = stackOut_59_0;
              return (cga) (Object) stackIn_60_0;
            } else {
              var6 = -4 / ((param1 - -42) / 59);
              var5 = ((cga) var4).d((byte) -65);
              if (!(var4 instanceof se)) {
                try {
                  L8: {
                    L9: {
                      if (var5 == null) {
                        break L9;
                      } else {
                        if (var5.length > 2) {
                          gt.field_l.reset();
                          gt.field_l.update(var5, 0, var5.length - 2);
                          var7_int = (int)gt.field_l.getValue();
                          if (((fp) this).field_d.field_p[param2] != var7_int) {
                            throw new RuntimeException();
                          } else {
                            L10: {
                              if (null == ((fp) this).field_d.field_g) {
                                break L10;
                              } else {
                                if (null != ((fp) this).field_d.field_g[param2]) {
                                  var8 = ((fp) this).field_d.field_g[param2];
                                  var9 = ln.a(-2 + var5.length, var5, 0, 8);
                                  var10 = 0;
                                  L11: while (true) {
                                    if (var10 >= 64) {
                                      break L10;
                                    } else {
                                      stackOut_125_0 = ~var9[var10];
                                      stackOut_125_1 = ~var8[var10];
                                      stackIn_147_0 = stackOut_125_0;
                                      stackIn_147_1 = stackOut_125_1;
                                      stackIn_126_0 = stackOut_125_0;
                                      stackIn_126_1 = stackOut_125_1;
                                      if (var11 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L8;
                                      } else {
                                        if (stackIn_126_0 != stackIn_126_1) {
                                          throw new RuntimeException();
                                        } else {
                                          var10++;
                                          if (var11 == 0) {
                                            continue L11;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L10;
                                }
                              }
                            }
                            ((fp) this).field_n.field_e = 0;
                            ((fp) this).field_n.field_k = 0;
                            decompiledRegionSelector0 = 1;
                            break L8;
                          }
                        } else {
                          break L9;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L12: {
                    var7_ref = (RuntimeException) (Object) decompiledCaughtException;
                    ((fp) this).field_n.b((byte) 109);
                    ((cga) var4).a(false);
                    if (!((cga) var4).field_q) {
                      break L12;
                    } else {
                      if (!((fp) this).field_n.b(20)) {
                        var4 = (Object) (Object) ((fp) this).field_n.a(((fp) this).field_o, param2, 126, (byte) 2, true);
                        ((fp) this).field_q.a((long)param2, (byte) -77, (bw) var4);
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                  }
                  stackOut_141_0 = null;
                  stackIn_142_0 = stackOut_141_0;
                  return (cga) (Object) stackIn_142_0;
                }
                L13: {
                  L14: {
                    if (decompiledRegionSelector0 == 0) {
                      break L14;
                    } else {
                      var5[-2 + var5.length] = (byte)(((fp) this).field_d.field_i[param2] >>> -533934424);
                      var5[-1 + var5.length] = (byte)((fp) this).field_d.field_i[param2];
                      if (((fp) this).field_h != null) {
                        se discarded$1 = ((fp) this).field_r.a(((fp) this).field_h, var5, param2, 5);
                        stackOut_146_0 = ~((fp) this).field_s[param2];
                        stackOut_146_1 = -2;
                        stackIn_147_0 = stackOut_146_0;
                        stackIn_147_1 = stackOut_146_1;
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (stackIn_147_0 != stackIn_147_1) {
                    ((fp) this).field_s[param2] = (byte) 1;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L15: {
                  if (!((cga) var4).field_q) {
                    ((cga) var4).a(false);
                    break L15;
                  } else {
                    break L15;
                  }
                }
                stackOut_154_0 = var4;
                stackIn_155_0 = stackOut_154_0;
                break L0;
              } else {
                try {
                  L16: {
                    L17: {
                      if (null == var5) {
                        break L17;
                      } else {
                        if (var5.length > 2) {
                          gt.field_l.reset();
                          gt.field_l.update(var5, 0, -2 + var5.length);
                          var7_int = (int)gt.field_l.getValue();
                          if (~((fp) this).field_d.field_p[param2] == ~var7_int) {
                            L18: {
                              L19: {
                                if (null == ((fp) this).field_d.field_g) {
                                  break L19;
                                } else {
                                  if (null != ((fp) this).field_d.field_g[param2]) {
                                    var8 = ((fp) this).field_d.field_g[param2];
                                    var9 = ln.a(var5.length + -2, var5, 0, 8);
                                    var10 = 0;
                                    L20: while (true) {
                                      if (var10 >= 64) {
                                        break L19;
                                      } else {
                                        stackOut_79_0 = var8[var10];
                                        stackOut_79_1 = var9[var10];
                                        stackIn_87_0 = stackOut_79_0;
                                        stackIn_87_1 = stackOut_79_1;
                                        stackIn_80_0 = stackOut_79_0;
                                        stackIn_80_1 = stackOut_79_1;
                                        if (var11 != 0) {
                                          break L18;
                                        } else {
                                          if (stackIn_80_0 == stackIn_80_1) {
                                            var10++;
                                            if (var11 == 0) {
                                              continue L20;
                                            } else {
                                              break L19;
                                            }
                                          } else {
                                            throw new RuntimeException();
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                              stackOut_86_0 = (255 & var5[-2 + var5.length]) << 1760271336;
                              stackOut_86_1 = 255 & var5[var5.length + -1];
                              stackIn_87_0 = stackOut_86_0;
                              stackIn_87_1 = stackOut_86_1;
                              break L18;
                            }
                            var8_int = stackIn_87_0 + stackIn_87_1;
                            if (var8_int == (((fp) this).field_d.field_i[param2] & 65535)) {
                              L21: {
                                if (1 != ((fp) this).field_s[param2]) {
                                  L22: {
                                    if (((fp) this).field_s[param2] != 0) {
                                      break L22;
                                    } else {
                                      break L22;
                                    }
                                  }
                                  ((fp) this).field_s[param2] = (byte) 1;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              L23: {
                                if (((cga) var4).field_q) {
                                  break L23;
                                } else {
                                  ((cga) var4).a(false);
                                  break L23;
                                }
                              }
                              stackOut_98_0 = var4;
                              stackIn_99_0 = stackOut_98_0;
                              break L16;
                            } else {
                              throw new RuntimeException();
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        } else {
                          break L17;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L24: {
                    var7 = (Exception) (Object) decompiledCaughtException;
                    ((fp) this).field_s[param2] = (byte) -1;
                    ((cga) var4).a(false);
                    if (!((cga) var4).field_q) {
                      break L24;
                    } else {
                      if (((fp) this).field_n.b(20)) {
                        break L24;
                      } else {
                        var4 = (Object) (Object) ((fp) this).field_n.a(((fp) this).field_o, param2, 127, (byte) 2, true);
                        ((fp) this).field_q.a((long)param2, (byte) -38, (bw) var4);
                        break L24;
                      }
                    }
                  }
                  stackOut_105_0 = null;
                  stackIn_106_0 = stackOut_105_0;
                  return (cga) (Object) stackIn_106_0;
                }
                return (cga) (Object) stackIn_99_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw pe.a((Throwable) var4, "fp.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return (cga) (Object) stackIn_155_0;
    }

    final rf b(int param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        rf stackIn_5_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_53_0 = null;
        rf stackIn_63_0 = null;
        RuntimeException decompiledCaughtException = null;
        rf stackOut_4_0 = null;
        Object stackOut_15_0 = null;
        Object stackOut_21_0 = null;
        Object stackOut_52_0 = null;
        Object stackOut_38_0 = null;
        rf stackOut_62_0 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            if (null != ((fp) this).field_d) {
              stackOut_4_0 = ((fp) this).field_d;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (param0 < -7) {
                  break L1;
                } else {
                  int discarded$2 = ((fp) this).a(74, 4);
                  break L1;
                }
              }
              L2: {
                if (((fp) this).field_i != null) {
                  break L2;
                } else {
                  if (((fp) this).field_n.b(20)) {
                    stackOut_15_0 = null;
                    stackIn_16_0 = stackOut_15_0;
                    return (rf) (Object) stackIn_16_0;
                  } else {
                    ((fp) this).field_i = (cga) (Object) ((fp) this).field_n.a(255, ((fp) this).field_o, 127, (byte) 0, true);
                    break L2;
                  }
                }
              }
              if (((fp) this).field_i.field_n) {
                stackOut_21_0 = null;
                stackIn_22_0 = stackOut_21_0;
                return (rf) (Object) stackIn_22_0;
              } else {
                L3: {
                  var2_array = ((fp) this).field_i.d((byte) -65);
                  if (!(((fp) this).field_i instanceof se)) {
                    try {
                      L4: {
                        if (null == var2_array) {
                          throw new RuntimeException();
                        } else {
                          ((fp) this).field_d = new rf(var2_array, ((fp) this).field_k, ((fp) this).field_w);
                          break L4;
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        L6: {
                          var3 = decompiledCaughtException;
                          ((fp) this).field_n.b((byte) -93);
                          ((fp) this).field_d = null;
                          if (((fp) this).field_n.b(20)) {
                            break L6;
                          } else {
                            ((fp) this).field_i = (cga) (Object) ((fp) this).field_n.a(255, ((fp) this).field_o, 122, (byte) 0, true);
                            if (var4 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        ((fp) this).field_i = null;
                        break L5;
                      }
                      stackOut_52_0 = null;
                      stackIn_53_0 = stackOut_52_0;
                      return (rf) (Object) stackIn_53_0;
                    }
                    if (null != ((fp) this).field_g) {
                      se discarded$3 = ((fp) this).field_r.a(((fp) this).field_g, var2_array, ((fp) this).field_o, 5);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    try {
                      L7: {
                        if (var2_array == null) {
                          throw new RuntimeException();
                        } else {
                          ((fp) this).field_d = new rf(var2_array, ((fp) this).field_k, ((fp) this).field_w);
                          if (((fp) this).field_d.field_r == ((fp) this).field_c) {
                            break L7;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L8: {
                        L9: {
                          var3 = decompiledCaughtException;
                          ((fp) this).field_d = null;
                          if (!((fp) this).field_n.b(20)) {
                            break L9;
                          } else {
                            ((fp) this).field_i = null;
                            if (var4 == 0) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        ((fp) this).field_i = (cga) (Object) ((fp) this).field_n.a(255, ((fp) this).field_o, 124, (byte) 0, true);
                        break L8;
                      }
                      stackOut_38_0 = null;
                      stackIn_39_0 = stackOut_38_0;
                      return (rf) (Object) stackIn_39_0;
                    }
                    break L3;
                  }
                }
                L10: {
                  ((fp) this).field_i = null;
                  if (null != ((fp) this).field_h) {
                    ((fp) this).field_s = new byte[((fp) this).field_d.field_f];
                    break L10;
                  } else {
                    break L10;
                  }
                }
                stackOut_62_0 = ((fp) this).field_d;
                stackIn_63_0 = stackOut_62_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "fp.H(" + param0 + ')');
        }
        return stackIn_63_0;
    }

    final void e(int param0) {
        RuntimeException var2 = null;
        bw var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param0 >= 44) {
                break L1;
              } else {
                ((fp) this).field_p = true;
                break L1;
              }
            }
            if (((fp) this).field_v != null) {
              if (((fp) this).b(-24) == null) {
                return;
              } else {
                var2_ref = ((fp) this).field_l.b((byte) 90);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (null == var2_ref) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_c;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (var3 >= ((fp) this).field_d.field_f) {
                                    break L7;
                                  } else {
                                    if (((fp) this).field_d.field_e[var3] != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              var2_ref.a(false);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((fp) this).field_s[var3] != 0) {
                                break L8;
                              } else {
                                cga discarded$2 = this.a(1, -111, var3);
                                break L8;
                              }
                            }
                            L9: {
                              if (-1 != ((fp) this).field_s[var3]) {
                                break L9;
                              } else {
                                cga discarded$3 = this.a(2, -116, var3);
                                break L9;
                              }
                            }
                            if (((fp) this).field_s[var3] != 1) {
                              break L5;
                            } else {
                              var2_ref.a(false);
                              break L5;
                            }
                          }
                          var2_ref = ((fp) this).field_l.c(0);
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    break L3;
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2, "fp.E(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        try {
            field_t = null;
            int var1_int = 5 % ((-59 - param0) / 47);
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "fp.B(" + param0 + ')');
        }
    }

    fp(int param0, ta param1, ta param2, vm param3, ea param4, int param5, byte[] param6, int param7, boolean param8) {
        RuntimeException var10 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        ((fp) this).field_q = new js(16);
        ((fp) this).field_u = 0;
        ((fp) this).field_l = new eaa();
        ((fp) this).field_m = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((fp) this).field_h = param1;
                ((fp) this).field_o = param0;
                if (((fp) this).field_h != null) {
                  break L2;
                } else {
                  ((fp) this).field_j = false;
                  if (BachelorFridge.field_y == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((fp) this).field_j = true;
              ((fp) this).field_v = new eaa();
              break L1;
            }
            L3: {
              ((fp) this).field_r = param4;
              ((fp) this).field_w = param6;
              ((fp) this).field_p = param8;
              ((fp) this).field_c = param7;
              ((fp) this).field_k = param5;
              ((fp) this).field_g = param2;
              ((fp) this).field_n = param3;
              if (null != ((fp) this).field_g) {
                ((fp) this).field_i = (cga) (Object) ((fp) this).field_r.a(((fp) this).field_o, (byte) -124, ((fp) this).field_g);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var10;
            stackOut_10_1 = new StringBuilder().append("fp.<init>(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L6;
            }
          }
          L7: {
            stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
            stackOut_22_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L7;
            }
          }
          L8: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',').append(param5).append(',');
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param6 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L8;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Here you can see your creatures actions, stats and description. Clicking on an unequipped action will equip it, ready to be used in the Arena. You must equip at least one move type action, and one attack type action. Assign all your actions now.";
    }
}
