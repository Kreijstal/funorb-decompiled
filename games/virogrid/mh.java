/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends bk {
    private String field_k;
    static String[] field_i;
    static String field_j;
    static int field_g;
    private long field_h;
    static String field_f;
    static String field_e;

    ul a(boolean param0) {
        if (!param0) {
            mh.b((byte) -16);
        }
        return p.field_b;
    }

    public static void b(byte param0) {
        field_f = null;
        field_i = null;
        field_j = null;
        if (param0 != 51) {
            field_i = (String[]) null;
        }
        field_e = null;
    }

    final static String a(CharSequence[] param0, byte param1, int param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param3 == 0) {
              stackIn_4_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-2 == (param3 ^ -1)) {
                var10 = param0[param2];
                var4 = var10;
                if (var4 != null) {
                  stackIn_11_0 = var10.toString();
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_9_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                var4_int = param3 + param2;
                var5 = 0;
                var6_int = param2;
                L1: while (true) {
                  if (var4_int <= var6_int) {
                    L2: {
                      var6 = new StringBuilder(var5);
                      if (param1 > 3) {
                        break L2;
                      } else {
                        mh.a(-16L, (byte) -125);
                        break L2;
                      }
                    }
                    var7 = param2;
                    L3: while (true) {
                      if (var7 >= var4_int) {
                        stackIn_27_0 = var6.toString();
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        L4: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            discarded$3 = var6.append(var8);
                            break L4;
                          } else {
                            discarded$4 = var6.append("null");
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L5;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var4_ref);

            stackIn_30_1 = new StringBuilder().append("mh.D(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L6;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L6;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_11_0;
            } else {
              return stackIn_27_0;
            }
          }
        }
    }

    final void a(boolean param0, jc param1) {
        try {
            param1.a((byte) 87, this.field_h);
            param1.c(this.field_k, (byte) 60);
            if (param0) {
                mh.a(-122L, (byte) -22);
            }
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "mh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(long param0, byte param1) {
        try {
            Throwable decompiledCaughtException = null;
            InterruptedException var3 = null;
            CharSequence[] var4 = null;
            try {
              L0: {
                L1: {
                  Thread.sleep(param0);
                  if (param1 == -88) {
                    break L1;
                  } else {
                    var4 = (CharSequence[]) null;
                    mh.a((CharSequence[]) null, (byte) 99, -73, 66);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var3 = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    mh(long param0, String param1) {
        try {
            this.field_k = param1;
            this.field_h = param0;
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "mh.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = new String[]{"None", "Easy", "Normal", "Hard"};
        field_f = "<%0> has resigned and left.";
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_j = "Create your own free Jagex account";
    }
}
