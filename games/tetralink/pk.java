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
        ld var3 = null;
        try {
            if (!(param0 instanceof ld)) {
                throw new IllegalArgumentException();
            }
            if (param1) {
                field_O = null;
            }
            var3 = (ld) (Object) param0;
            ((pk) this).field_N.a((mc) (Object) var3, -25);
            var3.field_K = true;
            boolean discarded$0 = var3.a((na) this, -384169950);
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "pk.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void j(int param0) {
        int var4 = TetraLink.field_J;
        tg var2 = new tg(((pk) this).field_N);
        if (param0 != 0) {
            return;
        }
        ld var3 = (ld) (Object) var2.a(true);
        while (var3 != null) {
            if (!(!var3.l(~param0))) {
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
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int var5_int = 0;
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
        Object stackIn_2_0 = null;
        byte[] stackIn_22_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        Throwable decompiledCaughtException = null;
        byte[] stackOut_23_0 = null;
        byte[] stackOut_21_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            if (param1 >= 65) {
              L1: {
                var9 = new bh(param0);
                var3 = var9.d((byte) -99);
                var4 = var9.f(-123);
                if (0 > var4) {
                  break L1;
                } else {
                  L2: {
                    if (0 == rj.field_g) {
                      break L2;
                    } else {
                      if (rj.field_g < var4) {
                        break L1;
                      } else {
                        break L2;
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
                    stackOut_23_0 = (byte[]) var5;
                    stackIn_24_0 = stackOut_23_0;
                    break L0;
                  } else {
                    L3: {
                      var5_int = var9.f(89);
                      if (0 > var5_int) {
                        break L3;
                      } else {
                        L4: {
                          if (0 == rj.field_g) {
                            break L4;
                          } else {
                            if (rj.field_g < var5_int) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L5: {
                          var16 = new byte[var5_int];
                          var14 = var16;
                          var12 = var14;
                          var10 = var12;
                          var6 = var10;
                          if (var3 == 1) {
                            int discarded$1 = sl.a(var16, var5_int, param0, var4, 9);
                            break L5;
                          } else {
                            var7 = (Object) (Object) oc.field_z;
                            synchronized (var7) {
                              L6: {
                                oc.field_z.a((byte) 114, var16, var9);
                                break L6;
                              }
                            }
                            break L5;
                          }
                        }
                        stackOut_21_0 = (byte[]) var6;
                        stackIn_22_0 = stackOut_21_0;
                        return stackIn_22_0;
                      }
                    }
                    throw new RuntimeException();
                  }
                }
              }
              throw new RuntimeException();
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("pk.M(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
        return stackIn_24_0;
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
        String var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (param0 < -32) {
                break L1;
              } else {
                var3 = null;
                pk.a(35, (java.applet.Applet) null);
                break L1;
              }
            }
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                var4 = (CharSequence) (Object) var2;
                if (0L == il.a(-23718, var4)) {
                  break L2;
                } else {
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("pk.H(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw oi.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
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
