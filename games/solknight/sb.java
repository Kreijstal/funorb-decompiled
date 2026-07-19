/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb implements Runnable {
    static nc field_c;
    dl field_b;
    volatile gj[] field_a;
    volatile boolean field_e;
    volatile boolean field_f;
    static int field_d;

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        gj var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        String var6 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        this.field_f = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    if (this.field_e) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if (2 <= var1_int) {
                                break L6;
                              } else {
                                var2 = this.field_a[var1_int];
                                if (var4 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (var2 == null) {
                                      break L7;
                                    } else {
                                      var2.b();
                                      break L7;
                                    }
                                  }
                                  var1_int++;
                                  if (var4 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            i.a((byte) 18, 10L);
                            var5 = (Object) null;
                            pb.a(this.field_b, (Object) null, (byte) 106);
                            break L5;
                          }
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              exception = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              hi.a((Throwable) ((Object) exception), (String) null, 1);
              this.field_f = false;
              return;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_f = false;
          throw sb.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L8: {
          if (decompiledRegionSelector1 == 0) {
            this.field_f = false;
            break L8;
          } else {
            break L8;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param2 != 1513551664) {
          return -96;
        } else {
          var3 = param0 >> 1218313584;
          var4 = 65535 & param0;
          var5 = param1 >> 134446224;
          var6 = 65535 & param1;
          return (var4 * var6 >> 1513551664) + (param1 * var3 - -(var4 * var5));
        }
    }

    final static hd a(byte[] param0, int param1) {
        hd var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        hd stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hd stackOut_5_0 = null;
        Object stackOut_1_0 = null;
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
            if (param0 != null) {
              L1: {
                if (param1 == 32223) {
                  break L1;
                } else {
                  field_d = 21;
                  break L1;
                }
              }
              var2 = new hd(param0, ph.field_h, qf.field_d, sa.field_l, uj.field_b, jc.field_c);
              og.a((byte) -97);
              stackOut_5_0 = (hd) (var2);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var2_ref);
            stackOut_7_1 = new StringBuilder().append("sb.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw fc.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hd) ((Object) stackIn_2_0);
        } else {
          return stackIn_6_0;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != -90) {
            sb.a((byte) -7);
        }
    }

    sb() {
        this.field_a = new gj[2];
        this.field_e = false;
        this.field_f = false;
    }

    static {
        field_c = new nc();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
