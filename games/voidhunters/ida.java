/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ida extends mc {
    static kba field_x;
    static gj field_w;
    private ij field_v;

    final void a(boolean param0, shb param1) {
        if (!(param1 instanceof bl)) {
            throw new IllegalArgumentException();
        }
        bl var3 = (bl) (Object) param1;
        ((ida) this).field_v.a((ksa) (Object) var3, (byte) -55);
        var3.field_z = true;
        if (param0) {
            return;
        }
        try {
            boolean discarded$0 = var3.a(0, (shb) this);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "ida.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int f(int param0) {
        wc var2 = null;
        int var3 = 0;
        bl var4 = null;
        int var5 = 0;
        var5 = VoidHunters.field_G;
        var2 = new wc(((ida) this).field_v);
        var3 = param0;
        var4 = (bl) (Object) var2.c(570);
        L0: while (true) {
          if (var4 == null) {
            return var3;
          } else {
            L1: {
              if (!var4.field_z) {
                break L1;
              } else {
                if (var3 < var4.field_f) {
                  var3 = var4.field_f;
                  break L1;
                } else {
                  var4 = (bl) (Object) var2.a(19072);
                  continue L0;
                }
              }
            }
            var4 = (bl) (Object) var2.a(19072);
            continue L0;
          }
        }
    }

    final void g(byte param0) {
        int var4 = VoidHunters.field_G;
        wc var2 = new wc(((ida) this).field_v);
        bl var3 = (bl) (Object) var2.c(570);
        while (var3 != null) {
            var3.field_z = false;
            var3 = (bl) (Object) var2.a(19072);
        }
        ((ida) this).field_t = null;
        if (param0 != -17) {
            field_w = null;
        }
    }

    final bl g(int param0) {
        wc var2 = null;
        bl var3 = null;
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          var2 = new wc(((ida) this).field_v);
          if (param0 == 0) {
            break L0;
          } else {
            ((ida) this).g((byte) 100);
            break L0;
          }
        }
        var3 = (bl) (Object) var2.c(param0 ^ 570);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_z) {
              return var3;
            } else {
              var3 = (bl) (Object) var2.a(19072);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final static void a(boolean param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              hoa.a(param1, 0, param0);
              if (lob.field_a != null) {
                ukb.a(lob.field_a, (byte) 92);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ida.R(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + -73 + ')');
        }
    }

    final shb d(int param0) {
        int var4 = VoidHunters.field_G;
        wc var2 = new wc(((ida) this).field_v);
        bl var3 = (bl) (Object) var2.c(570);
        while (var3 != null) {
            if (var3.field_z) {
                return var3.g((byte) -74);
            }
            var3 = (bl) (Object) var2.a(19072);
        }
        if (param0 == 6093) {
            return null;
        }
        field_x = null;
        return null;
    }

    final void e(int param0) {
        int var5 = VoidHunters.field_G;
        wc var2 = new wc(((ida) this).field_v);
        int var3 = 74 % ((53 - param0) / 55);
        bl var4 = (bl) (Object) var2.c(570);
        while (var4 != null) {
            if (!(!var4.j((byte) 55))) {
                var4.b(-3846);
            }
            var4 = (bl) (Object) var2.a(19072);
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        int var7 = VoidHunters.field_G;
        if (!(((ida) this).field_q == null)) {
            ((ida) this).field_q.a(-93, (shb) this, param0, param3, true);
        }
        if (param2 < 47) {
            shb discarded$0 = ((ida) this).d(51);
        }
        wc var5 = new wc(((ida) this).field_v);
        shb var6 = (shb) (Object) var5.b((byte) 83);
        while (var6 != null) {
            var6.b(param0 + ((ida) this).field_g, param1, 111, ((ida) this).field_r + param3);
            var6 = (shb) (Object) var5.a((byte) 108);
        }
    }

    public static void h(byte param0) {
        field_x = null;
        int var1 = 0;
        field_w = null;
    }

    final int i(int param0) {
        int var5 = VoidHunters.field_G;
        wc var2 = new wc(((ida) this).field_v);
        int var3 = -2147483648;
        if (param0 > -90) {
            return 20;
        }
        bl var4 = (bl) (Object) var2.c(570);
        while (var4 != null) {
            if (var4.field_z) {
                if (var3 < var4.field_h) {
                    var3 = var4.field_h;
                }
            }
            var4 = (bl) (Object) var2.a(19072);
        }
        return var3;
    }

    public ida() {
        super(0, 0, fob.field_a, vi.field_p, (wwa) null, (sba) null);
        ((ida) this).field_v = new ij();
    }

    final static void a(faa param0, byte param1) {
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
            mv var13 = null;
            java.lang.reflect.Field var15 = null;
            mv var16 = null;
            java.lang.reflect.Field var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Method var28 = null;
            java.lang.reflect.Method var29 = null;
            RuntimeException stackIn_61_0 = null;
            StringBuilder stackIn_61_1 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            RuntimeException stackIn_63_0 = null;
            StringBuilder stackIn_63_1 = null;
            String stackIn_63_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_60_0 = null;
            StringBuilder stackOut_60_1 = null;
            RuntimeException stackOut_62_0 = null;
            StringBuilder stackOut_62_1 = null;
            String stackOut_62_2 = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            String stackOut_61_2 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var22 = null;
            var12 = VoidHunters.field_G;
            try {
              L0: {
                var13 = (mv) (Object) tma.field_r.d(0);
                var16 = var13;
                if (var16 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var4 >= var16.field_i) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param0.field_e;
                        param0.d(var16.field_d, 332614536);
                        var5 = 0;
                        L2: while (true) {
                          if (var5 >= var16.field_i) {
                            int discarded$1 = param0.g(1595, var4);
                            var16.b(-3846);
                            break L0;
                          } else {
                            L3: {
                              if (var16.field_k[var5] == 0) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var16.field_h[var5];
                                      if (var6_int == 0) {
                                        var27 = (java.lang.reflect.Field) var16.field_g[var5].field_d;
                                        var8 = var27.getInt((Object) null);
                                        param0.c(0, 0);
                                        param0.d(var8, 332614536);
                                        break L5;
                                      } else {
                                        if (var6_int != 1) {
                                          if (var6_int == 2) {
                                            var26 = (java.lang.reflect.Field) var16.field_g[var5].field_d;
                                            var8 = var26.getModifiers();
                                            param0.c(0, 0);
                                            param0.d(var8, 332614536);
                                            break L5;
                                          } else {
                                            break L5;
                                          }
                                        } else {
                                          var15 = (java.lang.reflect.Field) var16.field_g[var5].field_d;
                                          var17 = var15;
                                          var17.setInt((Object) null, var16.field_j[var5]);
                                          param0.c(0, 0);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int == 3) {
                                        var29 = (java.lang.reflect.Method) var16.field_e[var5].field_d;
                                        var25 = var16.field_f[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var10_int >= var25.length) {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param0.c(0, 0);
                                              break L6;
                                            } else {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param0.c(0, 2);
                                                  param0.a(true, (String) var10);
                                                  break L6;
                                                } else {
                                                  param0.c(0, 4);
                                                  break L6;
                                                }
                                              } else {
                                                param0.c(0, 1);
                                                param0.a(((Number) var10).longValue(), 111);
                                                break L6;
                                              }
                                            }
                                          } else {
                                            var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                            var9[var10_int] = var11.readObject();
                                            var10_int++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        if (var6_int != 4) {
                                          break L6;
                                        } else {
                                          var28 = (java.lang.reflect.Method) var16.field_e[var5].field_d;
                                          var8 = var28.getModifiers();
                                          param0.c(0, 0);
                                          param0.d(var8, 332614536);
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
                                    param0.c(0, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param0.c(0, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param0.c(0, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param0.c(0, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param0.c(0, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param0.c(0, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param0.c(0, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param0.c(0, var16.field_k[var5]);
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
                        if (var13.field_g[var4] != null) {
                          L21: {
                            if (var13.field_g[var4].field_f == 2) {
                              var13.field_k[var4] = -5;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          if (0 != var13.field_g[var4].field_f) {
                            break L20;
                          } else {
                            var3 = 1;
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (null == var13.field_e[var4]) {
                          break L22;
                        } else {
                          break L22;
                        }
                      }
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L23: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_60_0 = (RuntimeException) var2;
                stackOut_60_1 = new StringBuilder().append("ida.O(");
                stackIn_62_0 = stackOut_60_0;
                stackIn_62_1 = stackOut_60_1;
                stackIn_61_0 = stackOut_60_0;
                stackIn_61_1 = stackOut_60_1;
                if (param0 == null) {
                  stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
                  stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
                  stackOut_62_2 = "null";
                  stackIn_63_0 = stackOut_62_0;
                  stackIn_63_1 = stackOut_62_1;
                  stackIn_63_2 = stackOut_62_2;
                  break L23;
                } else {
                  stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
                  stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
                  stackOut_61_2 = "{...}";
                  stackIn_63_0 = stackOut_61_0;
                  stackIn_63_1 = stackOut_61_1;
                  stackIn_63_2 = stackOut_61_2;
                  break L23;
                }
              }
              throw rta.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + ',' + 127 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void h(int param0) {
        int var4 = VoidHunters.field_G;
        if (param0 != 19976) {
            return;
        }
        wc var2 = new wc(((ida) this).field_v);
        bl var3 = (bl) (Object) var2.c(570);
        while (var3 != null) {
            if (var3.a(248)) {
                var3.b(-3846);
            }
            var3 = (bl) (Object) var2.a(param0 ^ 1160);
        }
        ((ida) this).field_t = (shb) (Object) ((ida) this).g(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new kba();
        field_w = new gj();
    }
}
