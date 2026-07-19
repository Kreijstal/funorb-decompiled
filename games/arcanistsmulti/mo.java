/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    static String field_l;
    static kc field_o;
    private int field_e;
    private tf[] field_n;
    static int field_p;
    static String field_d;
    static qb[] field_a;
    static int field_h;
    private int field_i;
    static String field_g;
    static String field_f;
    private tf field_k;
    private tf field_c;
    static qb[] field_b;
    private long field_m;
    static String field_j;

    final tf a(int param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = 0;
        tf var4 = null;
        tf var5 = null;
        tf var9 = null;
        tf var12 = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 > (this.field_i ^ -1)) {
          if (this.field_k != this.field_n[this.field_i + -1]) {
            var12 = this.field_k;
            this.field_k = var12.field_l;
            return var12;
          } else {
            L0: while (true) {
              if (this.field_i < this.field_e) {
                fieldTemp$2 = this.field_i;
                this.field_i = this.field_i + 1;
                var4 = this.field_n[fieldTemp$2].field_l;
                var9 = var4;
                if (var4 == this.field_n[-1 + this.field_i]) {
                  continue L0;
                } else {
                  this.field_k = var9.field_l;
                  return var9;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          L1: while (true) {
            if (this.field_i < this.field_e) {
              fieldTemp$3 = this.field_i;
              this.field_i = this.field_i + 1;
              var4 = this.field_n[fieldTemp$3].field_l;
              var5 = var4;
              if (var4 == this.field_n[-1 + this.field_i]) {
                continue L1;
              } else {
                this.field_k = var5.field_l;
                return var5;
              }
            } else {
              return null;
            }
          }
        }
    }

    final tf f(int param0) {
        this.field_i = 0;
        int var2 = -85 / ((param0 - 26) / 58);
        return this.a(-1);
    }

    final static fg a(byte param0, eg param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        fg stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fg stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
              if (param0 == -127) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            var4 = param1.d(param2, 31662);
            var3 = var4;
            if (var4 != null) {
              stackOut_5_0 = new fg(var4);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var3_ref);
            stackOut_7_1 = new StringBuilder().append("mo.C(").append(param0).append(',');
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
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (fg) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    final tf d(int param0) {
        tf var3 = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == this.field_c) {
            return null;
        }
        tf var2 = this.field_n[(int)((long)(-1 + this.field_e) & this.field_m)];
        while (this.field_c != var2) {
            if (!(this.field_c.field_k != this.field_m)) {
                var3 = this.field_c;
                this.field_c = this.field_c.field_l;
                return var3;
            }
            this.field_c = this.field_c.field_l;
        }
        if (param0 >= -12) {
            return (tf) null;
        }
        this.field_c = null;
        return null;
    }

    final static void g(int param0) {
        if (param0 != -1) {
            field_b = (qb[]) null;
            ff.a(true, kf.field_a, (byte) -97, on.field_d);
            di.field_h = true;
            return;
        }
        ff.a(true, kf.field_a, (byte) -97, on.field_d);
        di.field_h = true;
    }

    final static int b(int param0) {
        if (param0 != 25117) {
            return -35;
        }
        return ih.field_b;
    }

    final static void a(int param0, boolean param1, int param2) {
        wa var3 = null;
        ne var4 = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 1) {
            field_j = (String) null;
            var3 = bj.a(param1, -3, param2);
            if (!(var3 == null)) {
                eo.field_c.a((byte) 72, false);
                var4 = eo.field_c;
                var5_ref_String = vk.field_z;
                var4.field_l.a(5, var5_ref_String, (byte) -26);
                var4 = eo.field_c;
                var5 = pb.field_h;
                var6 = ja.field_s;
                var4.field_l.a(0, 0, param0 + -29467, var6, var5);
            }
            hg.a(param2, param1, false);
            return;
        }
        var3 = bj.a(param1, -3, param2);
        if (!(var3 == null)) {
            eo.field_c.a((byte) 72, false);
            var4 = eo.field_c;
            var5_ref_String = vk.field_z;
            var4.field_l.a(5, var5_ref_String, (byte) -26);
            var4 = eo.field_c;
            var5 = pb.field_h;
            var6 = ja.field_s;
            var4.field_l.a(0, 0, param0 + -29467, var6, var5);
        }
        hg.a(param2, param1, false);
    }

    final static ri a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ri stackIn_3_0 = null;
        ri stackIn_7_0 = null;
        ri stackIn_11_0 = null;
        ri stackIn_21_0 = null;
        ri stackIn_25_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ri stackOut_6_0 = null;
        ri stackOut_10_0 = null;
        ri stackOut_20_0 = null;
        ri stackOut_24_0 = null;
        ri stackOut_2_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (param1 == 45) {
              if (var2_int == 0) {
                stackOut_6_0 = uh.field_i;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((var2_int ^ -1) < -64) {
                  stackOut_10_0 = b.field_e;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var3 = 0;
                  L1: while (true) {
                    if (var2_int > var3) {
                      L2: {
                        var4 = param0.charAt(var3);
                        if (var4 == 45) {
                          L3: {
                            if (0 == var3) {
                              break L3;
                            } else {
                              if (var3 == var2_int - 1) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_20_0 = n.field_b;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          if (-1 == rj.field_e.indexOf(var4)) {
                            stackOut_24_0 = n.field_b;
                            stackIn_25_0 = stackOut_24_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var3++;
                      continue L1;
                    } else {
                      return null;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = (ri) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var2);
            stackOut_28_1 = new StringBuilder().append("mo.K(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L4;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                return stackIn_25_0;
              }
            }
          }
        }
    }

    public static void c(int param0) {
        int discarded$0 = 0;
        field_l = null;
        if (param0 != 0) {
            discarded$0 = mo.b(31);
            field_d = null;
            field_j = null;
            field_a = null;
            field_f = null;
            field_b = null;
            field_g = null;
            field_o = null;
            return;
        }
        field_d = null;
        field_j = null;
        field_a = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_o = null;
    }

    final void a(tf param0, long param1, byte param2) {
        tf var5 = null;
        try {
            if (!(null == param0.field_i)) {
                param0.a((byte) 88);
            }
            var5 = this.field_n[(int)((long)(this.field_e - 1) & param1)];
            param0.field_i = var5.field_i;
            param0.field_l = var5;
            param0.field_i.field_l = param0;
            param0.field_l.field_i = param0;
            if (param2 <= 106) {
                mo.a(109, true, 64);
            }
            param0.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "mo.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final tf a(long param0, byte param1) {
        tf var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_m = param0;
        tf var4 = this.field_n[(int)(param0 & (long)(this.field_e + -1))];
        this.field_c = var4.field_l;
        while (var4 != this.field_c) {
            if (!(param0 != this.field_c.field_k)) {
                var5 = this.field_c;
                this.field_c = this.field_c.field_l;
                return var5;
            }
            this.field_c = this.field_c.field_l;
        }
        if (param1 > -61) {
            return (tf) null;
        }
        this.field_c = null;
        return null;
    }

    mo(int param0) {
        tf dupTemp$2 = null;
        int var2 = 0;
        tf var3 = null;
        this.field_i = 0;
        this.field_e = param0;
        this.field_n = new tf[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            dupTemp$2 = new tf();
            var3 = dupTemp$2;
            this.field_n[var2] = dupTemp$2;
            var3.field_l = var3;
            var3.field_i = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final static void e(int param0) {
        fk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              oh.field_k.g();
              lf.field_a.g();
              if (param0 == 200) {
                break L1;
              } else {
                field_a = (qb[]) null;
                break L1;
              }
            }
            L2: {
              ja.field_u = ja.field_u - 1;
              if (ja.field_u != 0) {
                break L2;
              } else {
                ja.field_u = 200;
                var1 = (fk) ((Object) qn.field_mb.b(12623));
                L3: while (true) {
                  if (var1 == null) {
                    if (he.field_f == null) {
                      break L2;
                    } else {
                      var1 = (fk) ((Object) he.field_f.b(12623));
                      L4: while (true) {
                        if (var1 == null) {
                          break L2;
                        } else {
                          L5: {
                            if (!var1.field_n.b((byte) -44)) {
                              var1.a(true);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var1 = (fk) ((Object) he.field_f.a(0));
                          continue L4;
                        }
                      }
                    }
                  } else {
                    L6: {
                      if (!var1.field_n.b((byte) -93)) {
                        var1.a(true);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var1 = (fk) ((Object) qn.field_mb.a(0));
                    continue L3;
                  }
                }
              }
            }
            L7: {
              if (null == jl.field_h) {
                break L7;
              } else {
                if (jl.field_h.e((byte) -8)) {
                  break L7;
                } else {
                  f.field_g = null;
                  break L7;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "mo.J(" + param0 + ')');
        }
    }

    static {
        field_l = "You have fallen into the water! Falling into the water will cause you to cast an emergency Arcane Gate spell, even if it is not in your spellbook. If that is the case, you will lose half of your current health, so try to avoid it. You will not lose health if the Arcane Gate spell is ready to cast in your spellbook.";
        field_d = "Sandbox";
        field_p = -1;
        field_g = "Accept rematch";
        field_j = "Quick Chat Help";
    }
}
