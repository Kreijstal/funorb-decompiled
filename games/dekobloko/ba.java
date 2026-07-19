/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ba implements nb {
    static um field_f;
    static String field_e;
    private long field_a;
    static wl field_b;
    static int field_d;
    static boolean field_c;

    public final void c(byte param0) {
        if (param0 != -51) {
            this.field_a = -32L;
        }
        this.field_a = ik.a(param0 + 55);
    }

    final static boolean a(ji param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
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
              if (param1 == -2147483648) {
                break L1;
              } else {
                field_f = (um) null;
                break L1;
              }
            }
            stackOut_2_0 = param0.a(false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var2);
            stackOut_4_1 = new StringBuilder().append("ba.AA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    abstract String e(byte param0);

    public static void d(byte param0) {
        field_f = null;
        field_e = null;
        if (param0 < 70) {
            return;
        }
        field_b = null;
    }

    public final String b(byte param0) {
        if (!this.a((byte) -101)) {
          if (param0 >= 52) {
            if ((ik.a(4) ^ -1L) > (350L + this.field_a ^ -1L)) {
              return null;
            } else {
              return this.e((byte) 49);
            }
          } else {
            return (String) null;
          }
        } else {
          return null;
        }
    }

    abstract tb b(int param0);

    final static void a(int param0, uf param1) {
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
            java.lang.reflect.Field var7 = null;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            kl var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            kl var17 = null;
            Object var18 = null;
            Object var20 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            int stackIn_29_0 = 0;
            int stackIn_73_0 = 0;
            RuntimeException stackIn_76_0 = null;
            StringBuilder stackIn_76_1 = null;
            RuntimeException stackIn_77_0 = null;
            StringBuilder stackIn_77_1 = null;
            RuntimeException stackIn_78_0 = null;
            StringBuilder stackIn_78_1 = null;
            String stackIn_78_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_28_0 = 0;
            int stackOut_72_0 = 0;
            RuntimeException stackOut_75_0 = null;
            StringBuilder stackOut_75_1 = null;
            RuntimeException stackOut_77_0 = null;
            StringBuilder stackOut_77_1 = null;
            String stackOut_77_2 = null;
            RuntimeException stackOut_76_0 = null;
            StringBuilder stackOut_76_1 = null;
            String stackOut_76_2 = null;
            var18 = null;
            var20 = null;
            var21 = null;
            var12 = client.field_A ? 1 : 0;
            try {
              L0: {
                var13 = (kl) ((Object) aa.field_f.c((byte) -54));
                var17 = var13;
                if (var17 == null) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3 = 0;
                  if (param0 == -32141) {
                    var4 = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var17.field_o <= var4) {
                            break L3;
                          } else {
                            if (var12 != 0) {
                              break L2;
                            } else {
                              L4: {
                                if (var13.field_y[var4] == null) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (-3 != (var13.field_y[var4].field_c ^ -1)) {
                                      break L5;
                                    } else {
                                      var13.field_A[var4] = -5;
                                      break L5;
                                    }
                                  }
                                  if (var13.field_y[var4].field_c == 0) {
                                    var3 = 1;
                                    break L4;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              L6: {
                                if (var13.field_t[var4] != null) {
                                  L7: {
                                    if ((var13.field_t[var4].field_c ^ -1) == -3) {
                                      var13.field_A[var4] = -6;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  if (-1 != (var13.field_t[var4].field_c ^ -1)) {
                                    break L6;
                                  } else {
                                    var3 = 1;
                                    break L6;
                                  }
                                } else {
                                  break L6;
                                }
                              }
                              var4++;
                              if (var12 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        if (var3 != 0) {
                          break L2;
                        } else {
                          var4 = param1.field_n;
                          param1.a(var17.field_C, false);
                          var5 = 0;
                          L8: while (true) {
                            L9: {
                              L10: {
                                if (var5 >= var17.field_o) {
                                  break L10;
                                } else {
                                  stackOut_28_0 = 0;
                                  stackIn_73_0 = stackOut_28_0;
                                  stackIn_29_0 = stackOut_28_0;
                                  if (var12 != 0) {
                                    break L9;
                                  } else {
                                    L11: {
                                      L12: {
                                        if (stackIn_29_0 == var13.field_A[var5]) {
                                          break L12;
                                        } else {
                                          param1.a(true, var13.field_A[var5]);
                                          if (var12 == 0) {
                                            break L11;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      try {
                                        L13: {
                                          L14: {
                                            L15: {
                                              var6_int = var13.field_u[var5];
                                              if (var6_int == 0) {
                                                break L15;
                                              } else {
                                                L16: {
                                                  if (-2 == (var6_int ^ -1)) {
                                                    break L16;
                                                  } else {
                                                    if (-3 != (var6_int ^ -1)) {
                                                      break L14;
                                                    } else {
                                                      var25 = (java.lang.reflect.Field) (var13.field_y[var5].field_b);
                                                      var8 = var25.getModifiers();
                                                      param1.a(true, 0);
                                                      param1.a(var8, false);
                                                      if (var12 == 0) {
                                                        break L14;
                                                      } else {
                                                        break L16;
                                                      }
                                                    }
                                                  }
                                                }
                                                var14 = (java.lang.reflect.Field) (var13.field_y[var5].field_b);
                                                var7 = var14;
                                                var14.setInt((Object) null, var13.field_q[var5]);
                                                param1.a(true, 0);
                                                if (var12 == 0) {
                                                  break L14;
                                                } else {
                                                  break L15;
                                                }
                                              }
                                            }
                                            var15 = (java.lang.reflect.Field) (var13.field_y[var5].field_b);
                                            var8 = var15.getInt((Object) null);
                                            param1.a(true, 0);
                                            param1.a(var8, false);
                                            break L14;
                                          }
                                          L17: {
                                            L18: {
                                              if (3 != var6_int) {
                                                break L18;
                                              } else {
                                                var26 = (java.lang.reflect.Method) (var13.field_t[var5].field_b);
                                                var24 = var13.field_s[var5];
                                                var9 = new Object[var24.length];
                                                var10_int = 0;
                                                L19: while (true) {
                                                  L20: {
                                                    if (var10_int >= var24.length) {
                                                      break L20;
                                                    } else {
                                                      var11 = new ObjectInputStream((InputStream) ((Object) new ByteArrayInputStream(var24[var10_int])));
                                                      var9[var10_int] = var11.readObject();
                                                      var10_int++;
                                                      if (var12 != 0) {
                                                        break L17;
                                                      } else {
                                                        if (var12 == 0) {
                                                          continue L19;
                                                        } else {
                                                          break L20;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  L21: {
                                                    L22: {
                                                      var10 = var26.invoke((Object) null, var9);
                                                      if (var10 == null) {
                                                        break L22;
                                                      } else {
                                                        L23: {
                                                          if (var10 instanceof Number) {
                                                            break L23;
                                                          } else {
                                                            L24: {
                                                              if (!(var10 instanceof String)) {
                                                                break L24;
                                                              } else {
                                                                param1.a(true, 2);
                                                                param1.a(0, (String) (var10));
                                                                if (var12 == 0) {
                                                                  break L21;
                                                                } else {
                                                                  break L24;
                                                                }
                                                              }
                                                            }
                                                            param1.a(true, 4);
                                                            if (var12 == 0) {
                                                              break L21;
                                                            } else {
                                                              break L23;
                                                            }
                                                          }
                                                        }
                                                        param1.a(true, 1);
                                                        param1.a(((Number) (var10)).longValue(), (byte) 0);
                                                        if (var12 == 0) {
                                                          break L21;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    param1.a(true, 0);
                                                    break L21;
                                                  }
                                                  if (var12 == 0) {
                                                    break L17;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                            }
                                            if (4 == var6_int) {
                                              var27 = (java.lang.reflect.Method) (var13.field_t[var5].field_b);
                                              var8 = var27.getModifiers();
                                              param1.a(true, 0);
                                              param1.a(var8, false);
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                          break L13;
                                        }
                                      } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                        decompiledCaughtException = decompiledCaughtParameter0;
                                        L25: {
                                          var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                          param1.a(true, -10);
                                          break L25;
                                        }
                                      } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                        decompiledCaughtException = decompiledCaughtParameter1;
                                        L26: {
                                          var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                          param1.a(true, -11);
                                          break L26;
                                        }
                                      } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                        decompiledCaughtException = decompiledCaughtParameter2;
                                        L27: {
                                          var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                          param1.a(true, -12);
                                          break L27;
                                        }
                                      } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                        decompiledCaughtException = decompiledCaughtParameter3;
                                        L28: {
                                          var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                          param1.a(true, -13);
                                          break L28;
                                        }
                                      } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                        decompiledCaughtException = decompiledCaughtParameter4;
                                        L29: {
                                          var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                          param1.a(true, -14);
                                          break L29;
                                        }
                                      } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                        decompiledCaughtException = decompiledCaughtParameter5;
                                        L30: {
                                          var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                          param1.a(true, -15);
                                          break L30;
                                        }
                                      } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                        decompiledCaughtException = decompiledCaughtParameter6;
                                        L31: {
                                          var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                          param1.a(true, -16);
                                          break L31;
                                        }
                                      } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                        decompiledCaughtException = decompiledCaughtParameter7;
                                        L32: {
                                          var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                          param1.a(true, -17);
                                          break L32;
                                        }
                                      } catch (java.io.IOException decompiledCaughtParameter8) {
                                        decompiledCaughtException = decompiledCaughtParameter8;
                                        L33: {
                                          var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                          param1.a(true, -18);
                                          break L33;
                                        }
                                      } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                        decompiledCaughtException = decompiledCaughtParameter9;
                                        L34: {
                                          var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                          param1.a(true, -19);
                                          break L34;
                                        }
                                      } catch (java.lang.Exception decompiledCaughtParameter10) {
                                        decompiledCaughtException = decompiledCaughtParameter10;
                                        L35: {
                                          var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                          param1.a(true, -20);
                                          break L35;
                                        }
                                      } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                        decompiledCaughtException = decompiledCaughtParameter11;
                                        L36: {
                                          var6_ref11 = decompiledCaughtException;
                                          param1.a(true, -21);
                                          break L36;
                                        }
                                      }
                                      break L11;
                                    }
                                    var5++;
                                    if (var12 == 0) {
                                      continue L8;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                              stackOut_72_0 = param1.a((byte) -15, var4);
                              stackIn_73_0 = stackOut_72_0;
                              break L9;
                            }
                            var17.b((byte) 103);
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L37: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_75_0 = (RuntimeException) (var2);
                stackOut_75_1 = new StringBuilder().append("ba.V(").append(param0).append(',');
                stackIn_77_0 = stackOut_75_0;
                stackIn_77_1 = stackOut_75_1;
                stackIn_76_0 = stackOut_75_0;
                stackIn_76_1 = stackOut_75_1;
                if (param1 == null) {
                  stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
                  stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
                  stackOut_77_2 = "null";
                  stackIn_78_0 = stackOut_77_0;
                  stackIn_78_1 = stackOut_77_1;
                  stackIn_78_2 = stackOut_77_2;
                  break L37;
                } else {
                  stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
                  stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
                  stackOut_76_2 = "{...}";
                  stackIn_78_0 = stackOut_76_0;
                  stackIn_78_1 = stackOut_76_1;
                  stackIn_78_2 = stackOut_76_2;
                  break L37;
                }
              }
              throw dh.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return;
                } else {
                  return;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final tb a(int param0) {
        if (!(!this.a((byte) 119))) {
            return ki.field_t;
        }
        if (param0 != 20350) {
            ba.a(-21, -85, -33);
        }
        if (!(ik.a(4) >= this.field_a + 350L)) {
            return le.field_o;
        }
        return this.b(param0 + -25870);
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (null == db.field_b) {
              break L1;
            } else {
              if (db.field_b.length >= param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          db.field_b = new int[2 * param1];
          break L0;
        }
        L2: {
          L3: {
            if (ad.field_i == null) {
              break L3;
            } else {
              if (ad.field_i.length < param1) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          ad.field_i = new int[param1 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (oa.field_e == null) {
              break L5;
            } else {
              if (oa.field_e.length < param1) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          oa.field_e = new int[2 * param1];
          break L4;
        }
        L6: {
          L7: {
            if (ln.field_a == null) {
              break L7;
            } else {
              if (param1 > ln.field_a.length) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          ln.field_a = new int[2 * param1];
          break L6;
        }
        L8: {
          L9: {
            if (null == mk.field_b) {
              break L9;
            } else {
              if (param1 > mk.field_b.length) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          mk.field_b = new int[2 * param1];
          break L8;
        }
        L10: {
          L11: {
            if (null == cc.field_h) {
              break L11;
            } else {
              if (cc.field_h.length < param1) {
                break L11;
              } else {
                break L10;
              }
            }
          }
          cc.field_h = new int[param1 * 2];
          break L10;
        }
        L12: {
          L13: {
            if (null == ch.field_a) {
              break L13;
            } else {
              if (ch.field_a.length < param1 - -param2) {
                break L13;
              } else {
                break L12;
              }
            }
          }
          ch.field_a = new int[(param2 + param1) * 2];
          break L12;
        }
        L14: {
          L15: {
            if (null == oe.field_L) {
              break L15;
            } else {
              if (oe.field_L.length < param1) {
                break L15;
              } else {
                break L14;
              }
            }
          }
          oe.field_L = new boolean[2 * param1];
          break L14;
        }
        ge.field_b = 2147483647;
        bg.field_d = -2147483648;
        og.field_eb = 0;
        mf.field_Q = param0;
        rf.field_g = -2147483648;
    }

    static {
        field_e = "Players";
        field_f = new um();
    }
}
