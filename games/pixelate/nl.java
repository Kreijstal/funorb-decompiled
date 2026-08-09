/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    private fa field_f;
    private fa field_i;
    private fa[] field_g;
    static String field_d;
    static sb field_c;
    private int field_e;
    static String field_h;
    private int field_a;
    static String field_b;

    final fa a(int param0, long param1) {
        fa var5 = null;
        int var6 = Pixelate.field_H ? 1 : 0;
        if (param0 != -25484) {
            byte[] var7 = (byte[]) null;
            nl.a((pc) null, (byte[]) null, -80, 17);
        }
        fa var4 = this.field_g[(int)(param1 & (long)(this.field_a + -1))];
        this.field_i = var4.field_a;
        while (var4 != this.field_i) {
            if ((this.field_i.field_e ^ -1L) == (param1 ^ -1L)) {
                var5 = this.field_i;
                this.field_i = this.field_i.field_a;
                return var5;
            }
            this.field_i = this.field_i.field_a;
        }
        this.field_i = null;
        return null;
    }

    final fa a(byte param0) {
        if (param0 > -95) {
            return (fa) null;
        }
        this.field_e = 0;
        return this.a(54);
    }

    final static void a(boolean param0, int param1) {
        nd.field_b = param0 ? new wo(ch.field_H, an.field_a) : new wo(fb.field_Gb, vd.field_a);
        ff.field_h = new ak(0L, (ak) null);
        if (param1 >= -68) {
            nl.b(-102);
        }
        ff.field_h.a(nd.field_b.field_g, (byte) 26);
        ff.field_h.a(gk.field_kb, (byte) 26);
        ra.field_e = new ak(0L, cm.field_o);
        kh.field_a = new ak(0L, (ak) null);
        ra.field_e.a(ih.field_g, (byte) 26);
        ra.field_e.a(kh.field_a, (byte) 26);
        kh.field_a.a(oc.field_O, (byte) 26);
        kh.field_a.a(hb.field_eb, (byte) 26);
        hn.a((byte) 32, param0);
    }

    final static byte[] a(pc param0, byte[] param1, int param2, int param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 >= 59) {
                break L1;
              } else {
                var9 = (byte[]) null;
                nl.a((pc) null, (byte[]) null, 62, -90);
                break L1;
              }
            }
            var4_int = param0.c(param2, (byte) -34);
            if (var4_int != 0) {
              L2: {
                L3: {
                  if (param1 == null) {
                    break L3;
                  } else {
                    if (var4_int == param1.length) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param1 = new byte[var4_int];
                break L2;
              }
              L4: {
                var5 = param0.c(3, (byte) -34);
                var6 = (byte)param0.c(8, (byte) -34);
                if ((var5 ^ -1) >= -1) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param1[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var4_int <= var7) {
                      break L4;
                    } else {
                      param1[var7] = (byte)(param0.c(var5, (byte) -34) + var6);
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("nl.E(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_5_0);
        } else {
          return stackIn_18_0;
        }
    }

    final void a(long param0, int param1, fa param2) {
        fa var5 = null;
        try {
            if (param1 <= 120) {
                this.a(-40);
            }
            if (!(param2.field_h == null)) {
                param2.c(2779);
            }
            var5 = this.field_g[(int)(param0 & (long)(-1 + this.field_a))];
            param2.field_h = var5.field_h;
            param2.field_a = var5;
            param2.field_h.field_a = param2;
            param2.field_e = param0;
            param2.field_a.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nl.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        rd.a(param1, -17130, false);
        if (param0 != 0) {
            nl.a(-72, false);
        }
    }

    final static int a(boolean param0) {
        if (hf.field_q >= 2) {
          L0: {
            if (wo.field_d == 0) {
              if (!wk.field_j.b(-3)) {
                return 20;
              } else {
                if (wk.field_j.a("commonui", -1)) {
                  if (io.field_g.b(-3)) {
                    if (io.field_g.a("commonui", -1)) {
                      if (qo.field_u.b(-3)) {
                        if (!qo.field_u.a((byte) 92)) {
                          return 80;
                        } else {
                          break L0;
                        }
                      } else {
                        return 70;
                      }
                    } else {
                      return 60;
                    }
                  } else {
                    return 50;
                  }
                } else {
                  return 40;
                }
              }
            } else {
              L1: {
                if (null != hn.field_e) {
                  if (hn.field_e.b(-3)) {
                    if (!hn.field_e.b(127, "")) {
                      return 29;
                    } else {
                      if (hn.field_e.a("", -1)) {
                        break L1;
                      } else {
                        return 29;
                      }
                    }
                  } else {
                    return 14;
                  }
                } else {
                  break L1;
                }
              }
              if (!wk.field_j.b(-3)) {
                return 43;
              } else {
                if (!wk.field_j.a("commonui", -1)) {
                  return 57;
                } else {
                  if (io.field_g.b(-3)) {
                    if (io.field_g.a("commonui", -1)) {
                      if (!qo.field_u.b(-3)) {
                        return 82;
                      } else {
                        if (!qo.field_u.a((byte) 92)) {
                          return 86;
                        } else {
                          break L0;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                }
              }
            }
          }
          if (!param0) {
            return 100;
          } else {
            return 35;
          }
        } else {
          return 0;
        }
    }

    nl(int param0) {
        int var2 = 0;
        fa dupTemp$0 = null;
        fa var3 = null;
        this.field_e = 0;
        this.field_g = new fa[param0];
        this.field_a = param0;
        for (var2 = 0; var2 < param0; var2++) {
            dupTemp$0 = new fa();
            var3 = dupTemp$0;
            this.field_g[var2] = dupTemp$0;
            var3.field_h = var3;
            var3.field_a = var3;
        }
    }

    final fa a(int param0) {
        int fieldTemp$1 = 0;
        fa var2_ref_fa;
        int var2;
        int var3;
        Object var4;
        fa var4_ref;
        L0: {
          var3 = Pixelate.field_H ? 1 : 0;
          if (-1 <= (this.field_e ^ -1)) {
            break L0;
          } else {
            if (this.field_g[-1 + this.field_e] != this.field_f) {
              var2_ref_fa = this.field_f;
              this.field_f = var2_ref_fa.field_a;
              return var2_ref_fa;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (this.field_a <= this.field_e) {
            var2 = -114 / ((-79 - param0) / 36);
            return null;
          } else {
            fieldTemp$1 = this.field_e;
            this.field_e = this.field_e + 1;
            var4_ref = this.field_g[fieldTemp$1].field_a;
            var2_ref_fa = var4_ref;
            if (var4_ref == this.field_g[-1 + this.field_e]) {
              continue L1;
            } else {
              this.field_f = var2_ref_fa.field_a;
              return var2_ref_fa;
            }
          }
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_b = null;
        field_d = null;
        field_c = null;
        int var1 = -16 / ((-56 - param0) / 32);
    }

    static {
        field_h = "Asking to join <%0>'s game...";
        field_d = "Auto-respond to <%0>";
        field_b = "This game option is only available to members.";
    }
}
