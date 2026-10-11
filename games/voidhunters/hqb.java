/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hqb {
    llb field_b;
    private String field_g;
    private int field_c;
    static int field_f;
    aw field_i;
    private long field_d;
    static String[][] field_k;
    int field_h;
    private int[] field_e;
    String field_a;
    static String field_j;

    private final boolean a(int param0, int param1, int param2) {
        Object var4;
        String var4_ref;
        if (param2 > -64) {
          this.b(33);
        }
        var4 = null;
        if (param1 != 4) {
          if (param1 == 5) {
            var4_ref = npa.a((byte) 90, this.field_a, param0);
          } else {
            if (6 != param1) {
              if (7 != param1) {
                return false;
              }
              var4_ref = iab.a(param0, this.field_g, this.field_a, (byte) -76);
            } else {
              var4_ref = tba.a(2, this.field_a, param0);
            }
          }
        } else {
          var4_ref = ukb.a(this.field_a, param0, 9602);
        }
        if (var4_ref != null) {
          lh.a((byte) -112, 0, (String) null, this.field_a, var4_ref, 2);
        }
        return true;
    }

    private final boolean a(byte param0, int param1, int param2) {
        if (param0 != 16) {
          field_f = 14;
        }
        if (17 != param1) {
          return false;
        }
        crb.field_v = new bwa(this.field_b.field_M, this.field_b.field_u, this.field_b.field_hb, this.field_b.field_G, param2, fh.field_g, lo.field_b, kn.field_p, qc.field_q, urb.field_o, iga.field_o, this.field_a, this.field_d);
        return true;
    }

    private final boolean b(byte param0, int param1, int param2) {
        boolean discarded$1 = false;
        int var5;
        var5 = VoidHunters.field_G;
        if (param2 != 0) {
          if (param2 != 1) {
            if (param2 != 2) {
              if (param2 != 3) {
                if (param2 != 10) {
                  if (param2 == 15) {
                    mia.a(param1, this.field_h, 91);
                  } else {
                    if (16 != param2) {
                      return false;
                    }
                    mia.a(param1, 0, 53);
                  }
                } else {
                  jua.a(this.field_h, param1, 20694);
                }
              } else {
                sh.a(this.field_h, -1, param1);
              }
            } else {
              pa.a(param1, (byte) -128, this.field_h);
            }
          } else {
            pe.a(param1, this.field_d, param0 ^ -25);
          }
        } else {
          ut.a(6, this.field_d, param1);
        }
        if (param0 == 99) {
          return true;
        }
        discarded$1 = this.a((byte) 32, 2, 100);
        return true;
    }

    final static void a(int param0, int param1, int param2, boolean param3, int param4, byte param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = VoidHunters.field_G;
        try {
          if (param4 <= param0) {
            return;
          }
          if (1 + param0 >= param2) {
            return;
          }
          if (param0 + 5 < param2 &&
            param6 != param1) {
            var7_int = (1 & (param6 & param1)) + ((param6 >> 1) + (param1 >> 1));
            var8 = param0;
            var9 = param1;
            var10 = param6;
            for (var11 = param0; var11 < param2; var11++) {
              var12 = sv.field_f[var11];
              if (param3) {
                stackIn_23_0 = fmb.field_o[var12];
              } else {
                stackIn_23_0 = hga.field_o[var12];
              }
              var13 = stackIn_23_0;
              if (var13 > var7_int) {
                sv.field_f[var11] = sv.field_f[var8];
                incrementValue$0 = var8;
                var8++;
                sv.field_f[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            hqb.a(param0, param1, var8, param3, param4, (byte) 24, var9);
            hqb.a(var8, var10, param2, param3, param4, param5, param6);
            return;
          }
          for (var7_intLifetime1 = param2 - 1; param0 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param0; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = sv.field_f[var8Lifetime1];
              var10Lifetime1 = sv.field_f[1 + var8Lifetime1];
              if (dla.a(param5 + 103, param3, var10Lifetime1, var9Lifetime1)) {
                sv.field_f[var8Lifetime1] = var10Lifetime1;
                sv.field_f[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var7), "hqb.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(int param0, int param1, int[] param2) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        vu var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        String var8 = null;
        try {
          if (this.field_a != null && (~wqa.field_a != ~this.field_d ||
            param1 == 2) && iwa.field_b == 2) {
            var8 = this.b((byte) -63);
            var4 = var8;
            var5 = di.a(this.field_a, 0);
            var6 = ltb.a((byte) -94, this.field_a) ? 1 : 0;
            if (var5 == null &&
              var6 == 0) {
              this.field_i.a(isa.a(knb.field_r, new String[]{var8}, 93), (byte) -53, 4);
              this.field_i.a(isa.a(uda.field_c, new String[]{var8}, 104), (byte) -53, 6);
              if (param2 != null &&
                param1 != 2 &&
                !erb.field_p) {
                this.field_e = param2;
                this.field_i.a(isa.a(raa.field_q, new String[]{var8}, 87), (byte) -53, 19);
              }
            }
            if (var5 != null) {
              if (!qs.a(0, this.field_a) &&
                !erb.field_p) {
                if (!hb.field_c) {
                  this.field_i.a(isa.a(qia.field_o, new String[]{var8}, 104), (byte) -53, 8);
                }
                this.field_i.a(isa.a(eha.field_p, new String[]{var8}, 112), (byte) -53, 18);
                if (param2 != null) {
                  this.field_e = param2;
                  this.field_i.a(isa.a(raa.field_q, new String[]{var8}, 73), (byte) -53, 19);
                }
              }
              this.field_i.a(isa.a(dfb.field_o, new String[]{var8}, 114), (byte) -53, 5);
            }
            if (var6 != 0) {
              this.field_i.a(isa.a(lu.field_c, new String[]{var8}, 80), (byte) -53, 7);
            }
          }
          if (param0 >= -13) {
            var7 = (CharSequence) null;
            hqb.a(false, (byte) -9, (CharSequence) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_29_0 = var4_ref;
          stackIn_29_1 = new StringBuilder().append("hqb.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static String a(boolean param0, byte param1, CharSequence param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_11_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_31_0 = null;
        String stackIn_36_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = VoidHunters.field_G;
        try {
          if (param1 != 43) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          if (param2 == null) {
            stackIn_6_0 = bka.field_o;
            return stackIn_6_0;
          }
          var3_int = param2.length();
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var4 = jwa.a(false, param2);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!fg.a(var4.charAt(0), 56) &&
                !fg.a(var4.charAt(var4.length() - 1), param1 ^ 79)) {
                var5 = 0;
                for (var6 = 0; var6 < param2.length(); var6++) {
                  var7 = param2.charAt(var6);
                  if (fg.a((char) var7, 45)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_31_0 = amb.field_a;
                    return stackIn_31_0;
                  }
                }
                if (0 >= var5) {
                  return null;
                }
                stackIn_36_0 = kma.field_d;
                return stackIn_36_0;
              }
              stackIn_21_0 = kma.field_d;
              return stackIn_21_0;
            }
            stackIn_16_0 = bka.field_o;
            return stackIn_16_0;
          }
          stackIn_11_0 = bka.field_o;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_40_0 = var3;
          stackIn_40_1 = new StringBuilder().append("hqb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_k = (String[][]) null;
        if (param0 > -103) {
          CharSequence var2 = (CharSequence) null;
          hqb.a(true, (byte) -64, (CharSequence) null);
        }
        field_j = null;
    }

    final void a(int param0, boolean param1) {
        this.field_i.b(param1, 39);
        if (param0 != 1) {
          field_f = 4;
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var5;
        var5 = VoidHunters.field_G;
        if (param2 != -17791) {
          this.field_a = (String) null;
        }
        if (param1 != 8) {
          if (18 == param1) {
            bab.a(this.field_a, this.field_d, 63);
          } else {
            if (param1 == 11) {
              mea.a(0, (byte) -118, param0, this.field_c);
            } else {
              if (param1 == 12) {
                mea.a(1, (byte) -123, param0, this.field_c);
              } else {
                if (param1 == 13) {
                  mea.a(2, (byte) -105, param0, this.field_c);
                } else {
                  if (param1 != 14) {
                    if (param1 != 20) {
                      if (19 != param1) {
                        return false;
                      }
                      fia.a(this.field_e, this.field_c, (byte) 105, this.field_d, this.field_a);
                      return true;
                    }
                    or.a(0);
                  } else {
                    km.e(1);
                  }
                }
              }
            }
          }
        } else {
          ir.a((byte) 39, this.field_d, this.field_a);
        }
        return true;
    }

    final void a(boolean param0, int param1) {
        jk var4;
        String var5;
        int var6;
        jk var7;
        var6 = VoidHunters.field_G;
        if (param1 <= 1) {
          this.field_b = (llb) null;
        }
        if (this.field_a != null &&
          wqa.field_a != this.field_d &&
          null != lqa.field_o &&
          nmb.b(-45)) {
          var7 = pdb.a((byte) 80, this.field_d);
          var4 = pjb.a(this.field_d, true);
          var5 = this.b((byte) -128);
          if (var4 == null) {
            if (var7 != null &&
              lqa.field_o.field_Gb &&
              lqa.field_o.field_zb < lqa.field_o.field_Fb) {
              if (!var7.field_Eb) {
                if (param0 &&
                  var7.field_Fb) {
                  this.field_i.a(isa.a(ica.field_p, new String[]{var5}, 121), (byte) -53, 0);
                  this.field_i.a(isa.a(aib.field_b, new String[]{var5}, 75), (byte) -53, 1);
                } else {
                  this.field_i.a(isa.a(ina.field_o, new String[]{var5}, 94), (byte) -53, 0);
                }
              } else {
                this.field_i.a(isa.a(ts.field_a, new String[]{var5}, 115), (byte) -53, 1);
              }
            }
          } else {
            if (!lqa.field_o.field_fc ||
              !(lqa.field_o.field_Ub < 0)) {
              this.field_i.a(isa.a(ib.field_o, new String[]{var5}, 106), (byte) -53, 1);
            }
          }
        }

    }

    final void a(pgb param0, int param1) {
        if (param0.field_k) {
          return;
        }
        if (param1 <= 73) {
          return;
        }
        try {
          this.field_c = param0.field_a;
          if (param0.field_a == 0) {
            if (kib.field_d == 0) {
              this.field_i.a(vv.field_a, (byte) -53, 12);
            }
            this.field_i.a(tda.field_M, (byte) -53, 13);
          }
          if (1 == param0.field_a) {
            if (0 == idb.field_p) {
              this.field_i.a(gbb.field_p, (byte) -53, 12);
            }
            this.field_i.a(ocb.field_j, (byte) -53, 13);
          }
          if (param0.field_a == 2) {
            if (0 == lla.field_h) {
              this.field_i.a(bga.field_o, (byte) -53, 12);
            }
            this.field_i.a(uta.field_o, (byte) -53, 13);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hqb.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String b(byte param0) {
        String var2 = null;
        if (param0 >= -24) {
          return (String) null;
        }
        if (this.field_g == null) {
          var2 = this.field_a;
        } else {
          var2 = this.field_g;
        }
        return var2;
    }

    final void a(boolean param0) {
        String var3;
        int var4;
        mm var5;
        var4 = VoidHunters.field_G;
        if (!param0) {
          return;
        }
        if (lqa.field_o == null) {
          var5 = meb.a(this.field_h, 1);
          if (var5 != null) {
            var3 = var5.field_Vb;
            if (!var5.field_ac) {
              if (var5.field_cc) {
                this.field_i.a(isa.a(ti.field_g, new String[]{var3}, 101), (byte) -53, 2);
              } else {
                if (!var5.field_Qb &&
                  var5.field_Gb && (!var5.field_fc ||
                  var5.field_cc)) {
                  this.field_i.a(isa.a(ue.field_c, new String[]{var3}, 107), (byte) -53, 2);
                }
              }
              if (var5.field_Qb) {
                this.field_i.a(isa.a(t.field_e, new String[]{var3}, 126), (byte) -53, 3);
              }
            } else {
              this.field_i.a(isa.a(rib.field_o, new String[]{var3}, 127), (byte) -53, 2);
              this.field_i.a(isa.a(nrb.field_a, new String[]{var3}, 127), (byte) -53, 3);
            }
          }
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_i.a(param1 + 17, param0);
        if (var6 == -2) {
          return false;
        }
        boolean discarded$2 = this.b((byte) 99, param2, var6);
        if (param1 != -11) {
          this.b(26);
        }
        boolean discarded$3 = this.a(param3, var6, -111);
        boolean discarded$4 = this.b(param3, var6, -17791);
        boolean discarded$5 = this.a((byte) 16, var6, param4);
        return true;
    }

    final boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 0) {
          return true;
        }
        stackIn_6_0 = (this.field_i != null) && (this.field_i.e((byte) -126));
        return stackIn_6_0;
    }

    final void b(int param0) {
        String var3 = null;
        if (this.field_a != null &&
          wqa.field_a != this.field_d) {
          var3 = this.b((byte) -110);
          String var2 = var3;
          this.field_i.a(isa.a(ona.field_l, new String[]{var3}, 83), (byte) -53, 17);
        }
        if (param0 != -9923) {
          this.a(-125, false);
        }
    }

    hqb(llb param0, long param1, String param2, String param3, int param4, int param5, int[] param6) {
        try {
          this.field_i = new aw(aba.field_a);
          this.field_d = param1;
          this.field_b = param0;
          this.field_g = param3;
          param0.field_J = true;
          this.field_a = param2;
          this.field_c = param5;
          this.field_h = param4;
          this.field_e = param6;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "hqb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = 0;
        field_j = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
