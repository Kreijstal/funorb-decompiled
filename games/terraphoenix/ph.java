/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph extends di {
    static int[] field_t;
    private ej field_s;
    private ej field_p;
    static String[] field_n;
    static int field_o;
    static fa field_q;
    static wg field_v;
    static String[] field_r;
    static String field_u;
    static int[] field_m;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int[] param6, int param7, int param8) {
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = Terraphoenix.field_V;
        try {
          if (param5 >= 0 &&
            ob.field_h > param0) {
            if (0 > param2 &&
              0 > param7 &&
              param8 < 0) {
              return;
            }
            if (param2 >= ob.field_i &&
              ob.field_i <= param7 &&
              ob.field_i <= param8) {
              return;
            }
            var14 = param5 - param0;
            if (param0 == param1) {
              if (param0 != param5) {
                var15 = param5 - param1;
                if (param7 <= param2) {
                  var11 = (param8 - param7 << 16) / var15;
                  var10 = param2 << 16;
                  var9_int = param7 << 16;
                  var12 = (-param2 + param8 << 16) / var14;
                } else {
                  var9_int = param2 << 16;
                  var12 = (-param7 + param8 << 16) / var15;
                  var10 = param7 << 16;
                  var11 = (param8 - param2 << 16) / var14;
                }
              } else {
                var12 = 0;
                var11 = 0;
                var9_int = param2 << 16;
                var10 = param7 << 16;
              }
              var13 = 0;
              if (param0 < 0) {
                param0 = Math.min(-param0, param1 - param0);
                var10 = var10 + var12 * param0;
                var9_int = var9_int + var11 * param0;
                param0 = 0;
              }
            } else {
              var10 = param2 << 16;
              var9_int = param2 << 16;
              var15 = -param0 + param1;
              var11 = (-param2 + param7 << 16) / var15;
              var12 = (-param2 + param8 << 16) / var14;
              if (var11 >= var12) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param0 < 0) {
                if (param1 < 0) {
                  param0 = -param0 + param1;
                  var10 = var10 + param0 * var12;
                  var9_int = var9_int + var11 * param0;
                  param0 = param1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param0 = -param0;
                  var9_int = var9_int + var11 * param0;
                  var10 = var10 + var12 * param0;
                  param0 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = ob.field_d[param0];
                while (param1 > param0) {
                  var17 = var9_int >> 16;
                  if (var17 < ob.field_i) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 == 0) {
                      if (var17 >= 0 &&
                        var17 < ob.field_i) {
                        ch.a(var17 + var16Lifetime2, var18, 15169, param6, param4);
                      }
                    } else {
                      if (ob.field_i <= var18 + var17) {
                        var18 = -var17 + ob.field_i - 1;
                      }
                      if (var17 >= 0) {
                        ch.a(var16Lifetime2 + var17, var18, 15169, param6, param4);
                      } else {
                        ch.a(var16Lifetime2, var18 + var17, 15169, param6, param4);
                      }
                    }
                  }
                  param0++;
                  if (ob.field_h <= param0) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + l.field_k;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = param5 - param1;
              if (var16Lifetime3 == 0) {
                var12 = 0;
                var11 = 0;
              } else {
                if (var13 != 0) {
                  var10 = param7 << 16;
                } else {
                  var9_int = param7 << 16;
                }
                var17Lifetime2 = param8 << 16;
                var11 = (-var9_int + var17Lifetime2) / var16Lifetime3;
                var12 = (-var10 + var17Lifetime2) / var16Lifetime3;
              }
            }
            if (param3 > -109) {
              return;
            }
            if (0 > param0) {
              param0 = -param0;
              var10 = var10 + var12 * param0;
              var9_int = var9_int + var11 * param0;
              param0 = 0;
            }
            var15Lifetime1 = ob.field_d[param0];
            while (param0 < param5) {
              var16Lifetime1 = var9_int >> 16;
              if (var16Lifetime1 < ob.field_i) {
                var17Lifetime1 = -(var9_int >> 16) + (var10 >> 16);
                if (0 == var17Lifetime1) {
                  if (var16Lifetime1 >= 0 &&
                    var16Lifetime1 < ob.field_i) {
                    ch.a(var16Lifetime1 + var15Lifetime1, var17Lifetime1, 15169, param6, param4);
                  }
                } else {
                  if (var16Lifetime1 + var17Lifetime1 >= ob.field_i) {
                    var17Lifetime1 = -var16Lifetime1 + (ob.field_i - 1);
                  }
                  if (var16Lifetime1 < 0) {
                    ch.a(var15Lifetime1, var16Lifetime1 + var17Lifetime1, 15169, param6, param4);
                  } else {
                    ch.a(var15Lifetime1 + var16Lifetime1, var17Lifetime1, 15169, param6, param4);
                  }
                }
              }
              param0++;
              if (ob.field_h <= param0) {
                return;
              }
              var15Lifetime1 = var15Lifetime1 + l.field_k;
              var10 = var10 + var12;
              var9_int = var9_int + var11;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_78_0 = var9;
          stackIn_78_1 = new StringBuilder().append("ph.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_78_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    ph(ej param0, ej param1, ej param2) {
        super(param0);
        try {
          this.field_s = param2;
          this.field_p = param1;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ph.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.awt.Frame a(he param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_26_0 = null;
        Object stackIn_37_0 = null;
        java.awt.Frame stackIn_39_0 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        ef[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        ef[] var10 = null;
        mf var11 = null;
        var9 = Terraphoenix.field_V;
        try {
          if (!param0.b(2)) {
            return null;
          }
          if (0 == param5) {
            var10 = of.a(param0, param4 - 5);
            var6 = var10;
            if (var6 == null) {
              return null;
            }
            var7_int = 0;
            for (var8 = 0; var8 < var10.length; var8++) {
              if (var10[var8].field_d == param1 &&
                var10[var8].field_e == param3 && ((0 == param2 ||
                param2 == var10[var8].field_f) &&
                (var7_int == 0 ||
                !(var10[var8].field_g <= param5)))) {
                var7_int = 1;
                param5 = var10[var8].field_g;
              }
            }
            if (var7_int == 0) {
              stackIn_26_0 = null;
              return (java.awt.Frame) (stackIn_26_0);
            }
          }
          var11 = param0.a(param5, param2, true, param1, param3);
          while (var11.field_d == 0) {
            gi.a((byte) -63, 10L);
          }
          var7 = (java.awt.Frame) (var11.field_e);
          if (var7 == null) {
            return null;
          }
          if (param4 != 10) {
            field_m = (int[]) null;
          }
          if (var11.field_d != 2) {
            stackIn_39_0 = var7;
            return stackIn_39_0;
          }
          ck.a(param0, 112, var7);
          stackIn_37_0 = null;
          return (java.awt.Frame) (stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_42_0 = var6_ref;
          stackIn_42_1 = new StringBuilder().append("ph.A(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final im b(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        im stackIn_3_0 = null;
        im stackIn_7_0 = null;
        im stackIn_10_0 = null;
        im stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_p.field_o.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == param1) {
            stackIn_3_0 = qf.field_d;
            return stackIn_3_0;
          }
          if (!qc.a((byte) 80, var4, var3)) {
            stackIn_7_0 = qf.field_d;
            return stackIn_7_0;
          }
          if (!this.c(param0, -1)) {
            stackIn_12_0 = dg.field_c;
            return stackIn_12_0;
          }
          stackIn_10_0 = qf.field_d;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ph.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, bm param1, int param2, int param3) {
        try {
          ck.field_a = param1;
          nb.field_e = param0;
          if (param3 != -1) {
            field_t = (int[]) null;
          }
          eb.field_D = param2;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "ph.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String var5 = null;
        int var6 = 0;
        String var7 = null;
        Object stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_16_0 = null;
        String stackIn_21_0 = null;
        String stackIn_25_0 = null;
        String stackIn_29_0 = null;
        String stackIn_31_0 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = this.field_p.field_o.toLowerCase();
          var4 = param0.toLowerCase();
          if (var4.length() == 0) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var5 = var4;
          if (f.a(var5, -51)) {
            stackIn_5_0 = kh.field_M;
            return stackIn_5_0;
          }
          if (am.a(var5, true)) {
            stackIn_9_0 = a.field_a;
            return stackIn_9_0;
          }
          if (ef.a((byte) -102, var5)) {
            stackIn_13_0 = ak.field_j;
            return stackIn_13_0;
          }
          var6 = -107 / ((param1 - 26) / 56);
          if (this.c(param0, -1)) {
            stackIn_16_0 = mj.field_a;
            return stackIn_16_0;
          }
          if (var7.length() <= 0) {
            stackIn_31_0 = nb.field_a;
            return stackIn_31_0;
          }
          if (ak.a(var5, var7, false)) {
            stackIn_21_0 = jd.field_i;
            return stackIn_21_0;
          }
          if (a.a(var5, -19, var7)) {
            stackIn_25_0 = tc.field_b;
            return stackIn_25_0;
          }
          if (!oh.a((byte) -85, var7, var5)) {
            return kh.field_M;
          }
          stackIn_29_0 = jd.field_i;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_34_0 = var3;
          stackIn_34_1 = new StringBuilder().append("ph.B(");
          if (param0 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param1).append(')').toString());
        }
    }

    private final boolean c(String param0, int param1) {
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        bm var8 = null;
        String var9 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            var8 = (bm) null;
            ph.a(-49, (bm) null, -94, 122);
          }
          var9 = this.field_s.field_o.toLowerCase();
          var4 = param0.toLowerCase();
          if (0 < var9.length()) {
            if (var4.length() <= 0) {
              return false;
            }
            var5 = var9.lastIndexOf("@");
            if (var5 >= 0 &&
              -1 + var9.length() > var5) {
              var6 = var9.substring(0, var5);
              var7 = var9.substring(var5 + 1);
              if (var4.indexOf(var6) >= 0) {
                return true;
              }
              stackIn_14_0 = (var4.indexOf(var7) >= 0);
              return stackIn_14_0;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("ph.D(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_t = null;
        field_u = null;
        field_n = null;
        field_v = null;
        field_m = null;
        field_q = null;
        if (param0 != 104682000) {
          return;
        }
        field_r = null;
    }

    static {
        field_n = new String[]{"Helepad", "Barracks", "ResearchBase", "FactoryBase", "Hanger", "FuelDump", "UFO-Transport", "UFO-Invader", "UFO-Dominator", "MissileBase", "AB-Entrance", "AB-Corridors", "AB-Room0", "AB-Room1", "AB-Room2", "AB-Room3", "AB-Room4", "AB-CommandCenter", "AB-Hanger", "AB-Reactor", "AB-Maindoor", "AB-Hangerdoor", "AlienFactoryBase", "AlienHanger", "City1", "City2", "City3", "City4", "City5", "City6", "City7", "City8", "Tutorial"};
        field_u = "Move to ground level";
        field_r = new String[]{"Alan", "Alex", "Alexi", "Antony", "Andrew", "Ben", "Bill", "Bob", "Carl", "Charles", "Chris", "Daniel", "David", "Dermot", "Douglas", "Eric", "Fred", "Gary", "Gordon", "Greg", "Gunther", "Henry", "Harry", "Harvey", "Karl", "Ian", "Jack", "James", "Jim", "Jonathan", "John", "Joseph", "Justin", "Johannes", "Lincoln", "Lionel", "Luke", "Marcus", "Mark", "Mason", "Maurice", "Michael", "Mike", "Nathan", "Neil", "Noel", "Nigel", "Oliver", "Peter", "Paul", "Philip", "Ralph", "Raymond", "Richard", "Robert", "Roger", "Rupert", "Sagir", "Sam", "Shaun", "Simon", "Steve", "Stewart", "Thomas", "Tony", "Trevor", "Victor", "Vincent", "William", "Wilson", "Yuan", "Bruce", "Joshua", "Patrick"};
        field_m = new int[8192];
    }
}
