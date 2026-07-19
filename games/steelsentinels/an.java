/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class an implements Runnable {
    volatile boolean field_c;
    volatile tb[] field_e;
    static int[] field_d;
    static int field_b;
    static gh field_a;
    static int field_h;
    pn field_j;
    static dd field_i;
    static String[] field_g;
    volatile boolean field_f;

    final static void a(int param0, boolean param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = SteelSentinels.field_G;
        var4 = 83 % ((param3 - 35) / 50);
        if (param0 != -1) {
          if ((param0 ^ -1) != 1) {
            L0: {
              if (param1) {
                qf.a(false, (byte) -117);
                break L0;
              } else {
                break L0;
              }
            }
            i.field_e[param0].r(0);
            return;
          } else {
            pb.b();
            return;
          }
        } else {
          qf.a(param2, (byte) -122);
          return;
        }
    }

    public final void run() {
        int var1_int = 0;
        Exception var1 = null;
        tb var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        this.field_f = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_c) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (2 <= var1_int) {
                        a.a((byte) 118, 10L);
                        le.a((Object) null, 50, this.field_j);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_e[var1_int];
                          if (var2 != null) {
                            var2.b();
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var1_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var5 = (String) null;
              sj.a((String) null, -72, (Throwable) ((Object) var1));
              this.field_f = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_f = false;
          throw an.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_f = false;
    }

    public static void a(byte param0) {
        field_d = null;
        field_i = null;
        field_g = null;
        if (param0 != -63) {
            field_h = -29;
            field_a = null;
            return;
        }
        field_a = null;
    }

    an() {
        this.field_e = new tb[2];
        this.field_c = false;
        this.field_f = false;
    }

    static {
        field_b = 100;
        field_h = 20;
        field_d = new int[8192];
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
