/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends en {
    static wd field_O;
    private je field_N;

    final void i(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(((pk) this).field_N);
        ld var3 = (ld) (Object) var2.a(true);
        if (param0 != 0) {
            return;
        }
        while (var3 != null) {
            var3.field_K = false;
            var3 = (ld) (Object) var2.b((byte) -58);
        }
        ((pk) this).field_J = null;
    }

    final void a(na param0, boolean param1) {
        if (!(param0 instanceof ld)) {
            throw new IllegalArgumentException();
        }
        if (param1) {
            field_O = null;
        }
        ld var3 = (ld) (Object) param0;
        ((pk) this).field_N.a((mc) (Object) var3, -25);
        var3.field_K = true;
        boolean discarded$0 = var3.a((na) this, -384169950);
    }

    final void j(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(((pk) this).field_N);
        if (param0 != 0) {
            return;
        }
        ld var3 = (ld) (Object) var2.a(true);
        while (var3 != null) {
            if (!(!var3.l(param0 ^ -1))) {
                var3.b(false);
            }
            var3 = (ld) (Object) var2.b((byte) -58);
        }
        ((pk) this).field_J = (na) (Object) ((pk) this).a(false);
    }

    final ld a(boolean param0) {
        tg var2 = null;
        ld var3 = null;
        int var4 = 0;
        L0: {
          var4 = TetraLink.field_J;
          var2 = new tg(((pk) this).field_N);
          var3 = (ld) (Object) var2.a(true);
          if (!param0) {
            break L0;
          } else {
            ((pk) this).i(85);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_K) {
              return var3;
            } else {
              var3 = (ld) (Object) var2.b((byte) -58);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        bh var9 = null;
        byte[] var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        byte[] var16 = null;
        byte[] var17 = null;
        Throwable decompiledCaughtException = null;
        if (param1 >= 65) {
          L0: {
            var9 = new bh(param0);
            var3 = var9.d((byte) -99);
            var4 = var9.f(-123);
            if (0 > var4) {
              break L0;
            } else {
              L1: {
                if (0 == rj.field_g) {
                  break L1;
                } else {
                  if (rj.field_g < var4) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 == var3) {
                var17 = new byte[var4];
                var15 = var17;
                var13 = var15;
                var11 = var13;
                var5 = var11;
                var9.b(var4, 0, var17, 2);
                return var5;
              } else {
                L2: {
                  var5_int = var9.f(89);
                  if (0 > var5_int) {
                    break L2;
                  } else {
                    L3: {
                      if (0 == rj.field_g) {
                        break L3;
                      } else {
                        if (rj.field_g < var5_int) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      var16 = new byte[var5_int];
                      var14 = var16;
                      var12 = var14;
                      var10 = var12;
                      var6 = var10;
                      if ((var3 ^ -1) == -2) {
                        int discarded$1 = sl.a(var16, var5_int, param0, var4, 9);
                        break L4;
                      } else {
                        var7 = (Object) (Object) oc.field_z;
                        synchronized (var7) {
                          L5: {
                            oc.field_z.a((byte) 114, var16, var9);
                            break L5;
                          }
                        }
                        break L4;
                      }
                    }
                    return var6;
                  }
                }
                throw new RuntimeException();
              }
            }
          }
          throw new RuntimeException();
        } else {
          return null;
        }
    }

    public pk() {
        super(0, 0, i.field_e, bi.field_a, (kg) null, (dn) null);
        ((pk) this).field_N = new je();
    }

    public static void h(int param0) {
        field_O = null;
        if (param0 != -2) {
            Object var2 = null;
            pk.a(-112, (java.applet.Applet) null);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        CharSequence var4 = null;
        String var2 = param1.getParameter("username");
        if (param0 >= -32) {
            Object var3 = null;
            pk.a(35, (java.applet.Applet) null);
        }
        if (var2 != null) {
            var4 = (CharSequence) (Object) var2;
            if (!(0L != il.a(-23718, var4))) {
                return;
            }
            return;
        }
    }

    final na a(int param0) {
        tg var2 = null;
        ld var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = TetraLink.field_J;
          var2 = new tg(((pk) this).field_N);
          var3 = (ld) (Object) var2.a(true);
          if (param0 == 9) {
            break L0;
          } else {
            var5 = null;
            ((pk) this).a((na) null, true);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_K) {
              var3 = (ld) (Object) var2.b((byte) -58);
              continue L1;
            } else {
              return var3.d((byte) 5);
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = TetraLink.field_J;
        if (!(null == ((pk) this).field_H)) {
            ((pk) this).field_H.a((na) this, param1, param2, true, true);
        }
        tg var5 = new tg(((pk) this).field_N);
        if (param0 != 0) {
            return;
        }
        na var6 = (na) (Object) var5.b(param0 ^ -115);
        while (var6 != null) {
            var6.a(0, param1 + ((pk) this).field_t, param2 - -((pk) this).field_w, param3);
            var6 = (na) (Object) var5.a((byte) -66);
        }
    }

    final void e(byte param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(((pk) this).field_N);
        if (param0 != -110) {
            ((pk) this).a(18, -69, -122, 50);
        }
        ld var3 = (ld) (Object) var2.a(true);
        while (var3 != null) {
            if (var3.h(param0 ^ -652390206)) {
                var3.b(false);
            }
            var3 = (ld) (Object) var2.b((byte) -58);
        }
    }

    static {
    }
}
