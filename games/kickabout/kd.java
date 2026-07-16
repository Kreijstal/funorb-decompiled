/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kd extends be {
    static String field_w;
    private tm[] field_t;
    static ut[][] field_y;
    static ff field_r;
    static boolean field_s;
    static String field_x;
    static String field_u;
    static String field_v;
    static hd field_z;
    static String field_A;

    final boolean a(String param0, boolean param1) {
        try {
            fi var3 = null;
            dw var3_ref = null;
            hd var4 = null;
            lk var5 = null;
            tf var6 = null;
            q var7 = null;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            try {
              L0: {
                L1: {
                  var6 = fj.a(false, param0);
                  if (param1) {
                    break L1;
                  } else {
                    ((kd) this).b(5);
                    break L1;
                  }
                }
                var7 = new q(var6);
                var5 = jh.a(var7, 1422);
                if (!var7.a(6)) {
                  throw new fi(var7.a((byte) 114).field_f);
                } else {
                  ((kd) this).a(-98, (Object) (Object) var5.a(param1, ((kd) this).field_t));
                  stackOut_5_0 = 1;
                  stackIn_6_0 = stackOut_5_0;
                  break L0;
                }
              }
            } catch (fi decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (fi) (Object) decompiledCaughtException;
              param0 = "<col=55ff55>" + param0.substring(0, var3.field_f) + "</col>" + param0.substring(var3.field_f);
              var4 = (hd) (Object) ((kd) this).field_g.field_Ab.field_jb.d(-9033);
              var4.field_E = ((kd) this).field_a + param0;
              return false;
            } catch (dw decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (dw) (Object) decompiledCaughtException;
              ((kd) this).a(var3_ref.field_c, (byte) 94);
              return false;
            }
            return stackIn_6_0 != 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        L0: {
          L1: {
            var5 = Kickabout.field_G;
            if (param0 <= 0) {
              break L1;
            } else {
              if (128 > param0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (param0 < 160) {
              if (param0 == 0) {
                break L2;
              } else {
                var6 = ts.field_c;
                var2 = var6;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= var6.length) {
                    break L2;
                  } else {
                    var4 = var6[var3];
                    if (param0 == var4) {
                      return true;
                    } else {
                      var3++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              if (255 >= param0) {
                break L0;
              } else {
                if (param0 == 0) {
                  break L2;
                } else {
                  var6 = ts.field_c;
                  var2 = var6;
                  var3 = 0;
                  L4: while (true) {
                    if (var3 >= var6.length) {
                      break L2;
                    } else {
                      var4 = var6[var3];
                      if (param0 == var4) {
                        return true;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
          }
          if (param1 >= 63) {
            return false;
          } else {
            boolean discarded$1 = kd.a('{', (byte) -51);
            return false;
          }
        }
        return true;
    }

    final String[] b(byte param0) {
        int var3 = 0;
        lk[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        tm var11 = null;
        int var12 = 0;
        String var13 = null;
        lk var14 = null;
        o var15 = null;
        L0: {
          var12 = Kickabout.field_G;
          var13 = ((kd) this).field_k.j((byte) -16);
          var6 = var13;
          var6 = var13;
          var3 = ((kd) this).field_k.j(-1);
          var4 = w.a(var13, (byte) -81);
          var5 = mi.a(var3, var4, 1);
          ((kd) this).field_j.field_s = 0;
          var6 = "";
          if ((var5 ^ -1) > -1) {
            break L0;
          } else {
            L1: {
              var14 = var4[var5];
              var8_int = -var14.field_f + var3;
              if (var14.field_k != vu.field_Ab) {
                break L1;
              } else {
                if ((var8_int ^ -1) >= -1) {
                  break L1;
                } else {
                  var6 = var14.field_h.substring(0, Math.min(var14.field_h.length(), var8_int));
                  ((kd) this).field_j.field_s = ((kd) this).field_d.a(var13.substring(0, var14.field_f));
                  break L0;
                }
              }
            }
            var9 = var5;
            var10 = 0;
            L2: while (true) {
              L3: {
                if ((var9 ^ -1) > -1) {
                  break L3;
                } else {
                  L4: {
                    if (var4[var9].field_k != og.field_c) {
                      break L4;
                    } else {
                      var10++;
                      break L4;
                    }
                  }
                  L5: {
                    if (si.field_g != var4[var9].field_k) {
                      break L5;
                    } else {
                      var10--;
                      break L5;
                    }
                  }
                  if (-1 < (var10 ^ -1)) {
                    break L3;
                  } else {
                    var9--;
                    continue L2;
                  }
                }
              }
              if ((var9 ^ -1) >= -1) {
                break L0;
              } else {
                if (var4[var9 - 1].field_k == vu.field_Ab) {
                  var6 = var4[var9 + -1].field_h;
                  ((kd) this).field_j.field_s = ((kd) this).field_d.a(var13.substring(0, var4[var9 + -1].field_f));
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var15 = this.b(var6, (byte) -91);
        var8 = new String[var15.c(-1976587888)];
        var9 = 0;
        var10 = 43 % ((-2 - param0) / 41);
        var11 = (tm) (Object) var15.a(-124);
        L6: while (true) {
          if (var11 == null) {
            return var8;
          } else {
            int incrementValue$1 = var9;
            var9++;
            var8[incrementValue$1] = var11.field_s;
            var11 = (tm) (Object) var15.b(0);
            continue L6;
          }
        }
    }

    kd(tf param0, hu param1, bu param2) {
        super(param1, param2);
        ((kd) this).field_t = new tm[param0.a(false)];
        int var4 = 0;
        tm var5 = (tm) (Object) param0.g(24009);
        while (var5 != null) {
            int incrementValue$0 = var4;
            var4++;
            ((kd) this).field_t[incrementValue$0] = var5;
            var5 = (tm) (Object) param0.c(33);
        }
        ((kd) this).a("# <col=ffaaff>FunOrbConsole (loaded " + ((kd) this).field_t.length + " methods at " + new Date() + ")</col>", (byte) 94);
    }

    public static void c(int param0) {
        field_z = null;
        field_w = null;
        field_A = null;
        field_u = null;
        if (param0 != -1) {
            boolean discarded$0 = kd.a('4', (byte) -128);
        }
        field_r = null;
        field_v = null;
        field_y = null;
        field_x = null;
    }

    public final boolean a(int param0, int param1, char param2) {
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        char stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        char stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        var11 = Kickabout.field_G;
        if (((kd) this).a((byte) 114)) {
          L0: {
            var12 = ((kd) this).field_k.j((byte) -16);
            var5 = ((kd) this).field_k.j(-1);
            var6 = 0;
            var7 = 0;
            var8 = 0;
            var9 = 0;
            if (param0 == 11516) {
              break L0;
            } else {
              ((kd) this).b(102);
              break L0;
            }
          }
          L1: while (true) {
            if (var9 >= var5) {
              L2: {
                if (var5 > 0) {
                  stackOut_27_0 = var12.charAt(var5 + -1);
                  stackIn_28_0 = stackOut_27_0;
                  break L2;
                } else {
                  stackOut_26_0 = 65535;
                  stackIn_28_0 = stackOut_26_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_28_0;
                if (var12.length() > var5) {
                  stackOut_30_0 = var12.charAt(var5);
                  stackIn_31_0 = stackOut_30_0;
                  break L3;
                } else {
                  stackOut_29_0 = 65535;
                  stackIn_31_0 = stackOut_29_0;
                  break L3;
                }
              }
              L4: {
                L5: {
                  L6: {
                    var10 = stackIn_31_0;
                    if (var6 == 0) {
                      break L6;
                    } else {
                      if (var8 != 0) {
                        break L6;
                      } else {
                        if (param2 != 34) {
                          break L6;
                        } else {
                          if (var10 == 34) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (var7 == 0) {
                      break L7;
                    } else {
                      if (var8 != 0) {
                        break L7;
                      } else {
                        if (param2 != 39) {
                          break L7;
                        } else {
                          if (var10 == 39) {
                            break L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (var6 != 0) {
                      break L8;
                    } else {
                      if (var7 != 0) {
                        break L8;
                      } else {
                        if (param2 != 41) {
                          break L8;
                        } else {
                          if (var10 != 41) {
                            break L8;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    if ((param1 ^ -1) != -86) {
                      break L9;
                    } else {
                      L10: {
                        if (var9 != 40) {
                          break L10;
                        } else {
                          if (41 == var10) {
                            boolean discarded$8 = ((kd) this).field_k.a(101, '￿', 875);
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (var6 == 0) {
                          break L11;
                        } else {
                          if (34 != var9) {
                            break L11;
                          } else {
                            if (var10 == 34) {
                              boolean discarded$9 = ((kd) this).field_k.a(101, '￿', 875);
                              break L9;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      if (var7 == 0) {
                        break L9;
                      } else {
                        if (var9 != 39) {
                          break L9;
                        } else {
                          if (var10 != 39) {
                            break L9;
                          } else {
                            boolean discarded$10 = ((kd) this).field_k.a(101, '￿', 875);
                            break L9;
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    boolean discarded$11 = super.a(11516, param1, param2);
                    var4 = ((kd) this).field_k.j((byte) -16);
                    var5 = ((kd) this).field_k.j(-1);
                    if (var6 == 0) {
                      if (var6 == 0) {
                        if (var7 != 0) {
                          break L12;
                        } else {
                          if (param2 != 34) {
                            break L12;
                          } else {
                            boolean discarded$12 = ((kd) this).field_k.a(-1, '"', 875);
                            ((kd) this).field_k.a(var5, (byte) -97, var5);
                            break L12;
                          }
                        }
                      } else {
                        if (var6 != 0) {
                          break L12;
                        } else {
                          if (param2 != 34) {
                            break L12;
                          } else {
                            boolean discarded$13 = ((kd) this).field_k.a(-1, '"', 875);
                            ((kd) this).field_k.a(var5, (byte) -97, var5);
                            break L12;
                          }
                        }
                      }
                    } else {
                      if (var6 != 0) {
                        break L12;
                      } else {
                        if (var7 != 0) {
                          break L12;
                        } else {
                          if (param2 != 34) {
                            break L12;
                          } else {
                            boolean discarded$14 = ((kd) this).field_k.a(-1, '"', 875);
                            ((kd) this).field_k.a(var5, (byte) -97, var5);
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  if (var6 != 0) {
                    break L4;
                  } else {
                    if (var7 != 0) {
                      break L4;
                    } else {
                      if (param2 != 39) {
                        break L4;
                      } else {
                        boolean discarded$15 = ((kd) this).field_k.a(-1, '\'', 875);
                        ((kd) this).field_k.a(var5, (byte) -94, var5);
                        break L4;
                      }
                    }
                  }
                }
                ((kd) this).field_k.f(-85, 1 + var5);
                break L4;
              }
              cv.field_c = aq.a(((kd) this).field_k.j((byte) -16), 120);
              return true;
            } else {
              if (var8 != 0) {
                var8 = 0;
                var9++;
                continue L1;
              } else {
                L13: {
                  L14: {
                    var10 = var12.charAt(var9);
                    if (var6 != 0) {
                      break L14;
                    } else {
                      if (var7 != 0) {
                        break L14;
                      } else {
                        stackOut_10_0 = 0;
                        stackIn_16_0 = stackOut_10_0;
                        break L13;
                      }
                    }
                  }
                  if (var10 == 92) {
                    stackOut_14_0 = 1;
                    stackIn_16_0 = stackOut_14_0;
                    break L13;
                  } else {
                    stackOut_13_0 = 0;
                    stackIn_16_0 = stackOut_13_0;
                    break L13;
                  }
                }
                L15: {
                  L16: {
                    var8 = stackIn_16_0;
                    stackOut_16_0 = var6;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (var7 != 0) {
                      break L16;
                    } else {
                      stackOut_17_0 = stackIn_17_0;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var10 != 34) {
                        break L16;
                      } else {
                        stackOut_18_0 = stackIn_18_0;
                        stackOut_18_1 = 1;
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        break L15;
                      }
                    }
                  }
                  stackOut_19_0 = stackIn_19_0;
                  stackOut_19_1 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L15;
                }
                L17: {
                  L18: {
                    var6 = stackIn_20_0 ^ stackIn_20_1;
                    stackOut_20_0 = var7;
                    stackIn_23_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var6 != 0) {
                      break L18;
                    } else {
                      stackOut_21_0 = stackIn_21_0;
                      stackIn_23_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (var10 != 39) {
                        break L18;
                      } else {
                        stackOut_22_0 = stackIn_22_0;
                        stackOut_22_1 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        stackIn_24_1 = stackOut_22_1;
                        break L17;
                      }
                    }
                  }
                  stackOut_23_0 = stackIn_23_0;
                  stackOut_23_1 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  break L17;
                }
                var7 = stackIn_24_0 ^ stackIn_24_1;
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return super.a(11516, param1, param2);
        }
    }

    private final o b(String param0, byte param1) {
        o var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        o var7 = null;
        var6 = Kickabout.field_G;
        var4 = 117 / ((param1 - 27) / 48);
        var7 = new o();
        var3 = var7;
        var5 = 0;
        L0: while (true) {
          if (((kd) this).field_t.length <= var5) {
            return var3;
          } else {
            if (((kd) this).field_t[var5].field_o.startsWith(param0)) {
              ((kd) this).field_t[var5].f(47);
              var7.a(127, (am) (Object) ((kd) this).field_t[var5]);
              var5++;
              continue L0;
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final void b(int param0) {
        int var3 = 0;
        lk[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        tm var13_ref_tm = null;
        int var13 = 0;
        tm var14 = null;
        int var15 = 0;
        String var16 = null;
        lk var17 = null;
        o var18 = null;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        L0: {
          var15 = Kickabout.field_G;
          var16 = ((kd) this).field_k.j((byte) -16);
          var6 = var16;
          var6 = var16;
          var3 = ((kd) this).field_k.j(-1);
          var4 = w.a(var16, (byte) -33);
          var5 = mi.a(var3, var4, 1);
          var6 = "";
          if (var5 >= 0) {
            var17 = var4[var5];
            var8_int = var3 + -var17.field_f;
            if (var17.field_k != vu.field_Ab) {
              break L0;
            } else {
              if (0 >= var8_int) {
                break L0;
              } else {
                if (var8_int <= var17.field_h.length()) {
                  var6 = var17.field_h.substring(0, var8_int);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        var18 = this.b(var6, (byte) -124);
        if (0 == var18.c(-1976587888)) {
          return;
        } else {
          var8 = new StringBuilder();
          var11 = -93 / ((-44 - param0) / 36);
          var9 = var6.length();
          var10 = 1;
          var12 = 2147483647;
          var13_ref_tm = (tm) (Object) var18.a(-120);
          L1: while (true) {
            if (var13_ref_tm == null) {
              L2: while (true) {
                L3: {
                  if (var10 == 0) {
                    break L3;
                  } else {
                    if (var9 >= var12) {
                      break L3;
                    } else {
                      var13 = ((tm) (Object) var18.a(-119)).field_o.charAt(var9);
                      var14 = (tm) (Object) var18.b(0);
                      L4: while (true) {
                        if (var14 == null) {
                          var9++;
                          if (var10 != 0) {
                            StringBuilder discarded$2 = var8.append(var13);
                            continue L2;
                          } else {
                            continue L2;
                          }
                        } else {
                          L5: {
                            stackOut_19_0 = var10;
                            stackIn_21_0 = stackOut_19_0;
                            stackIn_20_0 = stackOut_19_0;
                            if (var13 != var14.field_o.charAt(var9)) {
                              stackOut_21_0 = stackIn_21_0;
                              stackOut_21_1 = 0;
                              stackIn_22_0 = stackOut_21_0;
                              stackIn_22_1 = stackOut_21_1;
                              break L5;
                            } else {
                              stackOut_20_0 = stackIn_20_0;
                              stackOut_20_1 = 1;
                              stackIn_22_0 = stackOut_20_0;
                              stackIn_22_1 = stackOut_20_1;
                              break L5;
                            }
                          }
                          var10 = stackIn_22_0 & stackIn_22_1;
                          var14 = (tm) (Object) var18.b(0);
                          continue L4;
                        }
                      }
                    }
                  }
                }
                L6: {
                  var13 = var8.length() + var3;
                  if (var12 != var6.length() + var8.length()) {
                    break L6;
                  } else {
                    StringBuilder discarded$3 = var8.append("()");
                    var13++;
                    if (1 != var18.c(-1976587888)) {
                      break L6;
                    } else {
                      if (-1 != (((tm) (Object) var18.a(-121)).field_p.length ^ -1)) {
                        break L6;
                      } else {
                        var13++;
                        break L6;
                      }
                    }
                  }
                }
                ((kd) this).field_k.b(var16.substring(0, var3) + var8.toString() + var16.substring(var3), -23174);
                ((kd) this).field_k.f(-56, var13);
                return;
              }
            } else {
              L7: {
                if (var12 <= var13_ref_tm.field_o.length()) {
                  break L7;
                } else {
                  var12 = var13_ref_tm.field_o.length();
                  break L7;
                }
              }
              var13_ref_tm = (tm) (Object) var18.b(0);
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, qb param1, boolean param2, String param3) {
        int var5 = 0;
        int var6 = 0;
        uv var7 = null;
        String var8 = null;
        uv var9 = null;
        String var10 = null;
        uv var11 = null;
        String var12 = null;
        uv var13 = null;
        L0: {
          el.a((hd) (Object) param1, false, sp.field_Jb, -1, (String) null, (int[]) null, 0L, (String) null, param1.h((byte) 77));
          if (!param1.field_Cb) {
            break L0;
          } else {
            L1: {
              if (param1.field_Mb == 2) {
                break L1;
              } else {
                if (2 <= tk.field_Ib) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            var7 = wi.field_v;
            var8 = vo.a((byte) -18, ej.field_Ab, new String[1]);
            var7.field_j.a(0, 10, var8);
            break L0;
          }
        }
        L2: {
          wi.field_v.d(param0 + -14);
          if (!param2) {
            break L2;
          } else {
            if (wi.field_v.field_c != jm.field_h) {
              var11 = wi.field_v;
              var12 = vo.a((byte) -18, br.field_a, new String[1]);
              var11.field_j.a(param0 + -15, 15, var12);
              break L2;
            } else {
              var9 = wi.field_v;
              var10 = vo.a((byte) -18, cl.field_h, new String[1]);
              var9.field_j.a(0, 16, var10);
              break L2;
            }
          }
        }
        L3: {
          var13 = wi.field_v;
          var5 = sm.field_q;
          if (param0 == 15) {
            break L3;
          } else {
            field_x = null;
            break L3;
          }
        }
        var6 = vc.field_y;
        var13.field_j.a(0, 0, var5, var6, 0);
    }

    public final void a(int param0) {
        String var4 = ((kd) this).field_k.field_Lb.field_E;
        String var2 = var4;
        ((kd) this).field_k.field_Lb.field_E = cv.field_c;
        int var3 = 114 % ((param0 - 50) / 45);
        super.a(-76);
        ((kd) this).field_k.field_Lb.field_E = var4;
    }

    final static kg[] a(int param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        kg[] var6 = null;
        kg var7_ref_kg = null;
        int var7 = 0;
        int var8 = 0;
        tf var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        kg[] var16 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var15 = Kickabout.field_G;
        var16 = new kg[6];
        var6 = var16;
        if (!vi.field_n) {
          var7_ref_kg = pj.a(param2, -87, new tf(), 0);
          var8 = 0;
          L0: while (true) {
            if (var16.length <= var8) {
              return var6;
            } else {
              var16[var8] = var7_ref_kg;
              var8++;
              continue L0;
            }
          }
        } else {
          L1: {
            var7 = oe.field_p[0].field_o;
            if (!param3) {
              break L1;
            } else {
              boolean discarded$1 = kd.a('^', (byte) 107);
              break L1;
            }
          }
          L2: {
            if (param2) {
              stackOut_10_0 = 6;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 2;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          var8 = stackIn_11_0;
          var9 = new tf();
          var10 = 0;
          L3: while (true) {
            if ((var10 ^ -1) <= -4) {
              var10 = 0;
              L4: while (true) {
                if ((var10 ^ -1) <= -7) {
                  return var6;
                } else {
                  jm.a(100, 9863, var10 * (-param1 + param0) / 6 + param1);
                  var16[var10] = pj.a(param2, -76, var9, var10);
                  var10++;
                  continue L4;
                }
              }
            } else {
              var11 = 0;
              L5: while (true) {
                if ((var11 ^ -1) <= -10) {
                  var10++;
                  continue L3;
                } else {
                  if (param5 >= p.a((byte) -24, 256)) {
                    L6: {
                      var12 = p.a((byte) -24, 5);
                      var13 = p.a((byte) -24, 5);
                      var14 = 50 * var10 + 32 - -var13;
                      if (param2) {
                        break L6;
                      } else {
                        var14 = var7 - (var14 + 12);
                        break L6;
                      }
                    }
                    var9.a((gn) (Object) new nr(var14, 63 + (var11 * 26 + 14 * var10), var8, var12), 3);
                    var11++;
                    continue L5;
                  } else {
                    var11++;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ff(10, 2, 2, 0);
        field_u = "<%0> slot";
        field_s = false;
        field_v = "Please enter your date of birth to enable chat:";
        field_x = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_A = "Music";
    }
}
