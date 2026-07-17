/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    static int field_i;
    static String field_h;
    private DataInputStream field_f;
    private th field_g;
    private af field_d;
    static int[][] field_k;
    static String field_n;
    private java.net.URL field_b;
    static float[] field_m;
    static String field_j;
    private int field_c;
    private af field_a;
    private af field_e;
    private ib field_l;

    final static void a(int[] param0, byte param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        boolean stackOut_4_0 = false;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              gf.a();
              gf.a(param0, 0, param0.length);
              gf.c();
              if (param1 < -53) {
                break L1;
              } else {
                var6 = null;
                dl.a(20, (da) null);
                break L1;
              }
            }
            stackOut_3_0 = gf.d();
            stackIn_5_0 = stackOut_3_0;
            L2: while (true) {
              if (!stackIn_5_0) {
                break L0;
              } else {
                tc.c(gf.field_g, gf.field_a, gf.field_b + -gf.field_g, param3, param2);
                stackOut_4_0 = gf.d();
                stackIn_5_0 = stackOut_4_0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("dl.C(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = HoldTheLine.field_D;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    if (((dl) this).field_g.field_l >= ((dl) this).field_g.field_i.length) {
                      break L2;
                    } else {
                      var1_int = ((dl) this).field_f.read(((dl) this).field_g.field_i, ((dl) this).field_g.field_l, -((dl) this).field_g.field_l + ((dl) this).field_g.field_i.length);
                      if (var1_int >= 0) {
                        ((dl) this).field_g.field_l = ((dl) this).field_g.field_l + var1_int;
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (((dl) this).field_g.field_l != ((dl) this).field_g.field_i.length) {
                    var1 = this;
                    synchronized (var1) {
                      L3: {
                        ((dl) this).finalize();
                        ((dl) this).field_c = 3;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    throw dl.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + ((dl) this).field_g.field_i.length + " " + ((dl) this).field_b));
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref = this;
                synchronized (var2_ref) {
                  L5: {
                    ((dl) this).finalize();
                    ((dl) this).field_c = ((dl) this).field_c + 1;
                    break L5;
                  }
                }
                break L4;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static hj a(gn param0, String param1, boolean param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        hj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        hj stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param0.c(param1, 3);
            var5 = param0.a(var4_int, param3, param2);
            stackOut_0_0 = ll.a(-1, var5, var4_int, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("dl.F(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (((dl) this).field_c >= 2) {
          return true;
        } else {
          L0: {
            if (((dl) this).field_c == 0) {
              L1: {
                if (((dl) this).field_a == null) {
                  ((dl) this).field_a = ((dl) this).field_l.a(((dl) this).field_b, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 == ((dl) this).field_a.field_d) {
                return false;
              } else {
                if (((dl) this).field_a.field_d == 1) {
                  break L0;
                } else {
                  ((dl) this).field_c = ((dl) this).field_c + 1;
                  ((dl) this).field_a = null;
                  return false;
                }
              }
            } else {
              break L0;
            }
          }
          if (param0 >= 57) {
            L2: {
              if (1 == ((dl) this).field_c) {
                L3: {
                  if (null != ((dl) this).field_d) {
                    break L3;
                  } else {
                    ((dl) this).field_d = ((dl) this).field_l.a(0, 443, ((dl) this).field_b.getHost());
                    break L3;
                  }
                }
                if (0 == ((dl) this).field_d.field_d) {
                  return false;
                } else {
                  if (((dl) this).field_d.field_d == 1) {
                    break L2;
                  } else {
                    ((dl) this).field_c = ((dl) this).field_c + 1;
                    ((dl) this).field_d = null;
                    return false;
                  }
                }
              } else {
                break L2;
              }
            }
            L4: {
              if (((dl) this).field_f == null) {
                try {
                  L5: {
                    L6: {
                      if (0 == ((dl) this).field_c) {
                        ((dl) this).field_f = (DataInputStream) ((dl) this).field_a.field_b;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      if (((dl) this).field_c == 1) {
                        var4 = (java.net.Socket) ((dl) this).field_d.field_b;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((dl) this).field_b.getFile() + "\n\n");
                        var3.write(sj.a((byte) -103, var5));
                        ((dl) this).field_f = new DataInputStream(var4.getInputStream());
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    ((dl) this).field_g.field_l = 0;
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L8: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    ((dl) this).finalize();
                    ((dl) this).field_c = ((dl) this).field_c + 1;
                    break L8;
                  }
                }
                break L4;
              } else {
                break L4;
              }
            }
            L9: {
              if (((dl) this).field_e != null) {
                break L9;
              } else {
                ((dl) this).field_e = ((dl) this).field_l.a((byte) -28, 5, (Runnable) this);
                break L9;
              }
            }
            if (((dl) this).field_e.field_d == 0) {
              return false;
            } else {
              if (1 == ((dl) this).field_e.field_d) {
                return false;
              } else {
                ((dl) this).finalize();
                ((dl) this).field_c = ((dl) this).field_c + 1;
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_h = null;
        int var1 = 0;
        field_m = null;
        field_k = null;
        field_j = null;
    }

    final static void a(int param0, da param1) {
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
            ki var13 = null;
            java.lang.reflect.Field var15 = null;
            ki var16 = null;
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
            RuntimeException stackIn_60_0 = null;
            StringBuilder stackIn_60_1 = null;
            RuntimeException stackIn_61_0 = null;
            StringBuilder stackIn_61_1 = null;
            RuntimeException stackIn_62_0 = null;
            StringBuilder stackIn_62_1 = null;
            String stackIn_62_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_59_0 = null;
            StringBuilder stackOut_59_1 = null;
            RuntimeException stackOut_61_0 = null;
            StringBuilder stackOut_61_1 = null;
            String stackOut_61_2 = null;
            RuntimeException stackOut_60_0 = null;
            StringBuilder stackOut_60_1 = null;
            String stackOut_60_2 = null;
            var18 = null;
            var19 = null;
            var20 = null;
            var22 = null;
            var12 = HoldTheLine.field_D;
            try {
              L0: {
                var13 = (ki) (Object) sl.field_b.b((byte) 96);
                var16 = var13;
                if (var16 == null) {
                  return;
                } else {
                  var3 = 0;
                  var4 = 0;
                  L1: while (true) {
                    if (var16.field_p <= var4) {
                      if (var3 != 0) {
                        return;
                      } else {
                        var4 = param1.field_l;
                        param1.a((byte) -58, var16.field_n);
                        var5 = param0;
                        L2: while (true) {
                          if (var5 >= var16.field_p) {
                            int discarded$1 = param1.a(var4, (byte) 47);
                            var16.d(param0);
                            break L0;
                          } else {
                            L3: {
                              if (0 == var16.field_r[var5]) {
                                try {
                                  L4: {
                                    L5: {
                                      var6_int = var16.field_m[var5];
                                      if (var6_int == 0) {
                                        var27 = (java.lang.reflect.Field) var16.field_k[var5].field_b;
                                        var8 = var27.getInt((Object) null);
                                        param1.f(111, 0);
                                        param1.a((byte) -58, var8);
                                        break L5;
                                      } else {
                                        if (var6_int != 1) {
                                          if (var6_int != 2) {
                                            break L5;
                                          } else {
                                            var26 = (java.lang.reflect.Field) var16.field_k[var5].field_b;
                                            var8 = var26.getModifiers();
                                            param1.f(111, 0);
                                            param1.a((byte) -58, var8);
                                            break L5;
                                          }
                                        } else {
                                          var15 = (java.lang.reflect.Field) var16.field_k[var5].field_b;
                                          var17 = var15;
                                          var17.setInt((Object) null, var16.field_j[var5]);
                                          param1.f(111, 0);
                                          break L5;
                                        }
                                      }
                                    }
                                    L6: {
                                      if (var6_int == 3) {
                                        var29 = (java.lang.reflect.Method) var16.field_l[var5].field_b;
                                        var25 = var16.field_q[var5];
                                        var9 = new Object[var25.length];
                                        var10_int = 0;
                                        L7: while (true) {
                                          if (var25.length <= var10_int) {
                                            var10 = var29.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              param1.f(111, 0);
                                              break L6;
                                            } else {
                                              if (!(var10 instanceof Number)) {
                                                if (var10 instanceof String) {
                                                  param1.f(111, 2);
                                                  param1.c(param0 ^ 82, (String) var10);
                                                  break L6;
                                                } else {
                                                  param1.f(111, 4);
                                                  break L6;
                                                }
                                              } else {
                                                param1.f(param0 ^ 111, 1);
                                                param1.a((byte) -84, ((Number) var10).longValue());
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
                                        if (4 == var6_int) {
                                          var28 = (java.lang.reflect.Method) var16.field_l[var5].field_b;
                                          var8 = var28.getModifiers();
                                          param1.f(111, 0);
                                          param1.a((byte) -58, var8);
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
                                    param1.f(param0 + 111, -14);
                                    break L12;
                                  }
                                } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                  decompiledCaughtException = decompiledCaughtParameter5;
                                  L13: {
                                    var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                    param1.f(111, -15);
                                    break L13;
                                  }
                                } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                  decompiledCaughtException = decompiledCaughtParameter6;
                                  L14: {
                                    var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                    param1.f(111, -16);
                                    break L14;
                                  }
                                } catch (java.io.IOException decompiledCaughtParameter8) {
                                  decompiledCaughtException = decompiledCaughtParameter8;
                                  L16: {
                                    var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                    param1.f(111, -18);
                                    break L16;
                                  }
                                } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                  decompiledCaughtException = decompiledCaughtParameter9;
                                  L17: {
                                    var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                    param1.f(111, -19);
                                    break L17;
                                  }
                                } catch (java.lang.Exception decompiledCaughtParameter10) {
                                  decompiledCaughtException = decompiledCaughtParameter10;
                                  L18: {
                                    var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                    param1.f(param0 ^ 111, -20);
                                    break L18;
                                  }
                                } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                  decompiledCaughtException = decompiledCaughtParameter11;
                                  L19: {
                                    var6_ref11 = decompiledCaughtException;
                                    param1.f(111, -21);
                                    break L19;
                                  }
                                }
                                break L3;
                              } else {
                                param1.f(111, var16.field_r[var5]);
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
                        if (null != var13.field_k[var4]) {
                          L21: {
                            if (-3 != var13.field_k[var4].field_d) {
                              break L21;
                            } else {
                              var13.field_r[var4] = -5;
                              break L21;
                            }
                          }
                          if (-1 == var13.field_k[var4].field_d) {
                            var3 = 1;
                            break L20;
                          } else {
                            break L20;
                          }
                        } else {
                          break L20;
                        }
                      }
                      L22: {
                        if (null == var13.field_l[var4]) {
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
                stackOut_59_0 = (RuntimeException) var2;
                stackOut_59_1 = new StringBuilder().append("dl.A(").append(param0).append(44);
                stackIn_61_0 = stackOut_59_0;
                stackIn_61_1 = stackOut_59_1;
                stackIn_60_0 = stackOut_59_0;
                stackIn_60_1 = stackOut_59_1;
                if (param1 == null) {
                  stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
                  stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
                  stackOut_61_2 = "null";
                  stackIn_62_0 = stackOut_61_0;
                  stackIn_62_1 = stackOut_61_1;
                  stackIn_62_2 = stackOut_61_2;
                  break L23;
                } else {
                  stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
                  stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
                  stackOut_60_2 = "{...}";
                  stackIn_62_0 = stackOut_60_0;
                  stackIn_62_1 = stackOut_60_1;
                  stackIn_62_2 = stackOut_60_2;
                  break L23;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        if (!(null == ((dl) this).field_a)) {
            if (!(null == ((dl) this).field_a.field_b)) {
                try {
                    ((DataInputStream) ((dl) this).field_a.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((dl) this).field_a = null;
        }
        if (!(null == ((dl) this).field_d)) {
            if (!(null == ((dl) this).field_d.field_b)) {
                try {
                    ((java.net.Socket) ((dl) this).field_d.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((dl) this).field_d = null;
        }
        if (((dl) this).field_f != null) {
            try {
                ((dl) this).field_f.close();
            } catch (Exception exception) {
            }
            ((dl) this).field_f = null;
        }
        ((dl) this).field_e = null;
    }

    final th b(byte param0) {
        if (param0 < 65) {
            th discarded$0 = ((dl) this).b((byte) -33);
        }
        if (!(((dl) this).field_c != 3)) {
            return ((dl) this).field_g;
        }
        return null;
    }

    dl(ib param0, java.net.URL param1, int param2) {
        try {
            ((dl) this).field_l = param0;
            ((dl) this).field_b = param1;
            ((dl) this).field_g = new th(param2);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "dl.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_n = "Quit to website";
        field_k = new int[14][];
        field_k[1] = new int[6];
        field_k[13] = new int[2];
        field_k[6] = new int[1];
        field_k[3] = new int[1];
        field_k[9] = new int[1];
        field_k[7] = new int[1];
        field_k[8] = new int[1];
        field_k[0] = new int[8];
        field_k[12] = new int[0];
        field_k[5] = new int[1];
        field_k[10] = new int[1];
        field_k[4] = new int[2];
        field_k[2] = new int[1];
        field_k[11] = new int[0];
        field_m = new float[]{1.0f, 2.0f, 2.0f, 2.0f};
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
