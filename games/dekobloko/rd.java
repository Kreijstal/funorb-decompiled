/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd {
    private bh field_d;
    private vj field_b;
    static boolean[] field_c;
    static w field_e;
    static w field_a;

    final static w b(int param0) {
        if (param0 > -26) {
            int discarded$0 = rd.a((byte) -21, 73, 124);
            return df.i(119);
        }
        return df.i(119);
    }

    final bh a(bh param0, boolean param1) {
        bh var3 = null;
        if (param1) {
            return null;
        }
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((rd) this).field_b.field_c.field_b;
        }
        if (!(var3 != ((rd) this).field_b.field_c)) {
            ((rd) this).field_d = null;
            return null;
        }
        ((rd) this).field_d = var3.field_b;
        return var3;
    }

    public static void b(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -119) {
            field_c = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    final bh a(int param0) {
        bh var2 = ((rd) this).field_d;
        if (param0 >= -40) {
            field_c = null;
            if (!(((rd) this).field_b.field_c != var2)) {
                ((rd) this).field_d = null;
                return null;
            }
            ((rd) this).field_d = var2.field_b;
            return var2;
        }
        if (!(((rd) this).field_b.field_c != var2)) {
            ((rd) this).field_d = null;
            return null;
        }
        ((rd) this).field_d = var2.field_b;
        return var2;
    }

    final static int a(String param0, int param1, String param2, String param3, int param4, int param5, boolean param6) {
        jg var7 = null;
        jg var8 = null;
        var7 = new jg(param3);
        if (param4 != 0) {
          return -75;
        } else {
          var8 = new jg(param2);
          return qb.a(param6, param1, var7, -109, param5, var8, param0);
        }
    }

    final bh a(boolean param0) {
        bh var2 = ((rd) this).field_b.field_c.field_a;
        if (!param0) {
            Object var3 = null;
            int discarded$10 = rd.a((String) null, 14, (String) null, (String) null, -52, 96, false);
            if (!(var2 != ((rd) this).field_b.field_c)) {
                ((rd) this).field_d = null;
                return null;
            }
            ((rd) this).field_d = var2.field_a;
            return var2;
        }
        if (!(var2 != ((rd) this).field_b.field_c)) {
            ((rd) this).field_d = null;
            return null;
        }
        ((rd) this).field_d = var2.field_a;
        return var2;
    }

    final bh a(bh param0, byte param1) {
        bh var3 = null;
        L0: {
          if (param0 == null) {
            var3 = ((rd) this).field_b.field_c.field_a;
            break L0;
          } else {
            var3 = param0;
            break L0;
          }
        }
        if (((rd) this).field_b.field_c != var3) {
          ((rd) this).field_d = var3.field_a;
          if (param1 != -88) {
            return null;
          } else {
            return var3;
          }
        } else {
          ((rd) this).field_d = null;
          return null;
        }
    }

    rd(vj param0) {
        ((rd) this).field_b = param0;
    }

    final bh d(int param0) {
        bh var2 = null;
        var2 = ((rd) this).field_d;
        if (var2 == ((rd) this).field_b.field_c) {
          ((rd) this).field_d = null;
          return null;
        } else {
          if (param0 != 2078965185) {
            w discarded$2 = rd.b(-96);
            ((rd) this).field_d = var2.field_a;
            return var2;
          } else {
            ((rd) this).field_d = var2.field_a;
            return var2;
          }
        }
    }

    final bh a(byte param0) {
        bh var2 = null;
        Object var3 = null;
        var2 = ((rd) this).field_b.field_c.field_b;
        if (param0 == 71) {
          if (var2 == ((rd) this).field_b.field_c) {
            ((rd) this).field_d = null;
            return null;
          } else {
            ((rd) this).field_d = var2.field_b;
            return var2;
          }
        } else {
          var3 = null;
          int discarded$7 = rd.a((String) null, -87, (String) null, (String) null, -5, -114, false);
          if (var2 == ((rd) this).field_b.field_c) {
            ((rd) this).field_d = null;
            return null;
          } else {
            ((rd) this).field_d = var2.field_b;
            return var2;
          }
        }
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        String var2 = null;
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (!param1) {
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var4 = (CharSequence) (Object) var2;
            if ((ab.a(120, var4) ^ -1L) == -1L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          rd.c(-42);
          var2 = param0.getParameter("username");
          if (var2 != null) {
            var3 = (CharSequence) (Object) var2;
            if ((ab.a(120, var3) ^ -1L) == -1L) {
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        if (param0 != 16) {
          w discarded$2 = rd.b(15);
          var3 = 0;
          L0: while (true) {
            if (0 >= param1) {
              return var3;
            } else {
              var3 = var3 << 2078965185 | param2 & 1;
              param2 = param2 >>> 1;
              param1--;
              continue L0;
            }
          }
        } else {
          var3 = 0;
          L1: while (true) {
            if (0 >= param1) {
              return var3;
            } else {
              var3 = var3 << 2078965185 | param2 & 1;
              param2 = param2 >>> 1;
              param1--;
              continue L1;
            }
          }
        }
    }

    final static boolean a(CharSequence param0, int param1) {
        if (param1 != -27454) {
            return false;
        }
        return ug.a(param0, false, 100);
    }

    final static void c(int param0) {
        int var4 = client.field_A ? 1 : 0;
        int[] var5 = a.field_r;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            int incrementValue$0 = var2;
            var2++;
            var5[incrementValue$0] = 0;
            int incrementValue$1 = var2;
            var2++;
            var5[incrementValue$1] = 0;
            int incrementValue$2 = var2;
            var2++;
            var5[incrementValue$2] = 0;
            int incrementValue$3 = var2;
            var2++;
            var5[incrementValue$3] = 0;
            int incrementValue$4 = var2;
            var2++;
            var5[incrementValue$4] = 0;
            int incrementValue$5 = var2;
            var2++;
            var5[incrementValue$5] = 0;
            int incrementValue$6 = var2;
            var2++;
            var5[incrementValue$6] = 0;
            int incrementValue$7 = var2;
            var2++;
            var5[incrementValue$7] = 0;
        }
    }

    static {
    }
}
