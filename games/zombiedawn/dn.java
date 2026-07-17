/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dn extends pa {
    static wl field_I;
    private vo field_H;
    static vo field_D;
    static String field_G;
    static vn field_E;
    static String field_J;

    final void b(int param0, boolean param1, int param2) {
        int var8 = ZombieDawn.field_J;
        if (param2 == ((dn) this).field_i) {
            if (!(param0 != ((dn) this).field_n)) {
                return;
            }
        }
        int var4 = (-((dn) this).field_i + param2) / 2;
        int var5 = (-((dn) this).field_n + param0) / 2;
        cj var6 = new cj(((dn) this).field_H);
        ei var7 = (ei) (Object) var6.c((byte) -119);
        while (var7 != null) {
            var7.field_k = var7.field_k + var4;
            var7.field_j = var7.field_j + var5;
            var7 = (ei) (Object) var6.a((byte) 61);
        }
        ((dn) this).field_i = param2;
        ((dn) this).field_n = param0;
        if (param1) {
            field_G = null;
        }
    }

    final ei c(boolean param0) {
        cj var2 = null;
        ei var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          var2 = new cj(((dn) this).field_H);
          if (param0) {
            break L0;
          } else {
            ((dn) this).j(112);
            break L0;
          }
        }
        var3 = (ei) (Object) var2.c((byte) -116);
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_H) {
              var3 = (ei) (Object) var2.a((byte) 61);
              continue L1;
            } else {
              return var3;
            }
          } else {
            return null;
          }
        }
    }

    public static void h(int param0) {
        field_D = null;
        field_E = null;
        field_J = null;
        field_I = null;
        if (param0 != 0) {
            return;
        }
        field_G = null;
    }

    final static void a(am param0, int param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            n var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            n var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_65_0 = null;
            StringBuilder stackIn_65_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            String stackIn_66_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_63_0 = null;
            StringBuilder stackOut_63_1 = null;
            RuntimeException stackOut_65_0 = null;
            StringBuilder stackOut_65_1 = null;
            String stackOut_65_2 = null;
            RuntimeException stackOut_64_0 = null;
            StringBuilder stackOut_64_1 = null;
            String stackOut_64_2 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = ZombieDawn.field_J;
            try {
              L0: {
                var13 = (n) (Object) dj.field_l.b((byte) 26);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (~var4 <= ~var17.field_l) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_j;
                        param0.h(-116, var17.field_o);
                        var5 = 0;
                        L2: while (true) {
                          if (var17.field_l <= var5) {
                            int discarded$1 = param0.e(-120, var4);
                            var17.b(-27598);
                            break L0;
                          } else {
                            L3: {
                              if (var17.field_q[var5] != 0) {
                                param0.i(var17.field_q[var5], 111);
                                break L3;
                              } else {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var17.field_h[var5];
                                      if (var6_int == 0) {
                                        var15 = (java.lang.reflect.Field) var17.field_n[var5].field_d;
                                        var8 = var15.getInt((Object) null);
                                        param0.i(0, 64);
                                        param0.h(102, var8);
                                        break L5;
                                      } else {
                                        if (var6_int == 1) {
                                          var16_ref = (java.lang.reflect.Field) var17.field_n[var5].field_d;
                                          var19 = var16_ref;
                                          var19.setInt((Object) null, var17.field_j[var5]);
                                          param0.i(0, 122);
                                          break L5;
                                        } else {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var26 = (java.lang.reflect.Field) var17.field_n[var5].field_d;
                                            var8 = var26.getModifiers();
                                            param0.i(0, 29);
                                            param0.h(73, var8);
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int == 3) {
                                        var28 = (java.lang.reflect.Method) var17.field_m[var5].field_d;
                                        var25 = var17.field_i[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (~var25.length >= ~var10_int) {
                                            var10 = var28.invoke((Object) null, var9);
                                            if (var10 != null) {
                                              if (var10 instanceof Number) {
                                                param0.i(1, 12);
                                                param0.a(((Number) var10).longValue(), 121);
                                                break L6;
                                              } else {
                                                if (var10 instanceof String) {
                                                  param0.i(2, 61);
                                                  param0.a(128, (String) var10);
                                                  break L6;
                                                } else {
                                                  param0.i(4, -119);
                                                  break L6;
                                                }
                                              }
                                            } else {
                                              param0.i(0, 89);
                                              break L6;
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (var6_int == 4) {
                                          var27 = (java.lang.reflect.Method) var17.field_m[var5].field_d;
                                          var8 = var27.getModifiers();
                                          param0.i(0, -84);
                                          param0.h(69, var8);
                                          break L6;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    break L4;
                                  }
                                } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                  decompiledCaughtException = decompiledCaughtParameter4;
                                  L12: {
                                    var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                    param0.i(-14, 18);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.i(-15, -113);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.i(-16, 53);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.i(-18, -103);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.i(-19, -91);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.i(-20, 37);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.i(-21, 58);
                                    break L19;
                                  }
                                }
                                break L3;
                              }
                            }
                            var5++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      L20: {
                        if (null == var13.field_n[var4]) {
                          break L20;
                        } else {
                          L21: {
                            if (var13.field_n[var4].field_f != 2) {
                              break L21;
                            } else {
                              var13.field_q[var4] = -5;
                              break L21;
                            }
                          }
                          if (var13.field_n[var4].field_f == 0) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        }
                      }
                      L22: {
                        if (var13.field_m[var4] != null) {
                          L23: {
                            if (var13.field_m[var4].field_f != 2) {
                              break L23;
                            } else {
                              var13.field_q[var4] = -6;
                              break L23;
                            }
                          }
                          if (var13.field_m[var4].field_f == 0) {
                            var3 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        } else {
                          break L22;
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_63_0 = (RuntimeException) var2;
                stackOut_63_1 = new StringBuilder().append("dn.R(");
                stackIn_65_0 = stackOut_63_0;
                stackIn_65_1 = stackOut_63_1;
                stackIn_64_0 = stackOut_63_0;
                stackIn_64_1 = stackOut_63_1;
                if (param0 == null) {
                  stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
                  stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
                  stackOut_65_2 = "null";
                  stackIn_66_0 = stackOut_65_0;
                  stackIn_66_1 = stackOut_65_1;
                  stackIn_66_2 = stackOut_65_2;
                  break L24;
                } else {
                  stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
                  stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
                  stackOut_64_2 = "{...}";
                  stackIn_66_0 = stackOut_64_0;
                  stackIn_66_1 = stackOut_64_1;
                  stackIn_66_2 = stackOut_64_2;
                  break L24;
                }
              }
              throw sh.a((Throwable) (Object) stackIn_66_0, stackIn_66_2 + 44 + 84 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static vn[] f(byte param0) {
        vn[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        var8 = ZombieDawn.field_J;
        var1 = new vn[t.field_h];
        var2 = 0;
        L0: while (true) {
          if (var2 >= t.field_h) {
            no.f((byte) -114);
            return var1;
          } else {
            var3 = uf.field_n[var2] * bn.field_c[var2];
            var21 = vj.field_m[var2];
            if (jc.field_r[var2]) {
              var23 = ka.field_f[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L1: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (vn) (Object) new cd(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var24);
                  var2++;
                  continue L0;
                } else {
                  var6[var7] = hi.a(j.field_a[eg.a((int) var21[var7], 255)], eg.a((int) var23[var7], 255) << 24);
                  var7++;
                  continue L1;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L2: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new vn(gl.field_F, kd.field_pb, sl.field_d[var2], bo.field_o[var2], bn.field_c[var2], uf.field_n[var2], var22);
                  var2++;
                  continue L0;
                } else {
                  var9[var6_int] = j.field_a[eg.a((int) var21[var6_int], 255)];
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final ga f(int param0) {
        cj var2 = null;
        ei var3 = null;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          if (param0 <= -2) {
            break L0;
          } else {
            ga discarded$2 = ((dn) this).f(-10);
            break L0;
          }
        }
        var2 = new cj(((dn) this).field_H);
        var3 = (ei) (Object) var2.c((byte) -116);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_H) {
              return var3.d((byte) 35);
            } else {
              var3 = (ei) (Object) var2.a((byte) 61);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final void g(int param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 > -122) {
            field_J = null;
        }
        cj var2 = new cj(((dn) this).field_H);
        ei var3 = (ei) (Object) var2.c((byte) -116);
        while (var3 != null) {
            if (!(!var3.j(2634))) {
                var3.b(-27598);
            }
            var3 = (ei) (Object) var2.a((byte) 61);
        }
        ((dn) this).field_z = (ga) (Object) ((dn) this).c(true);
    }

    final void a(ga param0, boolean param1) {
        ei var3 = null;
        try {
            if (!(param0 instanceof ei)) {
                throw new IllegalArgumentException();
            }
            var3 = (ei) (Object) param0;
            ((dn) this).field_H.a((le) (Object) var3, -112);
            var3.field_H = param1 ? true : false;
            boolean discarded$0 = var3.a((byte) 107, (ga) this);
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "dn.H(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void j(int param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != -636330975) {
            ((dn) this).j(-51);
        }
        cj var2 = new cj(((dn) this).field_H);
        ei var3 = (ei) (Object) var2.c((byte) -123);
        while (var3 != null) {
            var3.field_H = false;
            var3 = (ei) (Object) var2.a((byte) 61);
        }
        ((dn) this).field_z = null;
    }

    final static boolean i(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == -19301) {
            break L0;
          } else {
            dn.h(28);
            break L0;
          }
        }
        L1: {
          L2: {
            if (fl.field_a < 10) {
              break L2;
            } else {
              if (i.field_Y) {
                break L2;
              } else {
                if (ng.a((byte) -64)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final void e(byte param0) {
        int var4 = ZombieDawn.field_J;
        if (param0 != -36) {
            return;
        }
        cj var2 = new cj(((dn) this).field_H);
        ei var3 = (ei) (Object) var2.c((byte) -125);
        while (var3 != null) {
            if (var3.e((byte) 28)) {
                var3.b(-27598);
            }
            var3 = (ei) (Object) var2.a((byte) 61);
        }
    }

    public dn() {
        super(0, 0, pk.field_N, b.field_l, (io) null, (sk) null);
        ((dn) this).field_H = new vo();
    }

    final static int a(int param0, boolean param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_2_0 = 0;
        var8 = ZombieDawn.field_J;
        try {
          L0: {
            if (!param1) {
              var3_int = 0;
              var4 = el.field_k;
              L1: while (true) {
                if (n.field_r.length <= var3_int) {
                  stackOut_14_0 = -1;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                } else {
                  L2: {
                    var5 = la.field_b[var3_int];
                    if (var5 >= 0) {
                      var6 = sm.a(32564, true, n.field_r[var3_int]);
                      var7 = im.field_d - (var6 >> 1);
                      var4 = var4 + qb.field_i;
                      if (bf.a(var7 + -nb.field_m, 0, param2, var4, var6 + (nb.field_m << 1), (lb.field_Y << 1) + ma.field_k, param0)) {
                        stackOut_10_0 = var5;
                        stackIn_11_0 = stackOut_10_0;
                        return stackIn_11_0;
                      } else {
                        var4 = var4 + ((lb.field_Y << 1) + qb.field_i + ma.field_k);
                        break L2;
                      }
                    } else {
                      var4 = var4 + mh.field_G;
                      break L2;
                    }
                  }
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 57;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var3, "dn.Q(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_15_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = ZombieDawn.field_J;
        if (!(((dn) this).field_h == null)) {
            ((dn) this).field_h.a(16777215, true, param0, (ga) this, param2);
        }
        if (param3 != 0) {
            return;
        }
        cj var5 = new cj(((dn) this).field_H);
        ga var6 = (ga) (Object) var5.b((byte) -21);
        while (var6 != null) {
            var6.a(((dn) this).field_j + param0, param1, ((dn) this).field_k + param2, param3);
            var6 = (ga) (Object) var5.a(17);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new wl();
        field_G = "Names cannot start or end with space or underscore";
        field_D = new vo();
        field_E = new vn(48, 48);
        field_J = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
