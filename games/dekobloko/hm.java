/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hm {
    static mi field_c;
    static ud field_d;
    static jc field_a;
    static w field_b;
    static int[][] field_e;

    abstract int a(int param0);

    final static void a(nf param0, mm param1, int param2, String param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        var5 = 0;
        var6 = param4;
        var7 = 1;
        L0: while (true) {
          if (param3.length() > var7) {
            var8 = param3.charAt(var7);
            if (var9 == 0) {
              L1: {
                if (var8 == 60) {
                  var6 = param0.field_a[0] + ((var5 >> 1028880040) - -param1.a(param3.substring(0, var7)));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (-1 != var6) {
                    break L3;
                  } else {
                    L4: {
                      if (32 != var8) {
                        break L4;
                      } else {
                        var5 = var5 + param2;
                        break L4;
                      }
                    }
                    param0.field_a[var7] = (var5 >> 685930120) - -param0.field_a[0] - (-param1.a(param3.substring(0, var7 + 1)) + param1.a((char) var8));
                    if (var9 == 0) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                param0.field_a[var7] = var6;
                break L2;
              }
              L5: {
                if (var8 == 62) {
                  var6 = -1;
                  break L5;
                } else {
                  break L5;
                }
              }
              var7++;
              continue L0;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        int var1 = -36 / ((param0 - -11) / 52);
        field_a = null;
        field_e = null;
    }

    abstract void a(int param0, java.awt.Component param1);

    final static void a(int param0, byte param1) {
        if (param1 >= -101) {
            return;
        }
        ai.field_P = param0;
    }

    final static fm a(boolean param0, String param1, String param2, int param3) {
        long var4 = 0L;
        Object var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        if (param3 != 9507) {
          L0: {
            L1: {
              field_d = null;
              var4 = 0L;
              var6 = null;
              if (param2.indexOf('@') != -1) {
                break L1;
              } else {
                var7 = (CharSequence) (Object) param2;
                var4 = ab.a(121, var7);
                if (!client.field_A) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var6 = (Object) (Object) param2;
            break L0;
          }
          return sb.a(var4, param1, param0, (String) var6, 0);
        } else {
          L2: {
            L3: {
              var4 = 0L;
              var6 = null;
              if (param2.indexOf('@') != -1) {
                break L3;
              } else {
                var8 = (CharSequence) (Object) param2;
                var4 = ab.a(121, var8);
                if (!client.field_A) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            var6 = (Object) (Object) param2;
            break L2;
          }
          return sb.a(var4, param1, param0, (String) var6, 0);
        }
    }

    abstract void a(java.awt.Component param0, int param1);

    final static void a(int param0, boolean param1) {
        L0: {
          if (null != sl.field_g) {
            qd.a(sl.field_g, -2);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (w.field_H != null) {
            w.field_H.a((byte) 39, param1);
            break L1;
          } else {
            break L1;
          }
        }
        r.a(param1, 4028);
        if (param0 == -1) {
          if (null != pd.field_f) {
            pd.field_f.a(1141039778, param1);
            lg.a(param1, -123);
            return;
          } else {
            lg.a(param1, -123);
            return;
          }
        } else {
          field_d = null;
          if (null == pd.field_f) {
            lg.a(param1, -123);
            return;
          } else {
            pd.field_f.a(1141039778, param1);
            lg.a(param1, -123);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new jc();
        field_e = null;
    }
}
