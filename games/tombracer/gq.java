/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gq extends uta {
    private ela[] field_v;
    static ica field_w;
    static dn field_u;

    final void e(int param0) {
        int var3 = 0;
        mi[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ela var12_ref_ela = null;
        int var12 = 0;
        ela var13 = null;
        int var14 = 0;
        String var15 = null;
        mi var16 = null;
        vj var17 = null;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          var15 = ((gq) this).field_o.e((byte) -114);
          var6 = var15;
          var6 = var15;
          var3 = ((gq) this).field_o.j(-1320);
          var4 = ih.a((byte) 126, var15);
          var5 = qa.a(true, var4, var3);
          var6 = "";
          if (var5 < 0) {
            break L0;
          } else {
            var16 = var4[var5];
            var8_int = var3 - var16.field_h;
            if (tr.field_f != var16.field_p) {
              break L0;
            } else {
              if (0 >= var8_int) {
                break L0;
              } else {
                if (var16.field_m.length() >= var8_int) {
                  var6 = var16.field_m.substring(0, var8_int);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        var17 = this.b(false, var6);
        if (var17.a((byte) -48) != 0) {
          var8 = new StringBuilder();
          var9 = var6.length();
          var10 = 1;
          var11 = 2147483647;
          var12_ref_ela = (ela) (Object) var17.b((byte) 38);
          L1: while (true) {
            if (var12_ref_ela == null) {
              L2: while (true) {
                L3: {
                  if (var10 == 0) {
                    break L3;
                  } else {
                    if (var9 >= var11) {
                      break L3;
                    } else {
                      var12 = ((ela) (Object) var17.b((byte) 38)).field_l.charAt(var9);
                      var13 = (ela) (Object) var17.c(param0 ^ 21291);
                      L4: while (true) {
                        if (var13 == null) {
                          if (var10 != 0) {
                            StringBuilder discarded$2 = var8.append(var12);
                            var9++;
                            continue L2;
                          } else {
                            var9++;
                            continue L2;
                          }
                        } else {
                          L5: {
                            stackOut_17_0 = var10;
                            stackIn_19_0 = stackOut_17_0;
                            stackIn_18_0 = stackOut_17_0;
                            if (var12 != var13.field_l.charAt(var9)) {
                              stackOut_19_0 = stackIn_19_0;
                              stackOut_19_1 = 0;
                              stackIn_20_0 = stackOut_19_0;
                              stackIn_20_1 = stackOut_19_1;
                              break L5;
                            } else {
                              stackOut_18_0 = stackIn_18_0;
                              stackOut_18_1 = 1;
                              stackIn_20_0 = stackOut_18_0;
                              stackIn_20_1 = stackOut_18_1;
                              break L5;
                            }
                          }
                          var10 = stackIn_20_0 & stackIn_20_1;
                          var13 = (ela) (Object) var17.c(28);
                          continue L4;
                        }
                      }
                    }
                  }
                }
                L6: {
                  if (param0 == 21303) {
                    break L6;
                  } else {
                    field_w = null;
                    break L6;
                  }
                }
                L7: {
                  var12 = var3 - -var8.length();
                  if (var6.length() - -var8.length() != var11) {
                    break L7;
                  } else {
                    StringBuilder discarded$3 = var8.append("()");
                    var12++;
                    if (1 != var17.a((byte) -34)) {
                      break L7;
                    } else {
                      if (((ela) (Object) var17.b((byte) 38)).field_n.length == 0) {
                        var12++;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                ((gq) this).field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                ((gq) this).field_o.c(var12, 1);
                return;
              }
            } else {
              L8: {
                if (var11 <= var12_ref_ela.field_l.length()) {
                  break L8;
                } else {
                  var11 = var12_ref_ela.field_l.length();
                  break L8;
                }
              }
              var12_ref_ela = (ela) (Object) var17.c(param0 + -21275);
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    private final vj b(boolean param0, String param1) {
        vj var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        vj stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        vj stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new vj();
              var4 = 0;
              if (!param0) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 >= ((gq) this).field_v.length) {
                stackOut_7_0 = (vj) var3;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                L3: {
                  if (!((gq) this).field_v[var4].field_l.startsWith(param1)) {
                    break L3;
                  } else {
                    ((gq) this).field_v[var4].c(-7975);
                    var3.a((od) (Object) ((gq) this).field_v[var4], (byte) -78);
                    break L3;
                  }
                }
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3_ref;
            stackOut_9_1 = new StringBuilder().append("gq.H(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0;
    }

    final boolean a(String param0, byte param1) {
        try {
            jj var3 = null;
            rv var3_ref = null;
            RuntimeException var3_ref2 = null;
            jea var4 = null;
            int var5 = 0;
            mi var6 = null;
            vna var7 = null;
            cr var8 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_5_0 = 0;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              var7 = lp.a((byte) 48, param0);
              var5 = 80 / ((-44 - param1) / 36);
              var8 = new cr(var7);
              var6 = ed.a(var8, -31733);
              if (var8.a((byte) 85)) {
                ((gq) this).a((byte) -80, (Object) (Object) var6.a(-1, ((gq) this).field_v));
                stackOut_2_0 = 1;
                stackIn_3_0 = stackOut_2_0;
                return stackIn_3_0 != 0;
              } else {
                throw new jj(var8.c((byte) -127).field_h);
              }
            } catch (jj decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (jj) (Object) decompiledCaughtException;
              param0 = "<col=55ff55>" + param0.substring(0, var3.field_a) + "</col>" + param0.substring(var3.field_a);
              var4 = (jea) (Object) ((gq) this).field_a.field_tb.field_J.b(3);
              var4.field_r = ((gq) this).field_t + param0;
              return false;
            } catch (rv decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (rv) (Object) decompiledCaughtException;
              ((gq) this).a(123, var3_ref.field_b);
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L0: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) var3_ref2;
                stackOut_7_1 = new StringBuilder().append("gq.G(");
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param0 == null) {
                  stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
                  stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L0;
                } else {
                  stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
                  stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L0;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void f(int param0) {
        field_u = null;
        if (param0 != 39) {
            gq.f(51);
        }
        field_w = null;
    }

    gq(vna param0, il param1, fia param2) {
        super(param1, param2);
        int var4_int = 0;
        ela var5 = null;
        try {
            ((gq) this).field_v = new ela[param0.a((byte) -16)];
            var4_int = 0;
            var5 = (ela) (Object) param0.f(-80);
            while (var5 != null) {
                int incrementValue$0 = var4_int;
                var4_int++;
                ((gq) this).field_v[incrementValue$0] = var5;
                var5 = (ela) (Object) param0.e(125);
            }
            ((gq) this).a(-124, "# <col=ffaaff>FunOrbConsole (loaded " + ((gq) this).field_v.length + " methods at " + new Date() + ")</col>");
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "gq.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final String[] a(boolean param0) {
        int var3 = 0;
        mi[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        String[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        ela var10 = null;
        int var11 = 0;
        Object var12 = null;
        String var13 = null;
        mi var14 = null;
        vj var15 = null;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var13 = ((gq) this).field_o.e((byte) -115);
          var6 = var13;
          var6 = var13;
          var3 = ((gq) this).field_o.j(-1320);
          var4 = ih.a((byte) 126, var13);
          var5 = qa.a(true, var4, var3);
          if (!param0) {
            break L0;
          } else {
            var12 = null;
            boolean discarded$2 = ((gq) this).a((String) null, (byte) -83);
            break L0;
          }
        }
        L1: {
          ((gq) this).field_p.field_qb = 0;
          var6 = "";
          if (var5 >= 0) {
            L2: {
              var14 = var4[var5];
              var8_int = -var14.field_h + var3;
              if (var14.field_p != tr.field_f) {
                break L2;
              } else {
                if (var8_int <= 0) {
                  break L2;
                } else {
                  var6 = var14.field_m.substring(0, Math.min(var14.field_m.length(), var8_int));
                  ((gq) this).field_p.field_qb = ((gq) this).field_m.b(var13.substring(0, var14.field_h));
                  break L1;
                }
              }
            }
            var9 = var5;
            var10_int = 0;
            L3: while (true) {
              L4: {
                if (var9 < 0) {
                  break L4;
                } else {
                  L5: {
                    if (var4[var9].field_p != rs.field_a) {
                      break L5;
                    } else {
                      var10_int++;
                      break L5;
                    }
                  }
                  L6: {
                    if (var4[var9].field_p == lna.field_a) {
                      var10_int--;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (var10_int >= 0) {
                    var9--;
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (0 >= var9) {
                break L1;
              } else {
                if (tr.field_f == var4[var9 + -1].field_p) {
                  var6 = var4[var9 - 1].field_m;
                  ((gq) this).field_p.field_qb = ((gq) this).field_m.b(var13.substring(0, var4[var9 + -1].field_h));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          } else {
            break L1;
          }
        }
        var15 = this.b(param0, var6);
        var8 = new String[var15.a((byte) -99)];
        var9 = 0;
        var10 = (ela) (Object) var15.b((byte) 38);
        L7: while (true) {
          if (var10 == null) {
            return var8;
          } else {
            int incrementValue$3 = var9;
            var9++;
            var8[incrementValue$3] = var10.field_k;
            var10 = (ela) (Object) var15.c(28);
            continue L7;
          }
        }
    }

    public final boolean a(byte param0, char param1, int param2) {
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        char stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        char stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (!((gq) this).a(-2)) {
          return super.a((byte) -72, param1, param2);
        } else {
          var12 = ((gq) this).field_o.e((byte) -106);
          var5 = ((gq) this).field_o.j(-1320);
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          L0: while (true) {
            if (var5 <= var9) {
              L1: {
                if (var5 > 0) {
                  stackOut_26_0 = var12.charAt(-1 + var5);
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = 65535;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              L2: {
                var9 = stackIn_27_0;
                if (var12.length() > var5) {
                  stackOut_29_0 = var12.charAt(var5);
                  stackIn_30_0 = stackOut_29_0;
                  break L2;
                } else {
                  stackOut_28_0 = 65535;
                  stackIn_30_0 = stackOut_28_0;
                  break L2;
                }
              }
              L3: {
                L4: {
                  L5: {
                    var10 = stackIn_30_0;
                    if (var6 == 0) {
                      break L5;
                    } else {
                      if (var8 != 0) {
                        break L5;
                      } else {
                        if (34 != param1) {
                          break L5;
                        } else {
                          if (var10 == 34) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  L6: {
                    if (var7 == 0) {
                      break L6;
                    } else {
                      if (var8 != 0) {
                        break L6;
                      } else {
                        if (39 != param1) {
                          break L6;
                        } else {
                          if (var10 == 39) {
                            break L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (var6 != 0) {
                      break L7;
                    } else {
                      if (var7 != 0) {
                        break L7;
                      } else {
                        if (param1 != 41) {
                          break L7;
                        } else {
                          if (var10 != 41) {
                            break L7;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L8: {
                    if (85 != param2) {
                      break L8;
                    } else {
                      L9: {
                        L10: {
                          if (40 != var9) {
                            break L10;
                          } else {
                            if (var10 == 41) {
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
                              if (34 == var10) {
                                break L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                        if (var7 == 0) {
                          break L8;
                        } else {
                          if (var9 != 39) {
                            break L8;
                          } else {
                            if (39 == var10) {
                              break L9;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      boolean discarded$6 = ((gq) this).field_o.a(101, -19696, '￿');
                      break L8;
                    }
                  }
                  L12: {
                    boolean discarded$7 = super.a((byte) -72, param1, param2);
                    var4 = ((gq) this).field_o.e((byte) -124);
                    var5 = ((gq) this).field_o.j(-1320);
                    if (var6 != 0) {
                      if (var6 == 0) {
                        if (var7 != 0) {
                          break L12;
                        } else {
                          if (param1 != 34) {
                            break L12;
                          } else {
                            boolean discarded$8 = ((gq) this).field_o.a(-1, -19696, '"');
                            ((gq) this).field_o.a(var5, (byte) 95, var5);
                            break L12;
                          }
                        }
                      } else {
                        if (var6 != 0) {
                          break L12;
                        } else {
                          if (var7 != 0) {
                            break L12;
                          } else {
                            if (param1 != 34) {
                              break L12;
                            } else {
                              boolean discarded$9 = ((gq) this).field_o.a(-1, -19696, '"');
                              ((gq) this).field_o.a(var5, (byte) 95, var5);
                              break L12;
                            }
                          }
                        }
                      }
                    } else {
                      if (var7 != 0) {
                        break L12;
                      } else {
                        if (param1 != 34) {
                          break L12;
                        } else {
                          boolean discarded$10 = ((gq) this).field_o.a(-1, -19696, '"');
                          ((gq) this).field_o.a(var5, (byte) 95, var5);
                          break L12;
                        }
                      }
                    }
                  }
                  if (var6 != 0) {
                    break L3;
                  } else {
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (param1 != 39) {
                        break L3;
                      } else {
                        boolean discarded$11 = ((gq) this).field_o.a(-1, -19696, '\'');
                        ((gq) this).field_o.a(var5, (byte) 72, var5);
                        break L3;
                      }
                    }
                  }
                }
                ((gq) this).field_o.c(1 + var5, 1);
                break L3;
              }
              gsa.field_w = opa.a(((gq) this).field_o.e((byte) -112), (byte) -110);
              if (param0 == -72) {
                return true;
              } else {
                ((gq) this).field_v = null;
                return true;
              }
            } else {
              if (var8 == 0) {
                L13: {
                  L14: {
                    var10 = var12.charAt(var9);
                    if (var6 != 0) {
                      break L14;
                    } else {
                      if (var7 != 0) {
                        break L14;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_15_0 = stackOut_9_0;
                        break L13;
                      }
                    }
                  }
                  if (var10 == 92) {
                    stackOut_13_0 = 1;
                    stackIn_15_0 = stackOut_13_0;
                    break L13;
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_15_0 = stackOut_12_0;
                    break L13;
                  }
                }
                L15: {
                  L16: {
                    var8 = stackIn_15_0;
                    stackOut_15_0 = var6;
                    stackIn_18_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (var7 != 0) {
                      break L16;
                    } else {
                      stackOut_16_0 = stackIn_16_0;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (var10 != 34) {
                        break L16;
                      } else {
                        stackOut_17_0 = stackIn_17_0;
                        stackOut_17_1 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        break L15;
                      }
                    }
                  }
                  stackOut_18_0 = stackIn_18_0;
                  stackOut_18_1 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L15;
                }
                L17: {
                  L18: {
                    var6 = stackIn_19_0 ^ stackIn_19_1;
                    stackOut_19_0 = var7;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var6 != 0) {
                      break L18;
                    } else {
                      stackOut_20_0 = stackIn_20_0;
                      stackIn_22_0 = stackOut_20_0;
                      stackIn_21_0 = stackOut_20_0;
                      if (var10 != 39) {
                        break L18;
                      } else {
                        stackOut_21_0 = stackIn_21_0;
                        stackOut_21_1 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        stackIn_23_1 = stackOut_21_1;
                        break L17;
                      }
                    }
                  }
                  stackOut_22_0 = stackIn_22_0;
                  stackOut_22_1 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  stackIn_23_1 = stackOut_22_1;
                  break L17;
                }
                var7 = stackIn_23_0 ^ stackIn_23_1;
                var9++;
                continue L0;
              } else {
                var8 = 0;
                var9++;
                continue L0;
              }
            }
          }
        }
    }

    public final void b(int param0) {
        String var3 = ((gq) this).field_o.field_Cb.field_r;
        String var2 = var3;
        ((gq) this).field_o.field_Cb.field_r = gsa.field_w;
        super.b(param0);
        ((gq) this).field_o.field_Cb.field_r = var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new ica();
        field_u = new dn();
    }
}
