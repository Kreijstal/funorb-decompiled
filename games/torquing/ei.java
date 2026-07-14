/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    q field_b;
    static ed field_c;
    private q field_a;

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        if (param1.equals((Object) (Object) "B")) {
            return Byte.TYPE;
        }
        if (param1.equals((Object) (Object) "I")) {
            return Integer.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "S"))) {
            return Short.TYPE;
        }
        if (param0 > -102) {
            ei.d(13);
            if (param1.equals((Object) (Object) "J")) {
                return Long.TYPE;
            }
            if (param1.equals((Object) (Object) "Z")) {
                return Boolean.TYPE;
            }
            if (!(!param1.equals((Object) (Object) "F"))) {
                return Float.TYPE;
            }
            if (param1.equals((Object) (Object) "D")) {
                return Double.TYPE;
            }
            if (!(!param1.equals((Object) (Object) "C"))) {
                return Character.TYPE;
            }
            return Class.forName(param1);
        }
        if (param1.equals((Object) (Object) "J")) {
            return Long.TYPE;
        }
        if (param1.equals((Object) (Object) "Z")) {
            return Boolean.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "F"))) {
            return Float.TYPE;
        }
        if (param1.equals((Object) (Object) "D")) {
            return Double.TYPE;
        }
        if (!(!param1.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param1);
    }

    final int a(boolean param0) {
        int var2 = 0;
        q var3 = null;
        int var4 = 0;
        var4 = Torquing.field_u;
        if (param0) {
          return -4;
        } else {
          var2 = 0;
          var3 = ((ei) this).field_b.field_e;
          L0: while (true) {
            if (((ei) this).field_b == var3) {
              return var2;
            } else {
              var2++;
              var3 = var3.field_e;
              continue L0;
            }
          }
        }
    }

    final void a(byte param0, q param1) {
        if (null == param1.field_h) {
          param1.field_e = ((ei) this).field_b;
          param1.field_h = ((ei) this).field_b.field_h;
          param1.field_h.field_e = param1;
          param1.field_e.field_h = param1;
          if (param0 == 54) {
            return;
          } else {
            q discarded$4 = ((ei) this).f(-122);
            return;
          }
        } else {
          param1.f(0);
          param1.field_e = ((ei) this).field_b;
          param1.field_h = ((ei) this).field_b.field_h;
          param1.field_h.field_e = param1;
          param1.field_e.field_h = param1;
          if (param0 == 54) {
            return;
          } else {
            q discarded$5 = ((ei) this).f(-122);
            return;
          }
        }
    }

    final q b(int param0) {
        q var2 = null;
        var2 = ((ei) this).field_b.field_e;
        if (((ei) this).field_b != var2) {
          if (param0 != 0) {
            return null;
          } else {
            ((ei) this).field_a = var2.field_e;
            return var2;
          }
        } else {
          ((ei) this).field_a = null;
          return null;
        }
    }

    final q b(byte param0) {
        q var2 = null;
        int var3 = 0;
        var2 = ((ei) this).field_b.field_h;
        var3 = 70 / ((param0 - -20) / 35);
        if (((ei) this).field_b == var2) {
          return null;
        } else {
          var2.f(0);
          return var2;
        }
    }

    final q c(int param0) {
        q var2 = null;
        if (param0 == -6938) {
          var2 = ((ei) this).field_b.field_h;
          if (var2 == ((ei) this).field_b) {
            ((ei) this).field_a = null;
            return null;
          } else {
            ((ei) this).field_a = var2.field_h;
            return var2;
          }
        } else {
          field_c = null;
          var2 = ((ei) this).field_b.field_h;
          if (var2 == ((ei) this).field_b) {
            ((ei) this).field_a = null;
            return null;
          } else {
            ((ei) this).field_a = var2.field_h;
            return var2;
          }
        }
    }

    final q a(byte param0) {
        q var2 = null;
        int var3 = 0;
        var2 = ((ei) this).field_b.field_e;
        if (var2 == ((ei) this).field_b) {
          return null;
        } else {
          var2.f(0);
          var3 = 93 / ((param0 - -47) / 35);
          return var2;
        }
    }

    final q f(int param0) {
        q var2 = null;
        Object var3 = null;
        var2 = ((ei) this).field_a;
        if (param0 == -24059) {
          if (var2 == ((ei) this).field_b) {
            ((ei) this).field_a = null;
            return null;
          } else {
            ((ei) this).field_a = var2.field_e;
            return var2;
          }
        } else {
          var3 = null;
          ((ei) this).a((byte) -22, (q) null);
          if (var2 == ((ei) this).field_b) {
            ((ei) this).field_a = null;
            return null;
          } else {
            ((ei) this).field_a = var2.field_e;
            return var2;
          }
        }
    }

    final void a(int param0) {
        int var3 = 0;
        q var4 = null;
        q var5 = null;
        var3 = Torquing.field_u;
        if (param0 == 0) {
          L0: while (true) {
            var4 = ((ei) this).field_b.field_e;
            if (((ei) this).field_b == var4) {
              ((ei) this).field_a = null;
              return;
            } else {
              var4.f(0);
              continue L0;
            }
          }
        } else {
          boolean discarded$1 = ((ei) this).e(-39);
          L1: while (true) {
            var5 = ((ei) this).field_b.field_e;
            if (((ei) this).field_b == var5) {
              ((ei) this).field_a = null;
              return;
            } else {
              var5.f(0);
              continue L1;
            }
          }
        }
    }

    final void b(byte param0, q param1) {
        if (param1.field_h == null) {
          param1.field_e = ((ei) this).field_b.field_e;
          param1.field_h = ((ei) this).field_b;
          param1.field_h.field_e = param1;
          if (param0 != 68) {
            boolean discarded$4 = ((ei) this).e(11);
            param1.field_e.field_h = param1;
            return;
          } else {
            param1.field_e.field_h = param1;
            return;
          }
        } else {
          param1.f(0);
          param1.field_e = ((ei) this).field_b.field_e;
          param1.field_h = ((ei) this).field_b;
          param1.field_h.field_e = param1;
          if (param0 == 68) {
            param1.field_e.field_h = param1;
            return;
          } else {
            boolean discarded$5 = ((ei) this).e(11);
            param1.field_e.field_h = param1;
            return;
          }
        }
    }

    public static void d(int param0) {
        if (param0 < 25) {
            ei.d(19);
            field_c = null;
            return;
        }
        field_c = null;
    }

    public ei() {
        ((ei) this).field_b = new q();
        ((ei) this).field_b.field_h = ((ei) this).field_b;
        ((ei) this).field_b.field_e = ((ei) this).field_b;
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -84) {
          L0: {
            q discarded$10 = ((ei) this).f(41);
            if (((ei) this).field_b.field_e != ((ei) this).field_b) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ei) this).field_b.field_e != ((ei) this).field_b) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ed();
    }
}
