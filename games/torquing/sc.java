/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc extends hn implements fp, ng {
    private nm field_C;
    private rb field_D;
    private lg field_E;

    private final String h(int param0) {
        if (param0 != -29996) {
            lg var3 = (lg) null;
            this.a((byte) -117, (lg) null, -25, -101, -74);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    sc(nm param0) {
        super(0, 0, 288, 0, (el) null);
        String var7 = null;
        int var3 = 0;
        pc var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_C = param0;
            this.field_E = new lg(vd.field_d, (ca) null);
            this.field_E.field_q = (el) ((Object) new rf());
            var7 = ff.a(new String[]{this.h(-29996), this.i(119)}, 0, md.field_d);
            var3 = 20;
            var4 = new pc(dg.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, dg.field_e.field_x, -1, 2147483647, true);
            this.field_D = new rb(var7, var4);
            this.field_D.field_n = "";
            this.field_D.a(0, (byte) -115, jp.field_e);
            this.field_D.a(1, (byte) -93, jp.field_e);
            this.field_D.field_p = -40 + this.field_p;
            this.field_D.field_t = (ca) (this);
            this.field_D.a((byte) 46, 26, this.field_p - 40, var3);
            var3 = var3 + (15 + this.field_D.field_o);
            this.a(this.field_D, -6938);
            var5 = 4;
            var6 = 200;
            this.field_E.a((byte) -97, 300 + -var6 >> -456922623, var3, 40, var6);
            this.field_E.field_t = (ca) (this);
            this.a(this.field_E, -6938);
            this.a((byte) -49, 0, 0, var3 - (-55 + -var5), 300);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "sc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, java.awt.Color param1, boolean param2, byte param3, String param4) {
        Exception exception = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = k.field_d.getGraphics();
                  if (vb.field_d == null) {
                    vb.field_d = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param2) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, wk.field_d, ul.field_a);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 != null) {
                    break L4;
                  } else {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (of.field_u == null) {
                        of.field_u = k.field_d.createImage(304, 34);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = of.field_u.getGraphics();
                    var10.setColor(param1);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, param0 * 3, 30);
                    var7 = 19 % ((-41 - param3) / 52);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(param0 * 3 + 2, 2, -(param0 * 3) + 300, 30);
                    var10.setFont(vb.field_d);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param4, (-(6 * param4.length()) + 304) / 2, 22);
                    var9.drawImage(of.field_u, wk.field_d / 2 + -152, -18 + ul.field_a / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + wk.field_d / 2;
                    var8 = ul.field_a / 2 + -18;
                    var9.setColor(param1);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 + 2, 3 * param0, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(1 + var7, 1 + var8, 301, 31);
                    var9.fillRect(2 + (var7 + 3 * param0), var8 - -2, 300 - param0 * 3, 30);
                    var9.setFont(vb.field_d);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param4, var7 - -((-(6 * param4.length()) + 304) / 2), var8 - -22);
                    break L7;
                  }
                }
                if (null == rh.field_a) {
                  break L1;
                } else {
                  var9.setFont(vb.field_d);
                  var9.setColor(java.awt.Color.white);
                  var9.drawString(rh.field_a, wk.field_d / 2 - rh.field_a.length() * 6 / 2, ul.field_a / 2 + -26);
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              k.field_d.repaint();
              return;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("sc.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
    }

    public final void a(byte param0, int param1, int param2, rb param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Torquing.field_u;
        try {
          L0: {
            if (param0 > 106) {
              if (param2 != 0) {
                if (1 != param2) {
                  if (2 != param2) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    d.a("conduct.ws", (byte) 31);
                    return;
                  }
                } else {
                  d.a("privacy.ws", (byte) 31);
                  return;
                }
              } else {
                d.a("terms.ws", (byte) 31);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var5);

            stackIn_12_1 = new StringBuilder().append("sc.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L1;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(byte param0, lg param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 < -85) {
                break L1;
              } else {
                this.field_C = (nm) null;
                break L1;
              }
            }
            if (param1 == this.field_E) {
              m.c(-119);
              this.field_C.b(true);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("sc.NA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean a(int param0, gm param1, char param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, 98)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 == 98) {
                stackIn_7_0 = this.a((byte) 19, param1);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5_int = -40 % ((-33 - param3) / 57);
                if (99 != param0) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.b(param1, -9928);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("sc.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    private final String i(int param0) {
        if (param0 <= 117) {
            this.field_E = (lg) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    static {
    }
}
