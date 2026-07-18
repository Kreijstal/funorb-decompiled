/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class de extends wd {
    static String field_z;
    private lb field_y;
    private kh field_g;
    private byte[] field_x;
    private int field_i;
    private tg field_v;
    static il field_q;
    private byte[] field_m;
    private n field_s;
    private ik field_j;
    private ik field_u;
    private int field_t;
    private int field_l;
    private gb field_k;
    private boolean field_h;
    private int field_w;
    private vd field_n;
    private boolean field_p;
    private vd field_A;
    private long field_o;
    private boolean field_r;

    final void f(int param0) {
        if (param0 <= 49) {
            ((de) this).field_n = null;
        }
        if (((de) this).field_j == null) {
            return;
        }
        try {
            ((de) this).field_h = true;
            if (((de) this).field_A == null) {
                ((de) this).field_A = new vd();
            }
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "de.H(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        gi var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                int discarded$3 = ((de) this).a(-70, 35);
                break L1;
              }
            }
            if (((de) this).field_A != null) {
              if (((de) this).a((byte) -101) == null) {
                return;
              } else {
                var2_ref = ((de) this).field_n.h(-11151);
                L2: while (true) {
                  L3: {
                    L4: {
                      if (var2_ref == null) {
                        break L4;
                      } else {
                        var3 = (int)var2_ref.field_g;
                        if (var4 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 < 0) {
                                  break L7;
                                } else {
                                  if (var3 >= ((de) this).field_g.field_m) {
                                    break L7;
                                  } else {
                                    if (0 == ((de) this).field_g.field_k[var3]) {
                                      break L7;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                              var2_ref.a(-16175);
                              if (var4 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                            L8: {
                              if (((de) this).field_m[var3] == 0) {
                                lb discarded$4 = this.a(65, var3, 1);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                            L9: {
                              if (((de) this).field_m[var3] == -1) {
                                lb discarded$5 = this.a(65, var3, 2);
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            if (((de) this).field_m[var3] == 1) {
                              var2_ref.a(-16175);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var2_ref = ((de) this).field_n.e(0);
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
          throw ie.a((Throwable) (Object) var2, "de.I(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 114) {
                break L1;
              } else {
                field_z = null;
                break L1;
              }
            }
            field_z = null;
            field_q = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "de.A(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        lb var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3 = (lb) (Object) ((de) this).field_v.a(true, (long)param0);
            if (param1 == -1) {
              if (var3 != null) {
                stackOut_6_0 = var3.g(-58);
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 94;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3_ref, "de.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final static boolean a(char param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == -17321) {
              L1: {
                L2: {
                  L3: {
                    if (param0 < 48) {
                      break L3;
                    } else {
                      if (param0 <= 57) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (65 > param0) {
                      break L4;
                    } else {
                      if (param0 <= 90) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (97 > param0) {
                      break L5;
                    } else {
                      if (param0 > 122) {
                        break L5;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  break L1;
                }
                stackOut_19_0 = 1;
                stackIn_22_0 = stackOut_19_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "de.E(" + param0 + ',' + param1 + ')');
        }
        return stackIn_22_0 != 0;
    }

    final byte[] b(int param0, int param1) {
        lb var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param1 == 60) {
              var3 = this.a(65, param0, 0);
              if (var3 == null) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              } else {
                var4 = var3.i(13095);
                var3.a(-16175);
                stackOut_8_0 = (byte[]) var4;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var3_ref, "de.J(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final void c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        lb var2_ref = null;
        gi var3 = null;
        int var4 = 0;
        int var5 = 0;
        byte stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_69_0 = 0;
        int stackIn_69_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        RuntimeException decompiledCaughtException = null;
        byte stackOut_7_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_68_0 = 0;
        int stackOut_68_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((de) this).field_A) {
                  break L2;
                } else {
                  if (((de) this).a((byte) -57) != null) {
                    L3: {
                      if (!((de) this).field_p) {
                        break L3;
                      } else {
                        var2_int = 1;
                        var3 = ((de) this).field_A.h(param0 ^ -11248);
                        L4: while (true) {
                          L5: {
                            L6: {
                              L7: {
                                if (var3 == null) {
                                  break L7;
                                } else {
                                  var4 = (int)var3.field_g;
                                  stackOut_7_0 = ((de) this).field_m[var4];
                                  stackIn_20_0 = stackOut_7_0;
                                  stackIn_8_0 = stackOut_7_0;
                                  if (var5 != 0) {
                                    L8: while (true) {
                                      if (stackIn_20_0 <= ~((de) this).field_g.field_k.length) {
                                        break L6;
                                      } else {
                                        stackOut_21_0 = ((de) this).field_g.field_k[((de) this).field_w];
                                        stackIn_45_0 = stackOut_21_0;
                                        stackIn_22_0 = stackOut_21_0;
                                        if (var5 != 0) {
                                          break L5;
                                        } else {
                                          stackOut_22_0 = stackIn_22_0;
                                          stackIn_24_0 = stackOut_22_0;
                                          L9: {
                                            L10: {
                                              if (stackIn_24_0 == 0) {
                                                ((de) this).field_w = ((de) this).field_w + 1;
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
                                              if (((de) this).field_s.field_e >= 250) {
                                                var2_int = 0;
                                                if (var5 == 0) {
                                                  break L6;
                                                } else {
                                                  break L11;
                                                }
                                              } else {
                                                break L11;
                                              }
                                            }
                                            L12: {
                                              if (((de) this).field_m[((de) this).field_w] == 0) {
                                                lb discarded$4 = this.a(65, ((de) this).field_w, 1);
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            L13: {
                                              if (((de) this).field_m[((de) this).field_w] == 0) {
                                                var3 = new gi();
                                                var3.field_g = (long)((de) this).field_w;
                                                var2_int = 0;
                                                ((de) this).field_A.a(var3, 255);
                                                break L13;
                                              } else {
                                                break L13;
                                              }
                                            }
                                            ((de) this).field_w = ((de) this).field_w + 1;
                                            if (var5 == 0) {
                                              break L9;
                                            } else {
                                              break L6;
                                            }
                                          }
                                          stackOut_19_0 = ~((de) this).field_w;
                                          stackIn_20_0 = stackOut_19_0;
                                          continue L8;
                                        }
                                      }
                                    }
                                  } else {
                                    L14: {
                                      if (stackIn_8_0 != 0) {
                                        break L14;
                                      } else {
                                        lb discarded$5 = this.a(65, var4, 1);
                                        break L14;
                                      }
                                    }
                                    L15: {
                                      L16: {
                                        if (((de) this).field_m[var4] == 0) {
                                          break L16;
                                        } else {
                                          var3.a(-16175);
                                          if (var5 == 0) {
                                            break L15;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      var2_int = 0;
                                      break L15;
                                    }
                                    var3 = ((de) this).field_A.e(param0 + -97);
                                    if (var5 == 0) {
                                      continue L4;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                              L17: while (true) {
                                stackOut_19_0 = ~((de) this).field_w;
                                stackIn_20_0 = stackOut_19_0;
                                if (stackIn_20_0 <= ~((de) this).field_g.field_k.length) {
                                  break L6;
                                } else {
                                  stackOut_21_0 = ((de) this).field_g.field_k[((de) this).field_w];
                                  stackIn_45_0 = stackOut_21_0;
                                  stackIn_22_0 = stackOut_21_0;
                                  if (var5 != 0) {
                                    break L5;
                                  } else {
                                    stackOut_22_0 = stackIn_22_0;
                                    stackIn_24_0 = stackOut_22_0;
                                    L18: {
                                      if (stackIn_24_0 == 0) {
                                        ((de) this).field_w = ((de) this).field_w + 1;
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
                                      if (((de) this).field_s.field_e >= 250) {
                                        var2_int = 0;
                                        if (var5 == 0) {
                                          break L6;
                                        } else {
                                          break L19;
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                    L20: {
                                      if (((de) this).field_m[((de) this).field_w] == 0) {
                                        lb discarded$4 = this.a(65, ((de) this).field_w, 1);
                                        break L20;
                                      } else {
                                        break L20;
                                      }
                                    }
                                    L21: {
                                      if (((de) this).field_m[((de) this).field_w] == 0) {
                                        var3 = new gi();
                                        var3.field_g = (long)((de) this).field_w;
                                        var2_int = 0;
                                        ((de) this).field_A.a(var3, 255);
                                        break L21;
                                      } else {
                                        break L21;
                                      }
                                    }
                                    ((de) this).field_w = ((de) this).field_w + 1;
                                    if (var5 == 0) {
                                      continue L17;
                                    } else {
                                      break L6;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_44_0 = var2_int;
                            stackIn_45_0 = stackOut_44_0;
                            break L5;
                          }
                          L22: {
                            if (stackIn_45_0 != 0) {
                              ((de) this).field_p = false;
                              ((de) this).field_w = 0;
                              break L22;
                            } else {
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
                    L23: {
                      if (((de) this).field_h) {
                        break L23;
                      } else {
                        ((de) this).field_A = null;
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L23;
                        }
                      }
                    }
                    var2_int = 1;
                    var3 = ((de) this).field_A.h(-11151);
                    L24: while (true) {
                      L25: {
                        L26: {
                          if (null == var3) {
                            break L26;
                          } else {
                            var4 = (int)var3.field_g;
                            stackOut_57_0 = -2;
                            stackOut_57_1 = ~((de) this).field_m[var4];
                            stackIn_69_0 = stackOut_57_0;
                            stackIn_69_1 = stackOut_57_1;
                            stackIn_58_0 = stackOut_57_0;
                            stackIn_58_1 = stackOut_57_1;
                            if (var5 != 0) {
                              L27: while (true) {
                                if (stackIn_69_0 <= stackIn_69_1) {
                                  break L25;
                                } else {
                                  stackOut_70_0 = -1;
                                  stackOut_70_1 = ~((de) this).field_g.field_k[((de) this).field_w];
                                  stackIn_96_0 = stackOut_70_0;
                                  stackIn_96_1 = stackOut_70_1;
                                  stackIn_71_0 = stackOut_70_0;
                                  stackIn_71_1 = stackOut_70_1;
                                  if (var5 != 0) {
                                    break L1;
                                  } else {
                                    stackOut_71_0 = stackIn_71_0;
                                    stackOut_71_1 = stackIn_71_1;
                                    stackIn_73_0 = stackOut_71_0;
                                    stackIn_73_1 = stackOut_71_1;
                                    L28: {
                                      L29: {
                                        if (stackIn_73_0 == stackIn_73_1) {
                                          ((de) this).field_w = ((de) this).field_w + 1;
                                          if (var5 == 0) {
                                            break L28;
                                          } else {
                                            break L29;
                                          }
                                        } else {
                                          break L29;
                                        }
                                      }
                                      L30: {
                                        if (!((de) this).field_k.c(20)) {
                                          break L30;
                                        } else {
                                          var2_int = 0;
                                          if (var5 == 0) {
                                            break L25;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      L31: {
                                        if (((de) this).field_m[((de) this).field_w] != 1) {
                                          lb discarded$6 = this.a(65, ((de) this).field_w, 2);
                                          break L31;
                                        } else {
                                          break L31;
                                        }
                                      }
                                      L32: {
                                        if (1 != ((de) this).field_m[((de) this).field_w]) {
                                          var3 = new gi();
                                          var3.field_g = (long)((de) this).field_w;
                                          var2_int = 0;
                                          ((de) this).field_A.a(var3, 255);
                                          break L32;
                                        } else {
                                          break L32;
                                        }
                                      }
                                      ((de) this).field_w = ((de) this).field_w + 1;
                                      if (var5 == 0) {
                                        break L28;
                                      } else {
                                        break L25;
                                      }
                                    }
                                    stackOut_68_0 = ((de) this).field_g.field_k.length;
                                    stackOut_68_1 = ((de) this).field_w;
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    continue L27;
                                  }
                                }
                              }
                            } else {
                              L33: {
                                if (stackIn_58_0 == stackIn_58_1) {
                                  break L33;
                                } else {
                                  lb discarded$7 = this.a(65, var4, 2);
                                  break L33;
                                }
                              }
                              L34: {
                                L35: {
                                  if (((de) this).field_m[var4] == 1) {
                                    break L35;
                                  } else {
                                    var2_int = 0;
                                    if (var5 == 0) {
                                      break L34;
                                    } else {
                                      break L35;
                                    }
                                  }
                                }
                                var3.a(-16175);
                                break L34;
                              }
                              var3 = ((de) this).field_A.e(0);
                              if (var5 == 0) {
                                continue L24;
                              } else {
                                break L26;
                              }
                            }
                          }
                        }
                        L36: while (true) {
                          stackOut_68_0 = ((de) this).field_g.field_k.length;
                          stackOut_68_1 = ((de) this).field_w;
                          stackIn_69_0 = stackOut_68_0;
                          stackIn_69_1 = stackOut_68_1;
                          if (stackIn_69_0 <= stackIn_69_1) {
                            break L25;
                          } else {
                            stackOut_70_0 = -1;
                            stackOut_70_1 = ~((de) this).field_g.field_k[((de) this).field_w];
                            stackIn_96_0 = stackOut_70_0;
                            stackIn_96_1 = stackOut_70_1;
                            stackIn_71_0 = stackOut_70_0;
                            stackIn_71_1 = stackOut_70_1;
                            if (var5 != 0) {
                              break L1;
                            } else {
                              stackOut_71_0 = stackIn_71_0;
                              stackOut_71_1 = stackIn_71_1;
                              stackIn_73_0 = stackOut_71_0;
                              stackIn_73_1 = stackOut_71_1;
                              L37: {
                                if (stackIn_73_0 == stackIn_73_1) {
                                  ((de) this).field_w = ((de) this).field_w + 1;
                                  if (var5 == 0) {
                                    continue L36;
                                  } else {
                                    break L37;
                                  }
                                } else {
                                  break L37;
                                }
                              }
                              L38: {
                                if (!((de) this).field_k.c(20)) {
                                  break L38;
                                } else {
                                  var2_int = 0;
                                  if (var5 == 0) {
                                    break L25;
                                  } else {
                                    break L38;
                                  }
                                }
                              }
                              L39: {
                                if (((de) this).field_m[((de) this).field_w] != 1) {
                                  lb discarded$6 = this.a(65, ((de) this).field_w, 2);
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              L40: {
                                if (1 != ((de) this).field_m[((de) this).field_w]) {
                                  var3 = new gi();
                                  var3.field_g = (long)((de) this).field_w;
                                  var2_int = 0;
                                  ((de) this).field_A.a(var3, 255);
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              ((de) this).field_w = ((de) this).field_w + 1;
                              if (var5 == 0) {
                                continue L36;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                      }
                      if (var2_int != 0) {
                        ((de) this).field_w = 0;
                        ((de) this).field_h = false;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
              stackOut_95_0 = param0;
              stackOut_95_1 = 97;
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              break L1;
            }
            if (stackIn_96_0 == stackIn_96_1) {
              L41: {
                if (!((de) this).field_r) {
                  break L41;
                } else {
                  if (((de) this).field_o <= la.a(false)) {
                    var2_ref = (lb) (Object) ((de) this).field_v.b(-1);
                    L42: while (true) {
                      L43: {
                        if (null == var2_ref) {
                          break L43;
                        } else {
                          if (var5 != 0) {
                            break L41;
                          } else {
                            L44: {
                              if (var2_ref.field_u) {
                                break L44;
                              } else {
                                L45: {
                                  if (var2_ref.field_E) {
                                    break L45;
                                  } else {
                                    var2_ref.field_E = true;
                                    if (var5 == 0) {
                                      break L44;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                                if (var2_ref.field_y) {
                                  var2_ref.a(-16175);
                                  break L44;
                                } else {
                                  throw new RuntimeException();
                                }
                              }
                            }
                            var2_ref = (lb) (Object) ((de) this).field_v.a((byte) -114);
                            if (var5 == 0) {
                              continue L42;
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                      ((de) this).field_o = la.a(false) + 1000L;
                      break L41;
                    }
                  } else {
                    break L41;
                  }
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
          throw ie.a((Throwable) (Object) var2, "de.D(" + param0 + ')');
        }
    }

    private final lb a(int param0, int param1, int param2) {
        Object var4 = null;
        byte[] var5 = null;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var6_int = 0;
        int var7 = 0;
        byte[] var7_ref_byte__ = null;
        byte[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        Object stackIn_39_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_57_0 = null;
        byte stackIn_81_0 = 0;
        byte stackIn_81_1 = 0;
        Object stackIn_95_0 = null;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        Object stackIn_107_0 = null;
        byte stackIn_127_0 = 0;
        byte stackIn_127_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        Object stackIn_147_0 = null;
        Object stackIn_154_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_38_0 = null;
        Object stackOut_51_0 = null;
        byte stackOut_126_0 = 0;
        byte stackOut_126_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        Object stackOut_146_0 = null;
        byte stackOut_80_0 = 0;
        byte stackOut_80_1 = 0;
        Object stackOut_94_0 = null;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        Object stackOut_106_0 = null;
        Object stackOut_56_0 = null;
        Object stackOut_153_0 = null;
        var10 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          try {
            L0: {
              var4 = (Object) (Object) (lb) (Object) ((de) this).field_v.a(true, (long)param1);
              if (var4 == null) {
                break L0;
              } else {
                if (param2 != 0) {
                  break L0;
                } else {
                  if (((lb) var4).field_y) {
                    break L0;
                  } else {
                    if (!((lb) var4).field_u) {
                      break L0;
                    } else {
                      ((lb) var4).a(-16175);
                      var4 = null;
                      break L0;
                    }
                  }
                }
              }
            }
            L1: {
              if (null == var4) {
                L2: {
                  L3: {
                    if (param2 == 0) {
                      break L3;
                    } else {
                      L4: {
                        if (param2 != 1) {
                          break L4;
                        } else {
                          if (null != ((de) this).field_j) {
                            var4 = (Object) (Object) ((de) this).field_s.a(((de) this).field_j, param1, 7);
                            if (var10 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      }
                      if (param2 == 2) {
                        if (null != ((de) this).field_j) {
                          if (((de) this).field_m[param1] != -1) {
                            throw new RuntimeException();
                          } else {
                            if (!((de) this).field_k.c(20)) {
                              var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, false);
                              if (var10 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            } else {
                              stackOut_38_0 = null;
                              stackIn_39_0 = stackOut_38_0;
                              return (lb) (Object) stackIn_39_0;
                            }
                          }
                        } else {
                          throw new RuntimeException();
                        }
                      } else {
                        throw new RuntimeException();
                      }
                    }
                  }
                  L5: {
                    if (null == ((de) this).field_j) {
                      break L5;
                    } else {
                      if (((de) this).field_m[param1] == -1) {
                        break L5;
                      } else {
                        var4 = (Object) (Object) ((de) this).field_s.a(6, param1, ((de) this).field_j);
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  if (!((de) this).field_k.a(true)) {
                    var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, true);
                    break L2;
                  } else {
                    stackOut_51_0 = null;
                    stackIn_52_0 = stackOut_51_0;
                    return (lb) (Object) stackIn_52_0;
                  }
                }
                ((de) this).field_v.a((gi) var4, (long)param1, -1);
                break L1;
              } else {
                break L1;
              }
            }
            if (!((lb) var4).field_u) {
              L6: {
                if (param0 == 65) {
                  break L6;
                } else {
                  ((de) this).field_j = null;
                  break L6;
                }
              }
              var5 = ((lb) var4).i(13095);
              if (var4 instanceof bi) {
                L7: {
                  if (var5 == null) {
                    break L7;
                  } else {
                    if (var5.length > 2) {
                      ta.field_b.reset();
                      ta.field_b.update(var5, 0, -2 + var5.length);
                      var6_int = (int)ta.field_b.getValue();
                      if (~var6_int != ~((de) this).field_g.field_j[param1]) {
                        throw new RuntimeException();
                      } else {
                        L8: {
                          L9: {
                            if (((de) this).field_g.field_q == null) {
                              break L9;
                            } else {
                              if (null != ((de) this).field_g.field_q[param1]) {
                                var7_ref_byte__ = ((de) this).field_g.field_q[param1];
                                var8 = b.a(0, 90, var5, -2 + var5.length);
                                var9 = 0;
                                L10: while (true) {
                                  if (var9 >= 64) {
                                    break L9;
                                  } else {
                                    stackOut_126_0 = var7_ref_byte__[var9];
                                    stackOut_126_1 = var8[var9];
                                    stackIn_134_0 = stackOut_126_0;
                                    stackIn_134_1 = stackOut_126_1;
                                    stackIn_127_0 = stackOut_126_0;
                                    stackIn_127_1 = stackOut_126_1;
                                    if (var10 != 0) {
                                      break L8;
                                    } else {
                                      if (stackIn_127_0 == stackIn_127_1) {
                                        var9++;
                                        if (var10 == 0) {
                                          continue L10;
                                        } else {
                                          break L9;
                                        }
                                      } else {
                                        throw new RuntimeException();
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                          }
                          stackOut_133_0 = var5[var5.length - 1] & 255;
                          stackOut_133_1 = (var5[var5.length + -2] & 255) << -755762552;
                          stackIn_134_0 = stackOut_133_0;
                          stackIn_134_1 = stackOut_133_1;
                          break L8;
                        }
                        var7 = stackIn_134_0 + stackIn_134_1;
                        if (var7 == (((de) this).field_g.field_l[param1] & 65535)) {
                          L11: {
                            if (((de) this).field_m[param1] != 1) {
                              L12: {
                                if (((de) this).field_m[param1] == 0) {
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              ((de) this).field_m[param1] = (byte) 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L13: {
                            if (!((lb) var4).field_y) {
                              ((lb) var4).a(-16175);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          stackOut_146_0 = var4;
                          stackIn_147_0 = stackOut_146_0;
                          return (lb) (Object) stackIn_147_0;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                throw new RuntimeException();
              } else {
                try {
                  L14: {
                    L15: {
                      if (null == var5) {
                        break L15;
                      } else {
                        if (2 < var5.length) {
                          ta.field_b.reset();
                          ta.field_b.update(var5, 0, -2 + var5.length);
                          var6_int = (int)ta.field_b.getValue();
                          if (~((de) this).field_g.field_j[param1] != ~var6_int) {
                            throw new RuntimeException();
                          } else {
                            L16: {
                              if (null == ((de) this).field_g.field_q) {
                                break L16;
                              } else {
                                if (((de) this).field_g.field_q[param1] != null) {
                                  var7_ref_byte__ = ((de) this).field_g.field_q[param1];
                                  var8 = b.a(0, param0 + -9, var5, var5.length - 2);
                                  var9 = 0;
                                  L17: while (true) {
                                    if (64 <= var9) {
                                      break L16;
                                    } else {
                                      stackOut_80_0 = var7_ref_byte__[var9];
                                      stackOut_80_1 = var8[var9];
                                      stackIn_100_0 = stackOut_80_0;
                                      stackIn_100_1 = stackOut_80_1;
                                      stackIn_81_0 = stackOut_80_0;
                                      stackIn_81_1 = stackOut_80_1;
                                      if (var10 != 0) {
                                        decompiledRegionSelector0 = 0;
                                        break L14;
                                      } else {
                                        if (stackIn_81_0 == stackIn_81_1) {
                                          var9++;
                                          if (var10 == 0) {
                                            continue L17;
                                          } else {
                                            break L16;
                                          }
                                        } else {
                                          throw new RuntimeException();
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  break L16;
                                }
                              }
                            }
                            ((de) this).field_k.field_c = 0;
                            ((de) this).field_k.field_h = 0;
                            decompiledRegionSelector0 = 1;
                            break L14;
                          }
                        } else {
                          break L15;
                        }
                      }
                    }
                    throw new RuntimeException();
                  }
                } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L18: {
                    var6 = (RuntimeException) (Object) decompiledCaughtException;
                    ((de) this).field_k.b((byte) 122);
                    ((lb) var4).a(param0 + -16240);
                    if (((lb) var4).field_y) {
                      if (((de) this).field_k.a(true)) {
                        break L18;
                      } else {
                        var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, 11259, (byte) 2, param1, true);
                        ((de) this).field_v.a((gi) var4, (long)param1, -1);
                        break L18;
                      }
                    } else {
                      break L18;
                    }
                  }
                  stackOut_94_0 = null;
                  stackIn_95_0 = stackOut_94_0;
                  return (lb) (Object) stackIn_95_0;
                }
                L19: {
                  L20: {
                    if (decompiledRegionSelector0 == 0) {
                      break L20;
                    } else {
                      var5[var5.length + -2] = (byte)(((de) this).field_g.field_l[param1] >>> -907966584);
                      var5[var5.length - 1] = (byte)((de) this).field_g.field_l[param1];
                      if (((de) this).field_j != null) {
                        bi discarded$1 = ((de) this).field_s.a(param1, ((de) this).field_j, var5, -127);
                        stackOut_99_0 = ~((de) this).field_m[param1];
                        stackOut_99_1 = -2;
                        stackIn_100_0 = stackOut_99_0;
                        stackIn_100_1 = stackOut_99_1;
                        break L20;
                      } else {
                        break L19;
                      }
                    }
                  }
                  if (stackIn_100_0 == stackIn_100_1) {
                    break L19;
                  } else {
                    ((de) this).field_m[param1] = (byte) 1;
                    break L19;
                  }
                }
                L21: {
                  if (((lb) var4).field_y) {
                    break L21;
                  } else {
                    ((lb) var4).a(param0 + -16240);
                    break L21;
                  }
                }
                stackOut_106_0 = var4;
                stackIn_107_0 = stackOut_106_0;
                return (lb) (Object) stackIn_107_0;
              }
            } else {
              stackOut_56_0 = null;
              stackIn_57_0 = stackOut_56_0;
              return (lb) (Object) stackIn_57_0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            L22: {
              var6_ref = (Exception) (Object) decompiledCaughtException;
              ((de) this).field_m[param1] = (byte) -1;
              ((lb) var4).a(-16175);
              if (((lb) var4).field_y) {
                if (((de) this).field_k.a(true)) {
                  break L22;
                } else {
                  var4 = (Object) (Object) ((de) this).field_k.a(((de) this).field_i, param0 + 11194, (byte) 2, param1, true);
                  ((de) this).field_v.a((gi) var4, (long)param1, -1);
                  break L22;
                }
              } else {
                break L22;
              }
            }
            stackOut_153_0 = null;
            stackIn_154_0 = stackOut_153_0;
            return (lb) (Object) stackIn_154_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (Object) (Object) decompiledCaughtException;
          throw ie.a((Throwable) var4, "de.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final kh a(byte param0) {
        RuntimeException var2 = null;
        byte[] var2_array = null;
        RuntimeException var3 = null;
        int var4 = 0;
        kh stackIn_8_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_53_0 = null;
        kh stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        kh stackOut_7_0 = null;
        Object stackOut_13_0 = null;
        Object stackOut_31_0 = null;
        Object stackOut_52_0 = null;
        kh stackOut_58_0 = null;
        Object stackOut_17_0 = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -36) {
                break L1;
              } else {
                kh discarded$2 = ((de) this).a((byte) 56);
                break L1;
              }
            }
            if (null != ((de) this).field_g) {
              stackOut_7_0 = ((de) this).field_g;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              L2: {
                if (null == ((de) this).field_y) {
                  if (!((de) this).field_k.a(true)) {
                    ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                    break L2;
                  } else {
                    stackOut_13_0 = null;
                    stackIn_14_0 = stackOut_13_0;
                    return (kh) (Object) stackIn_14_0;
                  }
                } else {
                  break L2;
                }
              }
              if (!((de) this).field_y.field_u) {
                L3: {
                  L4: {
                    var2_array = ((de) this).field_y.i(13095);
                    if (((de) this).field_y instanceof bi) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          if (null != var2_array) {
                            ((de) this).field_g = new kh(var2_array, ((de) this).field_l, ((de) this).field_x);
                            break L5;
                          } else {
                            throw new RuntimeException();
                          }
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          L7: {
                            var3 = decompiledCaughtException;
                            ((de) this).field_k.b((byte) 122);
                            ((de) this).field_g = null;
                            if (!((de) this).field_k.a(true)) {
                              break L7;
                            } else {
                              ((de) this).field_y = null;
                              if (var4 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                          break L6;
                        }
                        stackOut_31_0 = null;
                        stackIn_32_0 = stackOut_31_0;
                        return (kh) (Object) stackIn_32_0;
                      }
                      if (((de) this).field_u != null) {
                        bi discarded$3 = ((de) this).field_s.a(((de) this).field_i, ((de) this).field_u, var2_array, 49);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  try {
                    L8: {
                      if (var2_array == null) {
                        throw new RuntimeException();
                      } else {
                        ((de) this).field_g = new kh(var2_array, ((de) this).field_l, ((de) this).field_x);
                        if (~((de) this).field_t != ~((de) this).field_g.field_t) {
                          throw new RuntimeException();
                        } else {
                          break L8;
                        }
                      }
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L9: {
                      L10: {
                        var3 = decompiledCaughtException;
                        ((de) this).field_g = null;
                        if (!((de) this).field_k.a(true)) {
                          break L10;
                        } else {
                          ((de) this).field_y = null;
                          if (var4 == 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ((de) this).field_y = (lb) (Object) ((de) this).field_k.a(255, 11259, (byte) 0, ((de) this).field_i, true);
                      break L9;
                    }
                    stackOut_52_0 = null;
                    stackIn_53_0 = stackOut_52_0;
                    return (kh) (Object) stackIn_53_0;
                  }
                  break L3;
                }
                L11: {
                  if (null != ((de) this).field_j) {
                    ((de) this).field_m = new byte[((de) this).field_g.field_m];
                    break L11;
                  } else {
                    break L11;
                  }
                }
                ((de) this).field_y = null;
                stackOut_58_0 = ((de) this).field_g;
                stackIn_59_0 = stackOut_58_0;
                break L0;
              } else {
                stackOut_17_0 = null;
                stackIn_18_0 = stackOut_17_0;
                return (kh) (Object) stackIn_18_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = decompiledCaughtException;
          throw ie.a((Throwable) (Object) var2, "de.F(" + param0 + ')');
        }
        return stackIn_59_0;
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (pj.field_G != null) {
                var1_ref = (Object) (Object) pj.field_G;
                synchronized (var1_ref) {
                  L2: {
                    pj.field_G = null;
                    break L2;
                  }
                }
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              if (param0 <= -83) {
                break L3;
              } else {
                de.e(56);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw ie.a((Throwable) (Object) var1, "de.G(" + param0 + ')');
        }
    }

    de(int param0, ik param1, ik param2, gb param3, n param4, int param5, byte[] param6, int param7, boolean param8) {
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
        ((de) this).field_v = new tg(16);
        ((de) this).field_w = 0;
        ((de) this).field_n = new vd();
        ((de) this).field_o = 0L;
        try {
          L0: {
            L1: {
              L2: {
                ((de) this).field_j = param1;
                ((de) this).field_i = param0;
                if (null == ((de) this).field_j) {
                  break L2;
                } else {
                  ((de) this).field_p = true;
                  ((de) this).field_A = new vd();
                  if (!DrPhlogistonSavesTheEarth.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((de) this).field_p = false;
              break L1;
            }
            L3: {
              ((de) this).field_r = param8;
              ((de) this).field_t = param7;
              ((de) this).field_k = param3;
              ((de) this).field_x = param6;
              ((de) this).field_s = param4;
              ((de) this).field_l = param5;
              ((de) this).field_u = param2;
              if (null != ((de) this).field_u) {
                ((de) this).field_y = (lb) (Object) ((de) this).field_s.a(6, ((de) this).field_i, ((de) this).field_u);
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
            stackOut_10_1 = new StringBuilder().append("de.<init>(").append(param0).append(',');
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
          throw ie.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
