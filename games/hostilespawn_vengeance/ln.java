/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ln {
    private int field_k;
    private String field_r;
    static bl field_l;
    private long field_d;
    int field_e;
    String field_s;
    int field_i;
    static id field_a;
    static bd field_g;
    static bd field_j;
    static String field_h;
    static bd field_c;
    static String field_p;
    int[] field_o;
    int field_f;
    static int field_q;
    static bd[] field_m;
    static boolean[] field_b;
    private boolean field_n;

    final static void a(ca param0, byte param1, int param2, boolean param3, boolean param4) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        he.field_s[0] = jk.field_b.nextInt();
        he.field_s[1] = jk.field_b.nextInt();
        he.field_s[3] = (int)d.field_y;
        he.field_s[2] = (int)(d.field_y >> 1641249376);
        ob.field_s.field_i = 0;
        ob.field_s.b(he.field_s[0], param1 ^ -25324);
        ob.field_s.b(he.field_s[1], param1 ^ -25324);
        if (param1 == -73) {
          L0: {
            ob.field_s.b(he.field_s[2], 25251);
            ob.field_s.b(he.field_s[3], 25251);
            f.a(24, ob.field_s);
            ob.field_s.a((byte) -128, param2);
            param0.a(ob.field_s, -99);
            s.field_b.field_i = 0;
            if (!param3) {
              s.field_b.d(param1 ^ -41, 16);
              break L0;
            } else {
              s.field_b.d(120, 18);
              break L0;
            }
          }
          L1: {
            s.field_b.field_i = s.field_b.field_i + 2;
            var5 = s.field_b.field_i;
            s.field_b.b(le.field_bb, 25251);
            s.field_b.b(9201, vi.field_l);
            var6 = 0;
            if (!wc.field_g) {
              break L1;
            } else {
              var6 = var6 | 1;
              break L1;
            }
          }
          L2: {
            if (sd.field_u) {
              var6 = var6 | 4;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (!param4) {
              break L3;
            } else {
              var6 = var6 | 8;
              break L3;
            }
          }
          L4: {
            if (fl.field_b == null) {
              break L4;
            } else {
              var6 = var6 | 16;
              break L4;
            }
          }
          L5: {
            s.field_b.d(param1 + 185, var6);
            var7 = de.a(-110, bn.c(-1));
            if (var7 != null) {
              break L5;
            } else {
              var7 = "";
              break L5;
            }
          }
          L6: {
            s.field_b.a(var7, param1 ^ -73);
            if (fl.field_b == null) {
              break L6;
            } else {
              s.field_b.a(122, fl.field_b);
              break L6;
            }
          }
          ml.a((vi) (Object) s.field_b, nb.field_L, 0, lm.field_z, ob.field_s);
          s.field_b.a(true, -var5 + s.field_b.field_i);
          mb.d(-1, -22370);
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_l = null;
        field_a = null;
        if (param0 != 31311) {
            field_g = null;
        }
        field_h = null;
        field_c = null;
        field_g = null;
        field_m = null;
        field_p = null;
        field_j = null;
    }

    final static void a(en param0, byte param1) {
        try {
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
            ng var13 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            ng var17 = null;
            Object var18 = null;
            Object var19 = null;
            java.lang.reflect.Field var20 = null;
            Object var22 = null;
            Object var23 = null;
            byte[][] var26 = null;
            java.lang.reflect.Field var27 = null;
            java.lang.reflect.Field var28 = null;
            java.lang.reflect.Method var29 = null;
            java.lang.reflect.Method var30 = null;
            Throwable decompiledCaughtException = null;
            var18 = null;
            var19 = null;
            var16 = null;
            var22 = null;
            var23 = null;
            var12 = HostileSpawn.field_I ? 1 : 0;
            var13 = (ng) (Object) td.field_o.g(-97);
            var17 = var13;
            if (var17 != null) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var17.field_t <= var4) {
                  if (var3 != 0) {
                    return;
                  } else {
                    L1: {
                      if (param1 <= -43) {
                        break L1;
                      } else {
                        field_p = null;
                        break L1;
                      }
                    }
                    var4 = param0.field_i;
                    param0.b(var17.field_h, 25251);
                    var5 = 0;
                    L2: while (true) {
                      if (var17.field_t <= var5) {
                        var5++;
                      } else {
                        L3: {
                          if (var17.field_m[var5] == 0) {
                            try {
                              L4: {
                                var6_int = var17.field_q[var5];
                                if (var6_int != 0) {
                                  if (-2 == (var6_int ^ -1)) {
                                    var16_ref = (java.lang.reflect.Field) var17.field_r[var5].field_c;
                                    var20 = var16_ref;
                                    var20.setInt((Object) null, var17.field_n[var5]);
                                    param0.d(87, 0);
                                    break L4;
                                  } else {
                                    if ((var6_int ^ -1) == -3) {
                                      var28 = (java.lang.reflect.Field) var17.field_r[var5].field_c;
                                      var8 = var28.getModifiers();
                                      param0.d(118, 0);
                                      param0.b(var8, 25251);
                                      break L4;
                                    } else {
                                      break L4;
                                    }
                                  }
                                } else {
                                  var27 = (java.lang.reflect.Field) var17.field_r[var5].field_c;
                                  var8 = var27.getInt((Object) null);
                                  param0.d(116, 0);
                                  param0.b(var8, 25251);
                                  break L4;
                                }
                              }
                              L5: {
                                if (-4 != (var6_int ^ -1)) {
                                  if (4 != var6_int) {
                                    break L5;
                                  } else {
                                    var30 = (java.lang.reflect.Method) var17.field_j[var5].field_c;
                                    var8 = var30.getModifiers();
                                    param0.d(84, 0);
                                    param0.b(var8, 25251);
                                    break L5;
                                  }
                                } else {
                                  var29 = (java.lang.reflect.Method) var17.field_j[var5].field_c;
                                  var26 = var17.field_o[var5];
                                  var9 = new Object[var26.length];
                                  var10_int = 0;
                                  L6: while (true) {
                                    if (var10_int >= var26.length) {
                                      var10 = var29.invoke((Object) null, var9);
                                      if (var10 != null) {
                                        if (var10 instanceof Number) {
                                          param0.d(81, 1);
                                          param0.b(9201, ((Number) var10).longValue());
                                          break L5;
                                        } else {
                                          if (!(var10 instanceof String)) {
                                            param0.d(84, 4);
                                            break L5;
                                          } else {
                                            param0.d(125, 2);
                                            param0.a((String) var10, 0);
                                            break L5;
                                          }
                                        }
                                      } else {
                                        param0.d(120, 0);
                                        break L5;
                                      }
                                    } else {
                                      var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var26[var10_int]));
                                      var9[var10_int] = var11.readObject();
                                      var10_int++;
                                      continue L6;
                                    }
                                  }
                                }
                              }
                            } catch (java.lang.IllegalArgumentException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                              param0.d(126, -14);
                            } catch (java.io.IOException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                              param0.d(121, -17);
                            } catch (java.lang.NullPointerException decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref8 = (IOException) (Object) decompiledCaughtException;
                              param0.d(102, -18);
                            } catch (java.lang.Exception decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                              param0.d(81, -19);
                            } catch (java.lang.Throwable decompiledCaughtParameter) {
                              decompiledCaughtException = decompiledCaughtParameter;
                              var6_ref10 = (Exception) (Object) decompiledCaughtException;
                              param0.d(114, -20);
                            }
                            break L3;
                          } else {
                            param0.d(116, var17.field_m[var5]);
                            break L3;
                          }
                        }
                        var6_ref11 = decompiledCaughtException;
                        param0.d(126, -21);
                        continue L2;
                      }
                    }
                  }
                } else {
                  L7: {
                    if (null == var13.field_r[var4]) {
                      break L7;
                    } else {
                      L8: {
                        if (var13.field_r[var4].field_f != -3) {
                          break L8;
                        } else {
                          var13.field_m[var4] = -5;
                          break L8;
                        }
                      }
                      if (-1 != var13.field_r[var4].field_f) {
                        break L7;
                      } else {
                        var3 = 1;
                        break L7;
                      }
                    }
                  }
                  if (var13.field_j[var4] != null) {
                    L9: {
                      if (-3 == (var13.field_j[var4].field_f ^ -1)) {
                        var13.field_m[var4] = -6;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    if (var13.field_j[var4].field_f == 0) {
                      var3 = 1;
                      var4++;
                      continue L0;
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(boolean param0) {
        L0: {
          if (((ln) this).field_n) {
            break L0;
          } else {
            L1: {
              if (-3 != (((ln) this).field_f ^ -1)) {
                break L1;
              } else {
                if ((((ln) this).field_k ^ -1) >= -1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            if ((d.field_n ^ -1L) == (((ln) this).field_d ^ -1L)) {
              return 1;
            } else {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  ln.a(-93);
                  break L2;
                }
              }
              L3: {
                if ((bj.field_b ^ -1) != -3) {
                  break L3;
                } else {
                  if (!dh.a(((ln) this).field_r, (byte) 111)) {
                    break L3;
                  } else {
                    return 1;
                  }
                }
              }
              return 0;
            }
          }
        }
        return 2;
    }

    ln(boolean param0) {
        if (param0) {
            ((ln) this).field_o = bn.field_b;
        } else {
            ((ln) this).field_o = null;
        }
        ((ln) this).field_r = qg.field_o;
        ((ln) this).field_s = md.field_f;
        ((ln) this).field_f = lb.field_b;
        ((ln) this).field_k = ja.field_c;
        ((ln) this).field_i = jg.field_c;
        ((ln) this).field_d = pm.field_c;
        ((ln) this).field_e = qa.field_e;
        ((ln) this).field_n = pk.field_k;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new bl(2);
        field_h = "Options";
        field_p = "Explosive crates will detonate when heavily damaged.";
        field_b = new boolean[]{false, false};
    }
}
