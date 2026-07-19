/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static lb field_j;
    static int field_e;
    static String[] field_i;
    private ck[] field_d;
    static String field_f;
    static String field_h;
    static wk field_k;
    private ck field_a;
    private int field_b;
    private int field_g;
    private ck field_c;

    public static void c(int param0) {
        field_h = null;
        int var1 = 54 / ((-11 - param0) / 35);
        field_k = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final void a(long param0, ck param1, int param2) {
        ck var5 = null;
        try {
            if (param1.field_i != null) {
                param1.b(param2 + 1820);
            }
            var5 = this.field_d[(int)(param0 & (long)(this.field_b - 1))];
            param1.field_i = var5.field_i;
            param1.field_k = var5;
            param1.field_i.field_k = param1;
            if (param2 != -1816) {
                uh.c(30);
            }
            param1.field_j = param0;
            param1.field_k.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "uh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        ca.field_r = null;
        dl.field_L = (byte[][]) null;
        rl.field_a = null;
        ba.field_d = null;
        oa.field_M = null;
        le.field_L = null;
        if (param0 == 9324) {
          return;
        } else {
          field_i = (String[]) null;
          return;
        }
    }

    final ck a(byte param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        ck var4 = null;
        ck var35 = null;
        ck var36 = null;
        ck var37 = null;
        ck var38 = null;
        ck var41 = null;
        var3 = SteelSentinels.field_G;
        if (param0 > 92) {
          if (this.field_g > 0) {
            if (this.field_a == this.field_d[-1 + this.field_g]) {
              L0: while (true) {
                if (this.field_g < this.field_b) {
                  fieldTemp$4 = this.field_g;
                  this.field_g = this.field_g + 1;
                  var38 = this.field_d[fieldTemp$4].field_k;
                  if (this.field_d[this.field_g - 1] != var38) {
                    this.field_a = var38.field_k;
                    return var38;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var41 = this.field_a;
              this.field_a = var41.field_k;
              return var41;
            }
          } else {
            L1: while (true) {
              if (this.field_g < this.field_b) {
                fieldTemp$5 = this.field_g;
                this.field_g = this.field_g + 1;
                var37 = this.field_d[fieldTemp$5].field_k;
                if (this.field_d[this.field_g - 1] != var37) {
                  this.field_a = var37.field_k;
                  return var37;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          this.field_d = (ck[]) null;
          if (this.field_g > 0) {
            if (this.field_a != this.field_d[-1 + this.field_g]) {
              var35 = this.field_a;
              this.field_a = var35.field_k;
              return var35;
            } else {
              L2: while (true) {
                if (this.field_g < this.field_b) {
                  fieldTemp$6 = this.field_g;
                  this.field_g = this.field_g + 1;
                  var36 = this.field_d[fieldTemp$6].field_k;
                  if (this.field_d[this.field_g - 1] != var36) {
                    this.field_a = var36.field_k;
                    return var36;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (this.field_g < this.field_b) {
                fieldTemp$7 = this.field_g;
                this.field_g = this.field_g + 1;
                var4 = this.field_d[fieldTemp$7].field_k;
                if (this.field_d[this.field_g - 1] != var4) {
                  this.field_a = var4.field_k;
                  return var4;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        if (param0) {
          field_k = (wk) null;
          var3 = param1 >> -1769986657 & -1 + param2;
          return var3 + (param1 - -(param1 >>> 1325752159)) % param2;
        } else {
          var3 = param1 >> -1769986657 & -1 + param2;
          return var3 + (param1 - -(param1 >>> 1325752159)) % param2;
        }
    }

    final static void a(int param0, wk[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param0 == 1) {
              L1: {
                jb.field_S = param1;
                if (null == jb.field_S) {
                  break L1;
                } else {
                  if (-4 < (param1.length ^ -1)) {
                    throw new IllegalArgumentException("");
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2);
            stackOut_7_1 = new StringBuilder().append("uh.H(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final ck b(int param0) {
        this.field_g = param0;
        return this.a((byte) 113);
    }

    final ck a(long param0, int param1) {
        ck var4 = null;
        ck var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        var4 = this.field_d[(int)(param0 & (long)(-1 + this.field_b))];
        this.field_c = var4.field_k;
        L0: while (true) {
          if (var4 == this.field_c) {
            if (param1 < 122) {
              return (ck) null;
            } else {
              this.field_c = null;
              return null;
            }
          } else {
            if ((this.field_c.field_j ^ -1L) == (param0 ^ -1L)) {
              var5 = this.field_c;
              this.field_c = this.field_c.field_k;
              return var5;
            } else {
              this.field_c = this.field_c.field_k;
              continue L0;
            }
          }
        }
    }

    final static gk a(gk param0, int[] param1, boolean param2) {
        gk var3 = null;
        RuntimeException var3_ref = null;
        gk stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        gk stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3 = new gk(0, 0, 0);
              var3.field_a = param0.field_a;
              var3.field_i = param0.field_i;
              if (!param2) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            var3.field_g = param0.field_g;
            var3.field_j = param0.field_j;
            var3.field_d = param0.field_d;
            var3.field_p = param0.field_p;
            var3.field_o = param1;
            var3.field_n = param0.field_n;
            stackOut_2_0 = (gk) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("uh.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    uh(int param0) {
        ck dupTemp$2 = null;
        int var2 = 0;
        ck var3 = null;
        this.field_g = 0;
        this.field_d = new ck[param0];
        this.field_b = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new ck();
            var3 = dupTemp$2;
            this.field_d[var2] = dupTemp$2;
            var3.field_k = var3;
            var3.field_i = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        field_i = new String[]{"Flak repeater", "Minigun", "Fire bomb launcher", "Gauss gun", "Pulse laser", "Plasma spray", "Rapier missile", "Piercer rocket", "EMP rocket", "Airburst rocket", "Electron cannon", "Flak cannon", "Heavy gun", "Heavy cannon", "Mortar", "Rifled sniper cannon", "Rail repeater", "Laser beam", "Plasma cannon", "Multirocket", "Heavy rocket", "Lightning cannon", "Magno claw", "Flame cannon", "Bio rocket", "Air mine", "Ultra gun", "Doomsday cannon", "Howitzer", "Rail cannon", "Solaris laser", "Fusion cannon", "DEATH nuke", "Destructor rocket", "Air death missile", "EMP cannon"};
        field_h = "D";
        field_f = "Close";
        field_e = 1;
    }
}
