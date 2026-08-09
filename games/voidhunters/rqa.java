/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rqa extends fh {
    String field_l;
    String field_k;
    Class[] field_n;
    static int[] field_m;

    public static void a(boolean param0) {
        field_m = null;
        if (!param0) {
            field_m = (int[]) null;
        }
    }

    public final String toString() {
        return this.field_l;
    }

    final boolean a(boolean param0, String param1, nc[] param2) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
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
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (!this.field_k.equals(param1)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param2.length == this.field_n.length) {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    field_m = (int[]) null;
                    break L1;
                  }
                }
                var4_int = 0;
                L2: while (true) {
                  if (var4_int >= this.field_n.length) {
                    stackIn_31_0 = 1;
                    decompiledRegionSelector0 = 6;
                    break L0;
                  } else {
                    L3: {
                      if (param2[var4_int].field_a) {
                        L4: {
                          var5 = sna.a(param2[var4_int].field_b, (byte) 124);
                          if (var5 != Boolean.TYPE) {
                            break L4;
                          } else {
                            if (this.field_n[var4_int] != Boolean.TYPE) {
                              stackIn_20_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          if (var5 != Character.TYPE) {
                            break L5;
                          } else {
                            if (this.field_n[var4_int] == Character.TYPE) {
                              break L5;
                            } else {
                              stackIn_24_0 = 0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                        if (!ke.a(var5, 24145)) {
                          break L3;
                        } else {
                          if (ke.a(this.field_n[var4_int], 24145)) {
                            break L3;
                          } else {
                            stackIn_28_0 = 0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        if (this.field_n[var4_int].isInstance(param2[var4_int].field_b)) {
                          break L3;
                        } else {
                          stackIn_15_0 = 0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                    var4_int++;
                    continue L2;
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
          L6: {
            var4 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var4);

            stackIn_34_1 = new StringBuilder().append("rqa.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L6;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_37_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');

            if (param2 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L7;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_35_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_24_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_28_0 != 0;
                  } else {
                    return stackIn_31_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    rqa(String param0, Class[] param1, String param2) {
        StringBuilder var7 = null;
        StringBuilder var8 = null;
        int var5 = 0;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        try {
            this.field_k = param0;
            this.field_n = param1;
            var7 = new StringBuilder(this.field_k).append('(');
            var8 = var7;
            for (var5 = 0; var5 < this.field_n.length; var5++) {
                discarded$18 = var7.append(wp.a(this.field_n[var5], false));
                if (var5 < -1 + this.field_n.length) {
                    discarded$19 = var8.append(", ");
                }
            }
            discarded$28 = var8.append(')');
            if (param2 != null) {
                discarded$29 = var8.append("     <col=ffaaff>" + param2 + "</col>");
            }
            this.field_l = var8.toString();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "rqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract nc a(nc[] param0, int param1);

    static {
        field_m = new int[5];
    }
}
