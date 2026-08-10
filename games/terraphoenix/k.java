/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k {
    static String[] field_d;
    static String field_a;
    static og field_b;
    static int[] field_e;
    private uf field_g;
    private jj field_c;
    static te field_f;

    final uf c(int param0) {
        uf var2 = this.field_g;
        if (param0 < 1) {
            return (uf) null;
        }
        if (!(var2 != this.field_c.field_a)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_d;
        return var2;
    }

    final static void a(int param0, String param1, boolean param2) {
        int var3_int = 0;
        try {
            dj.field_d = false;
            fd.field_k = param2 ? true : false;
            if (null != nb.field_b) {
                if (!nb.field_b.field_J) {
                    return;
                }
                if (-9 == (param0 ^ -1)) {
                    if (!qi.field_b) {
                        param1 = bi.field_c;
                    } else {
                        param1 = em.field_b;
                    }
                    param0 = 2;
                    mb.field_s.a(ol.field_Hb, -1);
                }
                var3_int = 1;
                if ((param0 ^ -1) == -11) {
                    cm.a((byte) 124);
                    var3_int = 0;
                }
                if (!(var3_int == 0)) {
                    if (dj.field_d) {
                        param1 = ij.a(new String[]{param1}, -1, fd.field_q);
                    }
                    if (ok.field_h) {
                        param1 = ld.field_g;
                    }
                    nb.field_b.a(true, param1, param0);
                }
                if (param0 != 256) {
                    if (param0 == 10) {
                        return;
                    }
                    if (!qi.field_b) {
                        mb.field_s.g((byte) -107);
                        return;
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "k.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_a = (String) null;
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_d = null;
          field_b = null;
          field_e = null;
          field_f = null;
          return;
        }
    }

    final uf a(byte param0, uf param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        uf var4 = null;
        Object stackIn_6_0 = null;
        uf stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 88 / ((-52 - param0) / 61);
              if (param1 != null) {
                var4 = param1;
                break L1;
              } else {
                var4 = this.field_c.field_a.field_d;
                break L1;
              }
            }
            if (var4 == this.field_c.field_a) {
              this.field_g = null;
              stackIn_6_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_g = var4.field_d;
              stackIn_8_0 = (uf) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("k.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (uf) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final static fd a(int param0) {
        if (qb.field_b != null) {
          if (param0 < 26) {
            field_a = (String) null;
            return qb.field_b;
          } else {
            return qb.field_b;
          }
        } else {
          qb.field_b = new fd(ra.field_l, 20, 0, 0, 0, 11579568, -1, 0, 0, ra.field_l.field_s, -1, 2147483647, true);
          if (param0 >= 26) {
            return qb.field_b;
          } else {
            field_a = (String) null;
            return qb.field_b;
          }
        }
    }

    final uf b(int param0) {
        uf var2;
        var2 = this.field_c.field_a.field_a;
        if (var2 != this.field_c.field_a) {
          if (param0 <= 45) {
            field_b = (og) null;
            this.field_g = var2.field_a;
            return var2;
          } else {
            this.field_g = var2.field_a;
            return var2;
          }
        } else {
          this.field_g = null;
          return null;
        }
    }

    final uf a(int param0, uf param1) {
        uf var3 = null;
        RuntimeException var3_ref = null;
        uf stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        uf stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 22) {
              L1: {
                if (param1 == null) {
                  var3 = this.field_c.field_a.field_a;
                  break L1;
                } else {
                  var3 = param1;
                  break L1;
                }
              }
              if (this.field_c.field_a != var3) {
                this.field_g = var3.field_a;
                stackIn_10_0 = (uf) (var3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_g = null;
                stackIn_8_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = (uf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("k.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (uf) ((Object) stackIn_8_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    final uf a(byte param0) {
        uf var2;
        var2 = this.field_c.field_a.field_d;
        if (param0 == -13) {
          if (this.field_c.field_a == var2) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_d;
            return var2;
          }
        } else {
          field_b = (og) null;
          if (this.field_c.field_a == var2) {
            this.field_g = null;
            return null;
          } else {
            this.field_g = var2.field_d;
            return var2;
          }
        }
    }

    k(jj param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "k.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final uf d(int param0) {
        uf var2 = null;
        if (param0 > -78) {
            field_a = (String) null;
            var2 = this.field_g;
            if (!(var2 != this.field_c.field_a)) {
                this.field_g = null;
                return null;
            }
            this.field_g = var2.field_a;
            return var2;
        }
        var2 = this.field_g;
        if (!(var2 != this.field_c.field_a)) {
            this.field_g = null;
            return null;
        }
        this.field_g = var2.field_a;
        return var2;
    }

    static {
        field_d = new String[]{"Moving and shooting", "Your normal cursor is shown by this green box. If the box is over a staircase, an arrow will appear to denote which direction the stairs travel.", "By left clicking on the terrain, the movement cursor will appear with a number saying how much time it will take to move to this position. Click once more to confirm and your soldier will move.", "If the cursor is positioned over a controllable soldier, it will turn blue. Click to select the soldier.", "Moving the cursor over an enemy will change the cursor to a red targeting icon. Left clicking will make your soldier fire a shot at the target. If you select your gun from the console you will enter auto-fire mode allowing you to fire at any position on the landscape. This is useful for explosive weapons or if you cannot see your target.", "If a soldier is in ready mode, they will automatically crouch when next to cover such as a low wall or hedge. Enemy fire is likely to hit the cover and thus not injure your soldier. Remember that cover can be destroyed by explosives or powerful guns."};
        field_e = new int[8192];
        field_a = "MML-4";
        field_b = new og();
    }
}
