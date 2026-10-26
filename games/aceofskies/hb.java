/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hb {
    static int field_b;
    static cc field_a;

    final static void a(CipherPacketBuffer param0, int param1) {
        try {
          Object stackIn_35_0 = null;
          int stackIn_101_0 = 0;
          String stackIn_107_2 = null;
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Field var7 = null;
          java.lang.reflect.Method var7_ref = null;
          int var8_int = 0;
          boolean var12 = (AceOfSkies.obfuscationControl);
          try {
            bb var2 = (bb) (av.field_c.first(param1 + 268410723));
            if (var2 == null) {
              return;
            }
            boolean var3 = false;
            int var4 = 0;
            scanLoop1: while (true) {
              if (var4 < var2.field_g) {
                stackIn_35_0 = null;
                if (!var12) {
                  if (stackIn_35_0 != var2.field_f[var4]) {
                    if (var2.field_f[var4].field_a == 2) {
                      var2.field_e[var4] = -5;
                    }
                    if (var2.field_f[var4].field_a == 0) {
                      var3 = true;
                    }
                  }
                  if (null != var2.field_h[var4]) {
                    if (var2.field_h[var4].field_a == 2) {
                      var2.field_e[var4] = -6;
                    }
                    if (var2.field_h[var4].field_a == 0) {
                      var3 = true;
                    }
                  }
                  var4++;
                  continue;
                }
              } else {
                if (var3) {
                  return;
                }
                var4 = param0.position;
                if (param1 == 24732) {
                  break scanLoop1;
                }
                stackIn_35_0 = null;
              }
              field_a = (cc) (stackIn_35_0);
              break;
            }
            param0.writeInt((byte) 87, var2.field_j);
            int var5 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (!(var5 < var2.field_g)))) {
              stackIn_101_0 = 0;
              if (!var12) {
                if (stackIn_101_0 != var2.field_e[var5]) {
                  param0.writeByte(param1 ^ -1336888268, var2.field_e[var5]);
                } else {
                  try {
                    int var6_int = var2.field_l[var5];
                    switch (var6_int) {
                      case 0:
                        var7 = (java.lang.reflect.Field) (var2.field_f[var5].field_f);
                        var8_int = var7.getInt((Object) null);
                        param0.writeByte(-1336879960, 0);
                        param0.writeInt((byte) 90, var8_int);
                        break;
                      case 1:
                        var7 = (java.lang.reflect.Field) (var2.field_f[var5].field_f);
                        var7.setInt((Object) null, var2.field_i[var5]);
                        param0.writeByte(-1336879960, 0);
                        break;
                      case 2:
                        var7 = (java.lang.reflect.Field) (var2.field_f[var5].field_f);
                        var8_int = var7.getModifiers();
                        param0.writeByte(-1336879960, 0);
                        param0.writeInt((byte) 28, var8_int);
                        break;
                      default:
                        break;
                    }
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    if (3 != var6_int &&
                      (decompiledFrameRemainder0 = (var6_int == 4))) {
                      var7_ref = (java.lang.reflect.Method) (var2.field_h[var5].field_f);
                      var8_int = var7_ref.getModifiers();
                      param0.writeByte(param1 - 1336904692, 0);
                      param0.writeInt((byte) 65, var8_int);
                    }
                    if (decompiledFrameRemainder0 &&
                      (3 == var6_int ||
                      var12)) {
                      var7_ref = (java.lang.reflect.Method) (var2.field_h[var5].field_f);
                      byte[][] var8 = var2.field_k[var5];
                      Object[] var9 = new Object[var8.length];
                      int var10_int = 0;
                      while (var10_int < var8.length) {
                        ObjectInputStream var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var8[var10_int])));
                        var9[var10_int] = var11.readObject();
                        var10_int++;
                        if (var12) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        if (!var12) {
                          continue;
                        }
                        break;
                      }
                      if (decompiledFrameCompleted0) {
                        Object var10 = var7_ref.invoke((Object) null, var9);
                        if (var10 == null) {
                          param0.writeByte(-1336879960, 0);
                          decompiledFrameRemainder0 = ((var12));
                        }
                        if (decompiledFrameRemainder0) {
                          if (!(var10 instanceof Number)) {
                            boolean decompiledSharedTail0 = !(!(var10 instanceof String));
                            if (!decompiledSharedTail0) {
                              param0.writeByte(-1336879960, 4);
                              decompiledSharedTail0 = ((var12));
                            }
                            if (decompiledSharedTail0) {
                              param0.writeByte(-1336879960, 2);
                              param0.a(-47, (String) (var10));
                              if (var12) {
                                param0.writeByte(-1336879960, 1);
                                param0.writeLong((byte) -102, ((Number) (var10)).longValue());
                              }
                            }
                          } else {
                            param0.writeByte(-1336879960, 1);
                            param0.writeLong((byte) -102, ((Number) (var10)).longValue());
                          }
                        }
                      }
                    }
                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    ClassNotFoundException var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -10);
                  } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    InvalidClassException var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -11);
                  } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                    decompiledCaughtException = decompiledCaughtParameter2;
                    StreamCorruptedException var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -12);
                  } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    OptionalDataException var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                    param0.writeByte(param1 - 1336904692, -13);
                  } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                    decompiledCaughtException = decompiledCaughtParameter4;
                    IllegalAccessException var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -14);
                  } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                    decompiledCaughtException = decompiledCaughtParameter5;
                    IllegalArgumentException var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -15);
                  } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                    decompiledCaughtException = decompiledCaughtParameter6;
                    java.lang.reflect.InvocationTargetException var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -16);
                  } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                    decompiledCaughtException = decompiledCaughtParameter7;
                    SecurityException var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -17);
                  } catch (java.io.IOException decompiledCaughtParameter8) {
                    decompiledCaughtException = decompiledCaughtParameter8;
                    IOException var6_ref8 = (IOException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -18);
                  } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                    decompiledCaughtException = decompiledCaughtParameter9;
                    NullPointerException var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -19);
                  } catch (java.lang.Exception decompiledCaughtParameter10) {
                    decompiledCaughtException = decompiledCaughtParameter10;
                    Exception var6_ref10 = (Exception) (Object) decompiledCaughtException;
                    param0.writeByte(-1336879960, -20);
                  } catch (java.lang.Throwable decompiledCaughtParameter11) {
                    decompiledCaughtException = decompiledCaughtParameter11;
                    Throwable var6_ref11 = decompiledCaughtException;
                    param0.writeByte(-1336879960, -21);
                  }
                }
                var5++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_101_0 = param0.appendCrc32(var4, 56);
            }
            var2.unlink(-125);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
            decompiledCaughtException = decompiledCaughtParameter12;
            RuntimeException var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_106_0 = var2_ref;
            StringBuilder stackIn_106_1 = new StringBuilder().append("hb.C(");
            if (param0 == null) {
              stackIn_107_2 = "null";
            } else {
              stackIn_107_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, GraphicsRenderer param7, byte param8, RenderSprite[] param9) {
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        String stackIn_122_2 = null;
        String stackIn_126_2 = null;
        boolean var28 = (AceOfSkies.obfuscationControl);
        try {
          bo var10 = fa.a(param7, true);
          if (param9 == null) {
            return;
          }
          if (0 < param5 &&
            param6 > 0) {
            if (null == param9[3]) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param9[3].d();
            }
            int var11 = stackIn_16_0;
            if (param9[5] == null) {
              stackIn_20_0 = 0;
            } else {
              stackIn_20_0 = param9[5].d();
            }
            int var12 = stackIn_20_0;
            if (null == param9[1]) {
              stackIn_24_0 = 0;
            } else {
              stackIn_24_0 = param9[1].c();
            }
            int var13 = stackIn_24_0;
            if (param9[7] != null) {
              stackIn_28_0 = param9[7].c();
            } else {
              stackIn_28_0 = 0;
            }
            int var14 = stackIn_28_0;
            int var15 = param2 + param5;
            int var16 = param0 + param6;
            int var17 = var11 + param2;
            int var18 = var15 - var12;
            int var19 = var13 + param0;
            int var21 = 49 / ((7 - param8) / 47);
            int var20 = var16 - var14;
            int var22 = var17;
            int var23 = var18;
            if (var23 < var22) {
              var23 = param5 * var11 / (var12 + var11) + param2;
              var22 = param5 * var11 / (var12 + var11) + param2;
            }
            int var24 = var19;
            int var25 = var20;
            if (var24 > var25) {
              var25 = var13 * param6 / (var14 + var13) + param0;
              var24 = var13 * param6 / (var14 + var13) + param0;
            }
            if (null != param9[0]) {
              var10.a(var22, param2, var24, param0, 77);
              param9[0].a(param2, param0, param3, param1, param4);
              var10.a(true);
            }
            if (null != param9[2]) {
              var10.a(var15, var23, var24, param0, 84);
              param9[2].a(var18, param0, param3, param1, param4);
              var10.a(true);
            }
            if (param9[6] != null) {
              var10.a(var22, param2, var16, var25, -99);
              param9[6].a(param2, var20, param3, param1, param4);
              var10.a(true);
            }
            if (null != param9[8]) {
              var10.a(var15, var23, var16, var25, 118);
              param9[8].a(var18, var20, param3, param1, param4);
              var10.a(true);
            }
            boolean decompiledFrameCompleted3 = true;
            if (null != param9[1] &&
              param9[1].d() != 0) {
              var10.a(var23, var22, var24, param0, 76);
              int var26 = var17;
              while (var18 > var26) {
                param9[1].a(var26, param0, param3, param1, param4);
                var26 = var26 + param9[1].d();
                if (var28) {
                  decompiledFrameCompleted3 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted3) {
                var10.a(true);
              }
            }
            boolean decompiledFrameCompleted2 = true;
            if (null != param9[7] &&
              param9[7].d() != 0) {
              var10.a(var23, var22, var16, var25, 121);
              int var26Lifetime1 = var17;
              while (var18 > var26Lifetime1) {
                param9[7].a(var26Lifetime1, var20, param3, param1, param4);
                var26Lifetime1 = var26Lifetime1 + param9[7].d();
                if (var28) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted2) {
                var10.a(true);
              }
            }
            boolean decompiledFrameCompleted1 = true;
            if (param9[3] != null &&
              0 != param9[3].c()) {
              var10.a(var22, param2, var25, var24, -112);
              int var26Lifetime2 = var19;
              while (var26Lifetime2 < var20) {
                param9[3].a(param2, var26Lifetime2, param3, param1, param4);
                var26Lifetime2 = var26Lifetime2 + param9[3].c();
                if (var28) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                var10.a(true);
              }
            }
            boolean decompiledFrameCompleted0 = true;
            if (null != param9[5] &&
              param9[5].c() != 0) {
              var10.a(var15, var23, var25, var24, 100);
              int var26Lifetime3 = var19;
              while (var20 > var26Lifetime3) {
                param9[5].a(var18, var26Lifetime3, param3, param1, param4);
                var26Lifetime3 = var26Lifetime3 + param9[5].c();
                if (var28) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                var10.a(true);
              }
            }
            if (param9[4] != null &&
              0 != param9[4].d() &&
              param9[4].c() != 0) {
              var10.a(var23, var22, var25, var24, 93);
              int var26Lifetime4 = var19;
              while (var26Lifetime4 < var20) {
                if (var28) {
                  return;
                }
                int var27 = var17;
                while (var27 < var18) {
                  param9[4].a(var27, var26Lifetime4, param3, param1, param4);
                  var27 = var27 + param9[4].d();
                }
                var26Lifetime4 = var26Lifetime4 + param9[4].c();
              }
              var10.a(true);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10_ref = decompiledCaughtException;
          RuntimeException stackIn_121_0 = var10_ref;
          StringBuilder stackIn_121_1 = new StringBuilder().append("hb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_122_2 = "null";
          } else {
            stackIn_122_2 = "{...}";
          }
          StringBuilder stackIn_125_1 = ((StringBuilder) (Object) stackIn_121_1).append(stackIn_122_2).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_126_2 = "null";
          } else {
            stackIn_126_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_121_0), ((StringBuilder) (Object) stackIn_125_1).append(stackIn_126_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 != -12029) {
          return;
        }
        try {
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "hb.B(" + param0 + ')');
        }
    }

    static {
    }
}
