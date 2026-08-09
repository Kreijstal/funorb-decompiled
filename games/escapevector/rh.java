/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rh extends bj implements qb {
    static int field_N;
    private hc[] field_K;
    static pj field_I;
    static String field_J;
    private qn field_L;
    private String[] field_M;
    static int[] field_O;
    static volatile boolean field_H;

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) 102, param2, param3);
        if (param1 < 85) {
            return;
        }
        if (param2 != 0) {
            return;
        }
        wl var5 = sb.field_a;
        if (this.field_M != null) {
            var5.a(hm.field_m, param3 - -this.field_k, param0 - -this.field_j, this.field_g, 20, 16777215, -1, 0, 0, var5.field_r + var5.field_x);
        }
    }

    final void a(String[] param0, byte param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ha var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              this.field_A.a((byte) 127);
              if (param0 == null) {
                break L1;
              } else {
                if (0 == param0.length) {
                  break L1;
                } else {
                  var3_int = param0.length;
                  this.field_M = new String[var3_int];
                  if (param1 == -103) {
                    var4_int = 0;
                    L2: while (true) {
                      if (var4_int >= var3_int) {
                        var4 = new ha(sb.field_a, 0, 1);
                        this.field_K = new hc[1 + var3_int];
                        var5 = 0;
                        L3: while (true) {
                          if (var5 >= var3_int) {
                            this.field_K[var3_int] = new hc(uj.field_c, (wn) (this));
                            this.field_K[var3_int].field_s = (db) ((Object) var4);
                            this.field_K[var3_int].a(100, 16 * (1 + var3_int) + 20, 0, true, 15);
                            this.b(this.field_K[var3_int], false);
                            decompiledRegionSelector0 = 2;
                            break L0;
                          } else {
                            this.field_K[var5] = new hc(this.field_M[var5], (wn) (this));
                            this.field_K[var5].field_s = (db) ((Object) var4);
                            this.field_K[var5].field_i = ei.field_n;
                            this.field_K[var5].a(80, 16 * var5 + 20, 0, true, 15);
                            this.b(this.field_K[var5], false);
                            var5++;
                            continue L3;
                          }
                        }
                      } else {
                        this.field_M[var4_int] = pc.a(param1 + 103, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
                        var4_int++;
                        continue L2;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
            this.field_M = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("rh.A(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    rh(qn param0) {
        super(0, 0, 0, 0, (db) null);
        try {
            this.field_L = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 91)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2 != 98) {
                L1: {
                  if (param3 >= 0) {
                    break L1;
                  } else {
                    field_N = -69;
                    break L1;
                  }
                }
                if (99 == param2) {
                  stackIn_12_0 = this.a(param0, true);
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  return false;
                }
              } else {
                stackIn_6_0 = this.a((byte) 22, param0);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("rh.G(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void j(int param0) {
        field_O = null;
        field_I = null;
        field_J = null;
        if (param0 != -24896) {
            field_J = (String) null;
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Color param2, int param3, String param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = of.field_d.getGraphics();
                  if (null == cg.field_l) {
                    cg.field_l = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (!param1) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, pd.field_b, ad.field_d);
                    break L3;
                  }
                }
                L4: {
                  if (param2 == null) {
                    param2 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null == bj.field_z) {
                        bj.field_z = of.field_d.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = bj.field_z.getGraphics();
                    var10.setColor(param2);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param3, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(3 * param3 + 2, 2, -(3 * param3) + 300, 30);
                    var10.setFont(cg.field_l);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param4, (304 + -(param4.length() * 6)) / 2, 22);
                    var9.drawImage(bj.field_z, -152 + pd.field_b / 2, -18 + ad.field_d / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + pd.field_b / 2;
                    var8 = ad.field_d / 2 + -18;
                    var9.setColor(param2);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(var7 - -2, 2 + var8, param3 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, var8 - -1, 301, 31);
                    var9.fillRect(2 + (var7 - -(3 * param3)), 2 + var8, -(3 * param3) + 300, 30);
                    var9.setFont(cg.field_l);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param4, (-(6 * param4.length()) + 304) / 2 + var7, 22 + var8);
                    break L7;
                  }
                }
                L8: {
                  if (pg.field_e != null) {
                    var9.setFont(cg.field_l);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(pg.field_e, pd.field_b / 2 - 6 * pg.field_e.length() / 2, ad.field_d / 2 - 26);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                of.field_d.repaint();
                break L9;
              }
            }
            L10: {
              if (param0 == 9) {
                break L10;
              } else {
                field_O = (int[]) null;
                break L10;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L11: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5_ref);

            stackIn_24_1 = new StringBuilder().append("rh.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L12;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), stackIn_28_2 + ')');
        }
    }

    public final void a(hc param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param3 == 1) {
                break L1;
              } else {
                field_I = (pj) null;
                break L1;
              }
            }
            var6_int = 0;
            L2: while (true) {
              if (var6_int >= this.field_M.length) {
                L3: {
                  if (param0 != this.field_K[this.field_M.length]) {
                    break L3;
                  } else {
                    this.field_L.a((byte) -61);
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  if (this.field_K[var6_int] == param0) {
                    this.field_L.a((byte) -98, this.field_M[var6_int]);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var6);

            stackIn_15_1 = new StringBuilder().append("rh.K(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_J = "ON";
        field_O = new int[4];
        field_H = true;
    }
}
