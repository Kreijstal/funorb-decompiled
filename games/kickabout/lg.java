/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lg implements l {
    static ut field_a;
    static String field_c;
    private long field_b;

    abstract rv a(boolean param0);

    final static byte[] a(Object param0, boolean param1, int param2) {
        byte[] var3 = null;
        pf var4 = null;
        if (param0 != null) {
          if (param0 instanceof byte[]) {
            var3 = (byte[]) param0;
            if (!param1) {
              return var3;
            } else {
              return vq.a(70, var3);
            }
          } else {
            if (param0 instanceof pf) {
              var4 = (pf) param0;
              return var4.a(2);
            } else {
              if (param2 != 18828) {
                return null;
              } else {
                throw new IllegalArgumentException();
              }
            }
          }
        } else {
          return null;
        }
    }

    public final String b(int param0) {
        if (!((lg) this).a((byte) -28)) {
          if (param0 <= -23) {
            if ((nj.a(37) ^ -1L) > (350L + ((lg) this).field_b ^ -1L)) {
              return null;
            } else {
              return ((lg) this).e(-1);
            }
          } else {
            field_c = null;
            if ((nj.a(37) ^ -1L) > (350L + ((lg) this).field_b ^ -1L)) {
              return null;
            } else {
              return ((lg) this).e(-1);
            }
          }
        } else {
          return null;
        }
    }

    public final rv c(int param0) {
        if (((lg) this).a((byte) -28)) {
          return os.field_l;
        } else {
          if (nj.a(-104) >= 350L + ((lg) this).field_b) {
            if (param0 != -24407) {
              field_a = null;
              return ((lg) this).a(false);
            } else {
              return ((lg) this).a(false);
            }
          } else {
            return mn.field_c;
          }
        }
    }

    public static void d(int param0) {
        field_c = null;
        if (param0 != 350) {
            return;
        }
        field_a = null;
    }

    final static boolean a(String param0, byte param1) {
        Object var3 = null;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        if (param1 == 79) {
          if (param0 != null) {
            if (param0.length() < aq.field_c) {
              return true;
            } else {
              L0: {
                if (param0.length() > ko.field_c) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L0;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            return true;
          }
        } else {
          var3 = null;
          byte[] discarded$6 = lg.a((Object) null, true, -58);
          if (param0 != null) {
            if (param0.length() >= aq.field_c) {
              if (param0.length() <= ko.field_c) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public final void a(int param0) {
        ((lg) this).field_b = nj.a(-122);
        int var2 = 76 % ((42 - param0) / 58);
    }

    final static js a(int param0, int param1) {
        if (!((param0 ^ -1) != 0)) {
            return (js) (Object) um.field_e;
        }
        if (!(param0 != -2)) {
            return (js) (Object) sr.field_l;
        }
        if (param1 != 24939) {
            return null;
        }
        if (!(2 != param0)) {
            return (js) (Object) new kt();
        }
        if (4 == param0) {
            return (js) (Object) new e();
        }
        if (!(0 <= param0)) {
            throw new IllegalStateException();
        }
        return (js) (Object) rn.a(-118, param0);
    }

    abstract String e(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Records";
        field_a = new ut(926, 1374);
    }
}
