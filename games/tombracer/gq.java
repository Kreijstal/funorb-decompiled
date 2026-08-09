/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gq extends uta {
    private ela[] field_v;
    static ica field_w;
    static dn field_u;

    final void e(int param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int var3;
        mi[] var4;
        int var5;
        String var6;
        int var8_int;
        StringBuilder var8;
        int var9;
        int var10;
        int var11;
        ela var12_ref_ela;
        int var12;
        ela var13;
        int var14;
        String var15;
        mi var16;
        vj var17;
        L0: {
          var14 = TombRacer.field_G ? 1 : 0;
          var15 = this.field_o.e((byte) -114);
          var6 = var15;
          var6 = var15;
          var3 = this.field_o.j(-1320);
          var4 = ih.a((byte) 126, var15);
          var5 = qa.a(true, var4, var3);
          var6 = "";
          if ((var5 ^ -1) > -1) {
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
          var12_ref_ela = (ela) ((Object) var17.b((byte) 38));
          L1: while (true) {
            if (var12_ref_ela == null) {
              L2: while (true) {
                L3: {
                  L4: {
                    if (var10 == 0) {
                      break L4;
                    } else {
                      stackIn_19_0 = var9 ^ -1;

                      stackIn_19_1 = var11 ^ -1;

                      if (stackIn_19_0 <= stackIn_19_1) {
                        break L4;
                      } else {
                        var12 = ((ela) ((Object) var17.b((byte) 38))).field_l.charAt(var9);
                        var13 = (ela) ((Object) var17.c(param0 ^ 21291));
                        L5: while (true) {
                          if (var13 == null) {
                            if (var10 != 0) {
                              discarded$0 = var8.append((char) var12);
                              var9++;
                              continue L2;
                            } else {
                              var9++;
                              continue L2;
                            }
                          } else {
                            L6: {
                              stackIn_24_0 = var10;

                              if ((var12 ^ -1) != (var13.field_l.charAt(var9) ^ -1)) {
                                stackIn_25_0 = stackIn_24_0;
                                stackIn_25_1 = 0;
                                break L6;
                              } else {
                                stackIn_25_0 = stackIn_24_0;
                                stackIn_25_1 = 1;
                                break L6;
                              }
                            }
                            var10 = stackIn_25_0 & stackIn_25_1;
                            var13 = (ela) ((Object) var17.c(28));
                            continue L5;
                          }
                        }
                      }
                    }
                  }
                  if (param0 == 21303) {
                    break L3;
                  } else {
                    field_w = (ica) null;
                    break L3;
                  }
                }
                L7: {
                  var12 = var3 - -var8.length();
                  if (var6.length() - -var8.length() != var11) {
                    break L7;
                  } else {
                    discarded$1 = var8.append("()");
                    var12++;
                    if (1 != var17.a((byte) -34)) {
                      break L7;
                    } else {
                      if (((ela) ((Object) var17.b((byte) 38))).field_n.length == 0) {
                        var12++;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                this.field_o.a((byte) 96, var15.substring(0, var3) + var8.toString() + var15.substring(var3));
                this.field_o.c(var12, 1);
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
              var12_ref_ela = (ela) ((Object) var17.c(param0 + -21275));
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
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3 = new vj();
              var4 = 0;
              if (!param0) {
                break L1;
              } else {
                field_u = (dn) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var4 >= this.field_v.length) {
                stackIn_8_0 = (vj) (var3);
                break L0;
              } else {
                L3: {
                  if (!this.field_v[var4].field_l.startsWith(param1)) {
                    break L3;
                  } else {
                    this.field_v[var4].c(-7975);
                    var3.a(this.field_v[var4], (byte) -78);
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
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("gq.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var7 = lp.a((byte) 48, param0);
                    var5 = 80 / ((-44 - param1) / 36);
                    var8 = new cr(var7);
                    var6 = ed.a(var8, -31733);
                    if (var8.a((byte) 85)) {
                      this.a((byte) -80, var6.a(-1, this.field_v));
                      stackIn_3_0 = 1;
                      break L1;
                    } else {
                      throw new jj(var8.c((byte) -127).field_h);
                    }
                  }
                } catch (jj decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3 = (jj) (Object) decompiledCaughtException;
                  param0 = "<col=55ff55>" + param0.substring(0, var3.field_a) + "</col>" + param0.substring(var3.field_a);
                  var4 = (jea) ((Object) this.field_a.field_tb.field_J.b(3));
                  var4.field_r = this.field_t + param0;
                  return false;
                } catch (rv decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var3_ref = (rv) (Object) decompiledCaughtException;
                  this.a(123, var3_ref.field_b);
                  stackIn_6_0 = 0;
                  return stackIn_6_0 != 0;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L2: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var3_ref2);

                stackIn_9_1 = new StringBuilder().append("gq.G(");

                if (param0 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
            }
            return stackIn_3_0 != 0;
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
        int incrementValue$0 = 0;
        try {
            this.field_v = new ela[param0.a((byte) -16)];
            var4_int = 0;
            var5 = (ela) ((Object) param0.f(-80));
            while (var5 != null) {
                incrementValue$0 = var4_int;
                var4_int++;
                this.field_v[incrementValue$0] = var5;
                var5 = (ela) ((Object) param0.e(125));
            }
            this.a(-124, "# <col=ffaaff>FunOrbConsole (loaded " + this.field_v.length + " methods at " + new Date() + ")</col>");
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "gq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final String[] a(boolean param0) {
        int incrementValue$0 = 0;
        int var3;
        mi[] var4;
        int var5;
        String var6;
        int var8_int;
        String[] var8;
        int var9;
        int var10_int;
        ela var10;
        int var11;
        String var12;
        String var13;
        mi var14;
        vj var15;
        L0: {
          var11 = TombRacer.field_G ? 1 : 0;
          var13 = this.field_o.e((byte) -115);
          var6 = var13;
          var6 = var13;
          var3 = this.field_o.j(-1320);
          var4 = ih.a((byte) 126, var13);
          var5 = qa.a(true, var4, var3);
          if (!param0) {
            break L0;
          } else {
            var12 = (String) null;
            this.a((String) null, (byte) -83);
            break L0;
          }
        }
        L1: {
          this.field_p.field_qb = 0;
          var6 = "";
          if ((var5 ^ -1) <= -1) {
            L2: {
              var14 = var4[var5];
              var8_int = -var14.field_h + var3;
              if (var14.field_p != tr.field_f) {
                break L2;
              } else {
                if ((var8_int ^ -1) >= -1) {
                  break L2;
                } else {
                  var6 = var14.field_m.substring(0, Math.min(var14.field_m.length(), var8_int));
                  this.field_p.field_qb = this.field_m.b(var13.substring(0, var14.field_h));
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
                  if (-1 >= (var10_int ^ -1)) {
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
                  this.field_p.field_qb = this.field_m.b(var13.substring(0, var4[var9 + -1].field_h));
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
        var10 = (ela) ((Object) var15.b((byte) 38));
        L7: while (true) {
          if (var10 == null) {
            return var8;
          } else {
            incrementValue$0 = var9;
            var9++;
            var8[incrementValue$0] = var10.field_k;
            var10 = (ela) ((Object) var15.c(28));
            continue L7;
          }
        }
    }

    public final boolean a(byte param0, char param1, int param2) {
        boolean discarded$0 = false;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        String var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        String var12;
        var11 = TombRacer.field_G ? 1 : 0;
        if (!this.a(-2)) {
          return super.a((byte) -72, param1, param2);
        } else {
          var12 = this.field_o.e((byte) -106);
          var5 = this.field_o.j(-1320);
          var6 = 0;
          var7 = 0;
          var8 = 0;
          var9 = 0;
          L0: while (true) {
            if (var5 <= var9) {
              L1: {
                if (-1 > (var5 ^ -1)) {
                  stackIn_27_0 = var12.charAt(-1 + var5);
                  break L1;
                } else {
                  stackIn_27_0 = 65535;
                  break L1;
                }
              }
              L2: {
                var9 = stackIn_27_0;
                if (var12.length() > var5) {
                  stackIn_30_0 = var12.charAt(var5);
                  break L2;
                } else {
                  stackIn_30_0 = 65535;
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
                      this.field_o.a(101, -19696, '￿');
                      break L8;
                    }
                  }
                  L12: {
                    discarded$0 = super.a((byte) -72, param1, param2);
                    var4 = this.field_o.e((byte) -124);
                    var5 = this.field_o.j(-1320);
                    if (var6 == 0) {
                      if (var7 == 0) {
                        L13: {
                          if (param1 == 40) {
                            this.field_o.a(-1, -19696, ')');
                            this.field_o.a(var5, (byte) 84, var5);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        if (var6 != 0) {
                          break L12;
                        } else {
                          if (var7 != 0) {
                            break L12;
                          } else {
                            if (param1 != 34) {
                              break L12;
                            } else {
                              this.field_o.a(-1, -19696, '"');
                              this.field_o.a(var5, (byte) 95, var5);
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
                            if (param1 != 34) {
                              break L12;
                            } else {
                              this.field_o.a(-1, -19696, '"');
                              this.field_o.a(var5, (byte) 95, var5);
                              break L12;
                            }
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
                          if (param1 != 34) {
                            break L12;
                          } else {
                            this.field_o.a(-1, -19696, '"');
                            this.field_o.a(var5, (byte) 95, var5);
                            break L12;
                          }
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
                        this.field_o.a(-1, -19696, '\'');
                        this.field_o.a(var5, (byte) 72, var5);
                        break L3;
                      }
                    }
                  }
                }
                this.field_o.c(1 + var5, 1);
                break L3;
              }
              gsa.field_w = opa.a(this.field_o.e((byte) -112), (byte) -110);
              if (param0 == -72) {
                return true;
              } else {
                this.field_v = (ela[]) null;
                return true;
              }
            } else {
              if (var8 == 0) {
                L14: {
                  L15: {
                    var10 = var12.charAt(var9);
                    if (var6 != 0) {
                      break L15;
                    } else {
                      if (var7 != 0) {
                        break L15;
                      } else {
                        stackIn_15_0 = 0;
                        break L14;
                      }
                    }
                  }
                  if (var10 == 92) {
                    stackIn_15_0 = 1;
                    break L14;
                  } else {
                    stackIn_15_0 = 0;
                    break L14;
                  }
                }
                L16: {
                  L17: {
                    var8 = stackIn_15_0;
                    stackIn_18_0 = var6;

                    if (var7 != 0) {
                      break L17;
                    } else {

                      if (var10 != 34) {
                        break L17;
                      } else {
                        stackIn_19_0 = stackIn_18_0;
                        stackIn_19_1 = 1;
                        break L16;
                      }
                    }
                  }
                  stackIn_19_0 = stackIn_18_0;
                  stackIn_19_1 = 0;
                  break L16;
                }
                L18: {
                  L19: {
                    var6 = stackIn_19_0 ^ stackIn_19_1;
                    stackIn_22_0 = var7;

                    if (var6 != 0) {
                      break L19;
                    } else {

                      if (var10 != 39) {
                        break L19;
                      } else {
                        stackIn_23_0 = stackIn_22_0;
                        stackIn_23_1 = 1;
                        break L18;
                      }
                    }
                  }
                  stackIn_23_0 = stackIn_22_0;
                  stackIn_23_1 = 0;
                  break L18;
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
        String var3 = this.field_o.field_Cb.field_r;
        String var2 = var3;
        this.field_o.field_Cb.field_r = gsa.field_w;
        super.b(param0);
        this.field_o.field_Cb.field_r = var3;
    }

    static {
        field_w = new ica();
        field_u = new dn();
    }
}
