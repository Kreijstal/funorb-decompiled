/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ela extends od {
    String field_l;
    String field_k;
    Class[] field_n;
    static String field_m;

    public final String toString() {
        return this.field_k;
    }

    public static void a(int param0) {
        field_m = null;
        int var1 = 6 / ((param0 - 56) / 60);
    }

    final boolean a(int param0, String param1, bfa[] param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        Class var5 = null;
        int var6 = 0;
        bfa[] var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!this.field_l.equals(param1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (this.field_n.length == param2.length) {
                var4_int = 0;
                L1: while (true) {
                  if (this.field_n.length <= var4_int) {
                    if (param0 <= -49) {
                      stackIn_31_0 = 1;
                      decompiledRegionSelector0 = 6;
                      break L0;
                    } else {
                      var7 = (bfa[]) null;
                      this.a(-67, (String) null, (bfa[]) null);
                      return true;
                    }
                  } else {
                    L2: {
                      if (param2[var4_int].field_a) {
                        L3: {
                          var5 = jd.a(param2[var4_int].field_d, 0);
                          if (Boolean.TYPE != var5) {
                            break L3;
                          } else {
                            if (this.field_n[var4_int] == Boolean.TYPE) {
                              break L3;
                            } else {
                              stackIn_18_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            }
                          }
                        }
                        L4: {
                          if (Character.TYPE != var5) {
                            break L4;
                          } else {
                            if (this.field_n[var4_int] == Character.TYPE) {
                              break L4;
                            } else {
                              stackIn_22_0 = 0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        if (!hs.a((byte) -88, var5)) {
                          break L2;
                        } else {
                          if (hs.a((byte) -70, this.field_n[var4_int])) {
                            break L2;
                          } else {
                            stackIn_26_0 = 0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        if (!this.field_n[var4_int].isInstance(param2[var4_int].field_d)) {
                          stackIn_14_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                stackIn_7_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var4);

            stackIn_34_1 = new StringBuilder().append("ela.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L5;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L6;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_35_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_18_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_26_0 != 0;
                  } else {
                    return stackIn_31_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    abstract bfa a(bfa[] param0, int param1);

    ela(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        try {
            this.field_n = param1;
            this.field_l = param0;
            var7 = new StringBuilder(this.field_l).append('(');
            var8 = var7;
            for (var5 = 0; this.field_n.length > var5; var5++) {
                discarded$18 = var7.append(rva.a(this.field_n[var5], (byte) -102));
                if (var5 < -1 + this.field_n.length) {
                    discarded$19 = var8.append(", ");
                }
            }
            discarded$28 = var8.append(')');
            if (param2 != null) {
                discarded$29 = var8.append("     <col=ffaaff>" + param2 + "</col>");
            }
            this.field_k = var8.toString();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ela.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Welcome to your DOOM!";
    }
}
