/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dtb implements dja {
    static String field_a;

    public static void b(byte param0) {
        if (param0 != 124) {
            return;
        }
        field_a = null;
    }

    public final tv a(byte param0) {
        int var2 = 49 % ((-64 - param0) / 50);
        return (tv) ((Object) new bea());
    }

    final static fm[] a(eab param0, int param1) {
        RuntimeException var2 = null;
        int[] var3 = null;
        fm[] var4 = null;
        int var5 = 0;
        fm var6 = null;
        int var7 = 0;
        mob var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        fm[] stackIn_4_0 = null;
        fm[] stackIn_10_0 = null;
        fm[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = VoidHunters.field_G;
        try {
          L0: {
            if (!param0.a(0)) {
              stackIn_4_0 = new fm[]{};
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = param0.d(85);
              L1: while (true) {
                if (var8.field_f != 0) {
                  if (2 != var8.field_f) {
                    L2: {
                      if (param1 == -30334) {
                        break L2;
                      } else {
                        field_a = (String) null;
                        break L2;
                      }
                    }
                    var10 = (int[]) (var8.field_d);
                    var9 = var10;
                    var3 = var9;
                    var4 = new fm[var10.length >> -154401150];
                    var5 = 0;
                    L3: while (true) {
                      if (var5 >= var4.length) {
                        stackIn_17_0 = (fm[]) (var4);
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var6 = new fm();
                        var4[var5] = var6;
                        var6.field_c = var3[var5 << -985098878];
                        var6.field_a = var3[1 + (var5 << 569835714)];
                        var6.field_e = var3[2 + (var5 << -845278878)];
                        var6.field_d = var3[(var5 << 242657410) - -3];
                        var5++;
                        continue L3;
                      }
                    }
                  } else {
                    stackIn_10_0 = new fm[]{};
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  gdb.b(127, 10L);
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var2);

            stackIn_20_1 = new StringBuilder().append("dtb.D(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_17_0;
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            CharSequence var4 = (CharSequence) null;
            dtb.a('￸', 101, (CharSequence) null);
        }
        return (tv[]) ((Object) new bea[param1]);
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 18) {
              if (qnb.a((byte) -35, param0)) {
                if (param2 != null) {
                  var3_int = param2.length();
                  if (12 > var3_int) {
                    L1: {
                      if (!fg.a(param0, 70)) {
                        break L1;
                      } else {
                        if (var3_int != 0) {
                          break L1;
                        } else {
                          stackIn_15_0 = 0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    stackIn_17_0 = 1;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    stackIn_11_0 = 0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_8_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var3);

            stackIn_20_1 = new StringBuilder().append("dtb.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L2;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_15_0 != 0;
                } else {
                  return stackIn_17_0 != 0;
                }
              }
            }
          }
        }
    }

    static {
        field_a = "Keep the tech in your spawn to deplete the enemy's score";
    }
}
