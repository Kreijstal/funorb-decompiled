/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class djb extends qc {
    private rqa[] field_t;
    static boolean field_r;
    static ima[][] field_s;

    final void a(int param0) {
        int var3 = 0;
        tsa[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        rqa var12_ref_rqa = null;
        int var12 = 0;
        rqa var13 = null;
        int var14 = 0;
        String var15 = null;
        tsa var16 = null;
        vga var17 = null;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        L0: {
          var14 = VoidHunters.field_G;
          var15 = ((djb) this).field_p.l(-14453);
          var6 = var15;
          var6 = var15;
          var3 = ((djb) this).field_p.j(param0 ^ param0);
          var4 = dib.a(var15, 90);
          var5 = aab.a(var4, -25223, var3);
          var6 = "";
          if (0 <= var5) {
            var16 = var4[var5];
            var8_int = var3 + -var16.field_g;
            if (var16.field_e != hpa.field_p) {
              break L0;
            } else {
              if (var8_int <= 0) {
                break L0;
              } else {
                if (var8_int <= var16.field_d.length()) {
                  var6 = var16.field_d.substring(0, var8_int);
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
        int discarded$3 = 28;
        var17 = this.a(var6);
        if (var17.c(param0 + 35) != 0) {
          var8 = new StringBuilder();
          var9 = var6.length();
          var10 = 1;
          var11 = 2147483647;
          var12_ref_rqa = (rqa) (Object) var17.a((byte) -54);
          L1: while (true) {
            if (var12_ref_rqa == null) {
              L2: while (true) {
                L3: {
                  if (var10 == 0) {
                    break L3;
                  } else {
                    if (var9 >= var11) {
                      break L3;
                    } else {
                      var12 = ((rqa) (Object) var17.a((byte) -54)).field_k.charAt(var9);
                      var13 = (rqa) (Object) var17.a(1900);
                      L4: while (true) {
                        if (var13 == null) {
                          if (var10 != 0) {
                            StringBuilder discarded$4 = var8.append(var12);
                            var9++;
                            continue L2;
                          } else {
                            var9++;
                            continue L2;
                          }
                        } else {
                          L5: {
                            stackOut_18_0 = var10;
                            stackIn_20_0 = stackOut_18_0;
                            stackIn_19_0 = stackOut_18_0;
                            if (var13.field_k.charAt(var9) != var12) {
                              stackOut_20_0 = stackIn_20_0;
                              stackOut_20_1 = 0;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              break L5;
                            } else {
                              stackOut_19_0 = stackIn_19_0;
                              stackOut_19_1 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              stackIn_21_1 = stackOut_19_1;
                              break L5;
                            }
                          }
                          var10 = stackIn_21_0 & stackIn_21_1;
                          var13 = (rqa) (Object) var17.a(1900);
                          continue L4;
                        }
                      }
                    }
                  }
                }
                L6: {
                  var12 = var3 + var8.length();
                  if (var6.length() - -var8.length() != var11) {
                    break L6;
                  } else {
                    var12++;
                    StringBuilder discarded$5 = var8.append("()");
                    if (var17.c(0) != 1) {
                      break L6;
                    } else {
                      if (((rqa) (Object) var17.a((byte) -54)).field_n.length == 0) {
                        var12++;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                ((djb) this).field_p.a(var15.substring(0, var3) + var8.toString() + var15.substring(var3), -110);
                ((djb) this).field_p.a((byte) -48, var12);
                return;
              }
            } else {
              L7: {
                if (var12_ref_rqa.field_k.length() >= var11) {
                  break L7;
                } else {
                  var11 = var12_ref_rqa.field_k.length();
                  break L7;
                }
              }
              var12_ref_rqa = (rqa) (Object) var17.a(1900);
              continue L1;
            }
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        int var2 = -15 / ((param0 - 44) / 43);
        String var3 = ((djb) this).field_p.field_Fb.field_R;
        ((djb) this).field_p.field_Fb.field_R = nv.field_r;
        super.b((byte) -74);
        ((djb) this).field_p.field_Fb.field_R = var3;
    }

    final String[] d(int param0) {
        int var3 = 0;
        tsa[] var4 = null;
        int var5 = 0;
        String var6 = null;
        String[] var8 = null;
        int var8_int = 0;
        int var9 = 0;
        rqa var10 = null;
        int var10_int = 0;
        int var11 = 0;
        String var12 = null;
        tsa var13 = null;
        vga var14 = null;
        L0: {
          var11 = VoidHunters.field_G;
          if (param0 < -4) {
            break L0;
          } else {
            djb.c((byte) 38);
            break L0;
          }
        }
        L1: {
          var12 = ((djb) this).field_p.l(-14453);
          var3 = ((djb) this).field_p.j(0);
          var4 = dib.a(var12, 83);
          var5 = aab.a(var4, -25223, var3);
          ((djb) this).field_o.field_L = 0;
          var6 = "";
          if (var5 < 0) {
            break L1;
          } else {
            L2: {
              var13 = var4[var5];
              var8_int = -var13.field_g + var3;
              if (hpa.field_p != var13.field_e) {
                break L2;
              } else {
                if (var8_int > 0) {
                  var6 = var13.field_d.substring(0, Math.min(var13.field_d.length(), var8_int));
                  ((djb) this).field_o.field_L = ((djb) this).field_n.b(var12.substring(0, var13.field_g));
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var9 = var5;
            var10_int = 0;
            L3: while (true) {
              L4: {
                if (0 > var9) {
                  break L4;
                } else {
                  L5: {
                    if (ua.field_o != var4[var9].field_e) {
                      break L5;
                    } else {
                      var10_int++;
                      break L5;
                    }
                  }
                  L6: {
                    if (wdb.field_vb == var4[var9].field_e) {
                      var10_int--;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  if (var10_int < 0) {
                    break L4;
                  } else {
                    var9--;
                    continue L3;
                  }
                }
              }
              if (var9 <= 0) {
                break L1;
              } else {
                if (hpa.field_p == var4[var9 - 1].field_e) {
                  var6 = var4[var9 + -1].field_d;
                  ((djb) this).field_o.field_L = ((djb) this).field_n.b(var12.substring(0, var4[-1 + var9].field_g));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
        int discarded$2 = 28;
        var14 = this.a(var6);
        var8 = new String[var14.c(0)];
        var9 = 0;
        var10 = (rqa) (Object) var14.a((byte) -54);
        L7: while (true) {
          if (var10 == null) {
            return var8;
          } else {
            int incrementValue$3 = var9;
            var9++;
            var8[incrementValue$3] = var10.field_l;
            var10 = (rqa) (Object) var14.a(1900);
            continue L7;
          }
        }
    }

    djb(ij param0, no param1, eab param2) {
        super(param1, param2);
        int var4_int = 0;
        rqa var5 = null;
        try {
            ((djb) this).field_t = new rqa[param0.c(3)];
            var4_int = 0;
            var5 = (rqa) (Object) param0.d(0);
            while (var5 != null) {
                int incrementValue$0 = var4_int;
                var4_int++;
                ((djb) this).field_t[incrementValue$0] = var5;
                var5 = (rqa) (Object) param0.a((byte) 92);
            }
            ((djb) this).a((byte) 93, "# <col=ffaaff>FunOrbConsole (loaded " + ((djb) this).field_t.length + " methods at " + new Date() + ")</col>");
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "djb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(int param0, String param1) {
        try {
            ojb var3 = null;
            gva var3_ref = null;
            RuntimeException var3_ref2 = null;
            llb var4 = null;
            tsa var5 = null;
            ij var6 = null;
            ipb var7 = null;
            int stackIn_6_0 = 0;
            int stackIn_9_0 = 0;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            String stackIn_13_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_8_0 = 0;
            RuntimeException stackOut_10_0 = null;
            StringBuilder stackOut_10_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            String stackOut_11_2 = null;
            try {
              L0: {
                var6 = ck.a(-1, param1);
                if (param0 == -10278) {
                  break L0;
                } else {
                  djb.c((byte) 96);
                  break L0;
                }
              }
              var7 = new ipb(var6);
              var5 = lhb.a((byte) 105, var7);
              if (!var7.a(100)) {
                throw new ojb(var7.a((byte) -69).field_g);
              } else {
                ((djb) this).a((Object) (Object) var5.a((byte) 114, ((djb) this).field_t), -110);
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } catch (ojb decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = (ojb) (Object) decompiledCaughtException;
              param1 = "<col=55ff55>" + param1.substring(0, var3.field_a) + "</col>" + param1.substring(var3.field_a);
              var4 = (llb) (Object) ((djb) this).field_h.field_wb.field_lb.b((byte) 122);
              var4.field_R = ((djb) this).field_c + param1;
              return false;
            } catch (gva decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (gva) (Object) decompiledCaughtException;
              ((djb) this).a((byte) 89, var3_ref.field_b);
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0 != 0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L1: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_10_0 = (RuntimeException) var3_ref2;
                stackOut_10_1 = new StringBuilder().append("djb.G(").append(param0).append(44);
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                if (param1 == null) {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "null";
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  break L1;
                } else {
                  stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
                  stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
                  stackOut_11_2 = "{...}";
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L1;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(byte param0) {
        field_s = null;
        int var1 = -118 % ((83 - param0) / 35);
    }

    final boolean a(int param0, char param1, int param2) {
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_28_0 = 0;
        char stackOut_27_0 = 0;
        char stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        var11 = VoidHunters.field_G;
        if (((djb) this).c(13462)) {
          L0: {
            var12 = ((djb) this).field_p.l(-14453);
            var5 = ((djb) this).field_p.j(0);
            if (param2 == -40) {
              break L0;
            } else {
              ((djb) this).a(87);
              break L0;
            }
          }
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          L1: while (true) {
            if (var9 >= var5) {
              L2: {
                if (var5 <= 0) {
                  stackOut_28_0 = 65535;
                  stackIn_29_0 = stackOut_28_0;
                  break L2;
                } else {
                  stackOut_27_0 = var12.charAt(var5 + -1);
                  stackIn_29_0 = stackOut_27_0;
                  break L2;
                }
              }
              L3: {
                var9 = stackIn_29_0;
                if (var12.length() > var5) {
                  stackOut_31_0 = var12.charAt(var5);
                  stackIn_32_0 = stackOut_31_0;
                  break L3;
                } else {
                  stackOut_30_0 = 65535;
                  stackIn_32_0 = stackOut_30_0;
                  break L3;
                }
              }
              L4: {
                L5: {
                  L6: {
                    var10 = stackIn_32_0;
                    if (var6 == 0) {
                      break L6;
                    } else {
                      if (var8 != 0) {
                        break L6;
                      } else {
                        if (param1 != 34) {
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
                        if (param1 != 39) {
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
                        if (param1 != 41) {
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
                    if (param0 != 85) {
                      break L9;
                    } else {
                      L10: {
                        L11: {
                          if (40 != var9) {
                            break L11;
                          } else {
                            if (41 == var10) {
                              break L10;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (var6 == 0) {
                            break L12;
                          } else {
                            if (var9 != 34) {
                              break L12;
                            } else {
                              if (34 == var10) {
                                break L10;
                              } else {
                                break L12;
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
                              break L10;
                            }
                          }
                        }
                      }
                      boolean discarded$7 = ((djb) this).field_p.a(101, -1, '￿');
                      break L9;
                    }
                  }
                  L13: {
                    boolean discarded$8 = super.a(param0, param1, -40);
                    var4 = ((djb) this).field_p.l(-14453);
                    var5 = ((djb) this).field_p.j(0);
                    if (var6 == 0) {
                      if (var6 == 0) {
                        if (var7 != 0) {
                          break L13;
                        } else {
                          if (param1 != 34) {
                            break L13;
                          } else {
                            boolean discarded$9 = ((djb) this).field_p.a(-1, param2 + 39, '"');
                            ((djb) this).field_p.a(var5, 31401, var5);
                            break L13;
                          }
                        }
                      } else {
                        if (var6 != 0) {
                          break L13;
                        } else {
                          if (var7 != 0) {
                            break L13;
                          } else {
                            if (param1 != 34) {
                              break L13;
                            } else {
                              boolean discarded$10 = ((djb) this).field_p.a(-1, param2 + 39, '"');
                              ((djb) this).field_p.a(var5, 31401, var5);
                              break L13;
                            }
                          }
                        }
                      }
                    } else {
                      if (var6 != 0) {
                        break L13;
                      } else {
                        if (var7 != 0) {
                          break L13;
                        } else {
                          if (param1 != 34) {
                            break L13;
                          } else {
                            boolean discarded$11 = ((djb) this).field_p.a(-1, param2 + 39, '"');
                            ((djb) this).field_p.a(var5, 31401, var5);
                            break L13;
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
                      if (param1 != 39) {
                        break L4;
                      } else {
                        boolean discarded$12 = ((djb) this).field_p.a(-1, -1, '\'');
                        ((djb) this).field_p.a(var5, 31401, var5);
                        break L4;
                      }
                    }
                  }
                }
                ((djb) this).field_p.a((byte) -73, 1 + var5);
                break L4;
              }
              int discarded$13 = 107;
              nv.field_r = bab.a(((djb) this).field_p.l(param2 + -14413));
              return true;
            } else {
              if (var8 != 0) {
                var8 = 0;
                var9++;
                continue L1;
              } else {
                L14: {
                  L15: {
                    var10 = var12.charAt(var9);
                    if (var6 != 0) {
                      break L15;
                    } else {
                      if (var7 != 0) {
                        break L15;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_17_0 = stackOut_11_0;
                        break L14;
                      }
                    }
                  }
                  if (92 == var10) {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L14;
                  } else {
                    stackOut_14_0 = 0;
                    stackIn_17_0 = stackOut_14_0;
                    break L14;
                  }
                }
                L16: {
                  L17: {
                    var8 = stackIn_17_0;
                    stackOut_17_0 = var6;
                    stackIn_20_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (var7 != 0) {
                      break L17;
                    } else {
                      stackOut_18_0 = stackIn_18_0;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var10 != 34) {
                        break L17;
                      } else {
                        stackOut_19_0 = stackIn_19_0;
                        stackOut_19_1 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_21_1 = stackOut_19_1;
                        break L16;
                      }
                    }
                  }
                  stackOut_20_0 = stackIn_20_0;
                  stackOut_20_1 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  break L16;
                }
                L18: {
                  L19: {
                    var6 = stackIn_21_0 ^ stackIn_21_1;
                    stackOut_21_0 = var7;
                    stackIn_24_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var6 != 0) {
                      break L19;
                    } else {
                      stackOut_22_0 = stackIn_22_0;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (var10 != 39) {
                        break L19;
                      } else {
                        stackOut_23_0 = stackIn_23_0;
                        stackOut_23_1 = 1;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        break L18;
                      }
                    }
                  }
                  stackOut_24_0 = stackIn_24_0;
                  stackOut_24_1 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  break L18;
                }
                var7 = stackIn_25_0 ^ stackIn_25_1;
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return super.a(param0, param1, param2);
        }
    }

    private final vga a(String param0) {
        vga var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        vga var6 = null;
        vga stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        vga stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            var6 = new vga();
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (var4 >= ((djb) this).field_t.length) {
                stackOut_10_0 = (vga) var3;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                L2: {
                  if (((djb) this).field_t[var4].field_k.startsWith(param0)) {
                    ((djb) this).field_t[var4].d((byte) -35);
                    var6.a((fh) (Object) ((djb) this).field_t[var4], -65);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3_ref;
            stackOut_12_1 = new StringBuilder().append("djb.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + 28 + 41);
        }
        return stackIn_11_0;
    }

    static {
    }
}
