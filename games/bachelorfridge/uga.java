/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uga extends ana {
    static String field_A;
    private wfa field_z;
    static int field_y;
    static kv field_C;
    static vr field_B;
    static int field_v;
    static String field_w;
    static int field_x;

    final static boolean e(int param0) {
        if (param0 != 37) {
            field_B = null;
            return true;
        }
        return true;
    }

    public static void f(byte param0) {
        field_A = null;
        field_w = null;
        if (param0 != 21) {
            return;
        }
        field_B = null;
        field_C = null;
    }

    uga(gj param0, wfa param1) {
        super(param0, (bca) (Object) param1);
        ((uga) this).field_z = param1;
    }

    private final void e(byte param0) {
        Object var3 = null;
        iv var3_ref = null;
        int var5 = 0;
        aga var6 = null;
        ad var7 = null;
        L0: {
          var3 = null;
          var5 = BachelorFridge.field_y;
          var6 = ((uga) this).field_z.field_l.a(96, ((uga) this).field_q.field_h);
          if (param0 < -78) {
            break L0;
          } else {
            this.e((byte) 27);
            break L0;
          }
        }
        if (var6.i(-83)) {
          return;
        } else {
          var3_ref = (iv) (Object) ((uga) this).field_z.field_o.b((byte) 90);
          oha discarded$1 = al.a(-86, ((uga) this).field_z.field_k);
          L1: while (true) {
            if (var3_ref == null) {
              return;
            } else {
              var3_ref.a(var6, ((uga) this).field_q.field_h, 12);
              var7 = var3_ref.field_h.a(-27449, ((uga) this).field_q);
              var7.b(-1, 6);
              ((uga) this).a(27799, (at) (Object) new ek(((uga) this).field_q, ((uga) this).field_z.field_l.a(-27449, ((uga) this).field_q), -200));
              var3_ref = (iv) (Object) ((uga) this).field_z.field_o.c(0);
              continue L1;
            }
          }
        }
    }

    private final void d(int param0) {
        if (param0 > -10) {
            field_w = null;
        }
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = BachelorFridge.field_y;
        if (param1 > 43) {
          if (param0 > 0L) {
            if (6582952005840035281L > param0) {
              if (param0 % 37L == 0L) {
                return null;
              } else {
                var3 = 0;
                var4 = param0;
                L0: while (true) {
                  if (-1L == (var4 ^ -1L)) {
                    var13 = new StringBuilder(var3);
                    L1: while (true) {
                      if (-1L == (param0 ^ -1L)) {
                        StringBuilder discarded$4 = var13.reverse();
                        var13.setCharAt(0, Character.toUpperCase(var13.charAt(0)));
                        return var13.toString();
                      } else {
                        L2: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ga.field_a[(int)(-(param0 * 37L) + var7)];
                          if (var9 == 95) {
                            var10 = var13.length() + -1;
                            var9 = 160;
                            var13.setCharAt(var10, Character.toUpperCase(var13.charAt(var10)));
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        StringBuilder discarded$5 = var13.append(var9);
                        continue L1;
                      }
                    }
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          field_w = null;
          if (param0 > 0L) {
            if (6582952005840035281L > param0) {
              if (param0 % 37L == 0L) {
                return null;
              } else {
                var3 = 0;
                var4 = param0;
                L3: while (true) {
                  if (-1L == (var4 ^ -1L)) {
                    var12 = new StringBuilder(var3);
                    L4: while (true) {
                      if (-1L == (param0 ^ -1L)) {
                        StringBuilder discarded$6 = var12.reverse();
                        var12.setCharAt(0, Character.toUpperCase(var12.charAt(0)));
                        return var12.toString();
                      } else {
                        L5: {
                          var7 = param0;
                          param0 = param0 / 37L;
                          var9 = ga.field_a[(int)(-(param0 * 37L) + var7)];
                          if (var9 == 95) {
                            var10 = var12.length() + -1;
                            var9 = 160;
                            var12.setCharAt(var10, Character.toUpperCase(var12.charAt(var10)));
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        StringBuilder discarded$7 = var12.append(var9);
                        continue L4;
                      }
                    }
                  } else {
                    var3++;
                    var4 = var4 / 37L;
                    continue L3;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        }
    }

    final boolean c(byte param0) {
        ((uga) this).field_l = ((uga) this).field_l - 1;
        if (!(((uga) this).field_l - 1 < 0)) {
            if (-26 != (((uga) this).field_l ^ -1)) {
                return false;
            }
            wf.a(22, (byte) 126);
            this.e((byte) -90);
            return false;
        }
        this.d(-63);
        int var2 = -17 / ((71 - param0) / 47);
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "That name is not available";
        field_y = 0;
        field_v = 12320512;
        field_w = "Shopping bag. Click the tooltips to continue.";
        field_x = 0;
    }
}
