/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sd {
    private int field_d;
    private hl field_h;
    private int field_g;
    static fs field_e;
    static String field_b;
    private um field_c;
    static ri[] field_a;
    static int field_f;

    final static ov a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            ov var5 = null;
            fh var5_ref = null;
            ov stackIn_2_0 = null;
            ov stackIn_4_0 = null;
            fh stackIn_6_0 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            ov stackOut_3_0 = null;
            ov stackOut_1_0 = null;
            fh stackOut_5_0 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            RuntimeException stackOut_9_0 = null;
            StringBuilder stackOut_9_1 = null;
            String stackOut_9_2 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = Class.forName("rk");
                    var5 = (ov) (var4.newInstance());
                    if (param2 == 0) {
                      var5.a(param3, param0, param1, param2 + -119);
                      stackOut_3_0 = (ov) (var5);
                      stackIn_4_0 = stackOut_3_0;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackOut_1_0 = (ov) null;
                      stackIn_2_0 = stackOut_1_0;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new fh();
                  ((ov) ((Object) var5_ref)).a(param3, param0, param1, -125);
                  stackOut_5_0 = (fh) (var5_ref);
                  stackIn_6_0 = stackOut_5_0;
                  return (ov) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_7_0 = (RuntimeException) (var4_ref2);
                stackOut_7_1 = new StringBuilder().append("sd.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                stackIn_8_0 = stackOut_7_0;
                stackIn_8_1 = stackOut_7_1;
                if (param3 == null) {
                  stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackOut_9_2 = "null";
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "{...}";
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_10_1 = stackOut_8_1;
                  stackIn_10_2 = stackOut_8_2;
                  break L2;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final Object a(byte param0) {
        String discarded$2 = null;
        jt var2 = null;
        Object var3 = null;
        jt var4 = null;
        int var5 = 0;
        byte[] var6 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = (jt) ((Object) this.field_c.a(-1));
        L0: while (true) {
          if (var2 == null) {
            if (param0 == -92) {
              return null;
            } else {
              var6 = (byte[]) null;
              discarded$2 = sd.a((byte[]) null, 41, -100, 63);
              return null;
            }
          } else {
            var3 = var2.c((byte) 107);
            if (var5 == 0) {
              L1: {
                if (var3 != null) {
                  break L1;
                } else {
                  var4 = var2;
                  var2 = (jt) ((Object) this.field_c.a(-1));
                  var4.b(false);
                  var4.c(-5106);
                  this.field_d = this.field_d + var4.field_z;
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var3;
            } else {
              return null;
            }
          }
        }
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        av var6 = null;
        jt var7 = null;
        var7 = (jt) ((Object) this.field_c.a(575, param0));
        if (var7 != null) {
          var5 = var7.c((byte) -81);
          if (var5 == null) {
            var7.b(false);
            var7.c(-5106);
            this.field_d = this.field_d + var7.field_z;
            return null;
          } else {
            L0: {
              L1: {
                if (!var7.e(115)) {
                  break L1;
                } else {
                  var6 = new av(var5, var7.field_z);
                  this.field_c.a(-20657, var6, var7.field_h);
                  this.field_h.a((pj) (var6), (byte) -122);
                  ((jt) ((Object) var6)).field_l = 0L;
                  var7.b(false);
                  var7.c(-5106);
                  if (!Sumoblitz.field_L) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              this.field_h.a((pj) (var7), (byte) -124);
              var7.field_l = 0L;
              break L0;
            }
            L2: {
              if (param1 > 43) {
                break L2;
              } else {
                this.field_d = 126;
                break L2;
              }
            }
            return var5;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, int param1) {
        long fieldTemp$1 = 0L;
        jt var3 = null;
        kl var4 = null;
        int var5 = 0;
        var5 = Sumoblitz.field_L ? 1 : 0;
        if (param1 != 22663) {
          return;
        } else {
          var3 = (jt) ((Object) this.field_h.b(-1));
          L0: while (true) {
            L1: {
              if (var3 == null) {
                break L1;
              } else {
                if (var5 != 0) {
                  break L1;
                } else {
                  L2: {
                    L3: {
                      if (var3.e(param1 ^ -22690)) {
                        break L3;
                      } else {
                        fieldTemp$1 = var3.field_l + 1L;
                        var3.field_l = var3.field_l + 1L;
                        if ((fieldTemp$1 ^ -1L) < ((long)param0 ^ -1L)) {
                          var4 = new kl(var3.c((byte) -102), var3.field_z);
                          this.field_c.a(param1 ^ -2104, var4, var3.field_h);
                          pt.a(var3, 2066481250, var4);
                          var3.b(false);
                          var3.c(-5106);
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                    if (var3.c((byte) -62) != null) {
                      break L2;
                    } else {
                      var3.b(false);
                      var3.c(-5106);
                      this.field_d = this.field_d + var3.field_z;
                      break L2;
                    }
                  }
                  var3 = (jt) ((Object) this.field_h.a((byte) -122));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            return;
          }
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    final static void a(pl param0, int param1) {
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
            rd var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            rd var17 = null;
            Object var18 = null;
            Object var19 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            int stackIn_27_0 = 0;
            int stackIn_70_0 = 0;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_26_0 = 0;
            int stackOut_69_0 = 0;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            RuntimeException stackOut_74_0 = null;
            StringBuilder stackOut_74_1 = null;
            String stackOut_74_2 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            var18 = null;
            var19 = null;
            var21 = null;
            var12 = Sumoblitz.field_L ? 1 : 0;
            try {
              L0: {
                if (param1 > 126) {
                  var13 = (rd) ((Object) qr.field_c.b(-77));
                  var17 = var13;
                  if (var17 != null) {
                    var3 = 0;
                    var4 = 0;
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var17.field_p <= var4) {
                            break L3;
                          } else {
                            if (var12 != 0) {
                              break L2;
                            } else {
                              L4: {
                                if (var13.field_o[var4] == null) {
                                  break L4;
                                } else {
                                  L5: {
                                    if (2 == var13.field_o[var4].field_c) {
                                      var13.field_k[var4] = -5;
                                      break L5;
                                    } else {
                                      break L5;
                                    }
                                  }
                                  if (0 != var13.field_o[var4].field_c) {
                                    break L4;
                                  } else {
                                    var3 = 1;
                                    break L4;
                                  }
                                }
                              }
                              L6: {
                                if (null == var13.field_s[var4]) {
                                  break L6;
                                } else {
                                  L7: {
                                    if (2 != var13.field_s[var4].field_c) {
                                      break L7;
                                    } else {
                                      var13.field_k[var4] = -6;
                                      break L7;
                                    }
                                  }
                                  if (-1 == (var13.field_s[var4].field_c ^ -1)) {
                                    var3 = 1;
                                    break L6;
                                  } else {
                                    break L6;
                                  }
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
                        if (var3 == 0) {
                          var4 = param0.field_p;
                          param0.e(48, var17.field_t);
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                      var5 = 0;
                      L8: while (true) {
                        L9: {
                          L10: {
                            if (var17.field_p <= var5) {
                              break L10;
                            } else {
                              stackOut_26_0 = var13.field_k[var5] ^ -1;
                              stackIn_70_0 = stackOut_26_0;
                              stackIn_27_0 = stackOut_26_0;
                              if (var12 != 0) {
                                break L9;
                              } else {
                                L11: {
                                  L12: {
                                    if (stackIn_27_0 == -1) {
                                      break L12;
                                    } else {
                                      param0.b((byte) 118, var13.field_k[var5]);
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
                                          var6_int = var13.field_r[var5];
                                          if (var6_int == 0) {
                                            break L15;
                                          } else {
                                            L16: {
                                              if (1 == var6_int) {
                                                break L16;
                                              } else {
                                                if (-3 == (var6_int ^ -1)) {
                                                  var25 = (java.lang.reflect.Field) (var13.field_o[var5].field_d);
                                                  var8 = var25.getModifiers();
                                                  param0.b((byte) 88, 0);
                                                  param0.e(48, var8);
                                                  if (var12 == 0) {
                                                    break L14;
                                                  } else {
                                                    break L16;
                                                  }
                                                } else {
                                                  break L14;
                                                }
                                              }
                                            }
                                            var14 = (java.lang.reflect.Field) (var13.field_o[var5].field_d);
                                            var7 = var14;
                                            var14.setInt((Object) null, var13.field_n[var5]);
                                            param0.b((byte) 92, 0);
                                            if (var12 == 0) {
                                              break L14;
                                            } else {
                                              break L15;
                                            }
                                          }
                                        }
                                        var15 = (java.lang.reflect.Field) (var13.field_o[var5].field_d);
                                        var8 = var15.getInt((Object) null);
                                        param0.b((byte) 106, 0);
                                        param0.e(48, var8);
                                        break L14;
                                      }
                                      L17: {
                                        L18: {
                                          if (-4 == (var6_int ^ -1)) {
                                            break L18;
                                          } else {
                                            if (4 != var6_int) {
                                              break L17;
                                            } else {
                                              var26 = (java.lang.reflect.Method) (var13.field_s[var5].field_d);
                                              var8 = var26.getModifiers();
                                              param0.b((byte) 93, 0);
                                              param0.e(48, var8);
                                              if (var12 == 0) {
                                                break L17;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                        var27 = (java.lang.reflect.Method) (var13.field_s[var5].field_d);
                                        var24 = var13.field_u[var5];
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
                                            var10 = var27.invoke((Object) null, var9);
                                            if (var10 == null) {
                                              break L21;
                                            } else {
                                              L22: {
                                                if (var10 instanceof Number) {
                                                  break L22;
                                                } else {
                                                  L23: {
                                                    if (!(var10 instanceof String)) {
                                                      break L23;
                                                    } else {
                                                      param0.b((byte) 34, 2);
                                                      param0.a((String) (var10), (byte) -104);
                                                      if (var12 == 0) {
                                                        break L17;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  param0.b((byte) 49, 4);
                                                  if (var12 == 0) {
                                                    break L17;
                                                  } else {
                                                    break L22;
                                                  }
                                                }
                                              }
                                              param0.b((byte) 56, 1);
                                              param0.a(false, ((Number) (var10)).longValue());
                                              if (var12 == 0) {
                                                break L17;
                                              } else {
                                                break L21;
                                              }
                                            }
                                          }
                                          param0.b((byte) 39, 0);
                                          break L17;
                                        }
                                      }
                                      break L13;
                                    }
                                  } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                    decompiledCaughtException = decompiledCaughtParameter0;
                                    L24: {
                                      var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                      param0.b((byte) 93, -10);
                                      break L24;
                                    }
                                  } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                    decompiledCaughtException = decompiledCaughtParameter1;
                                    L25: {
                                      var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                      param0.b((byte) 41, -11);
                                      break L25;
                                    }
                                  } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                    decompiledCaughtException = decompiledCaughtParameter2;
                                    L26: {
                                      var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                      param0.b((byte) 108, -12);
                                      break L26;
                                    }
                                  } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                    decompiledCaughtException = decompiledCaughtParameter3;
                                    L27: {
                                      var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                      param0.b((byte) 42, -13);
                                      break L27;
                                    }
                                  } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                    decompiledCaughtException = decompiledCaughtParameter4;
                                    L28: {
                                      var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                      param0.b((byte) 53, -14);
                                      break L28;
                                    }
                                  } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                    decompiledCaughtException = decompiledCaughtParameter5;
                                    L29: {
                                      var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                      param0.b((byte) 86, -15);
                                      break L29;
                                    }
                                  } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                    decompiledCaughtException = decompiledCaughtParameter6;
                                    L30: {
                                      var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                      param0.b((byte) 106, -16);
                                      break L30;
                                    }
                                  } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                    decompiledCaughtException = decompiledCaughtParameter7;
                                    L31: {
                                      var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                      param0.b((byte) 33, -17);
                                      break L31;
                                    }
                                  } catch (java.io.IOException decompiledCaughtParameter8) {
                                    decompiledCaughtException = decompiledCaughtParameter8;
                                    L32: {
                                      var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                      param0.b((byte) 18, -18);
                                      break L32;
                                    }
                                  } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                    decompiledCaughtException = decompiledCaughtParameter9;
                                    L33: {
                                      var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                      param0.b((byte) 48, -19);
                                      break L33;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter10) {
                                    decompiledCaughtException = decompiledCaughtParameter10;
                                    L34: {
                                      var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                      param0.b((byte) 125, -20);
                                      break L34;
                                    }
                                  } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                    decompiledCaughtException = decompiledCaughtParameter11;
                                    L35: {
                                      var6_ref11 = decompiledCaughtException;
                                      param0.b((byte) 86, -21);
                                      break L35;
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
                          stackOut_69_0 = param0.a(var4, false);
                          stackIn_70_0 = stackOut_69_0;
                          break L9;
                        }
                        var17.b(false);
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    }
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L36: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_72_0 = (RuntimeException) (var2);
                stackOut_72_1 = new StringBuilder().append("sd.G(");
                stackIn_74_0 = stackOut_72_0;
                stackIn_74_1 = stackOut_72_1;
                stackIn_73_0 = stackOut_72_0;
                stackIn_73_1 = stackOut_72_1;
                if (param0 == null) {
                  stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
                  stackOut_74_1 = (StringBuilder) ((Object) stackIn_74_1);
                  stackOut_74_2 = "null";
                  stackIn_75_0 = stackOut_74_0;
                  stackIn_75_1 = stackOut_74_1;
                  stackIn_75_2 = stackOut_74_2;
                  break L36;
                } else {
                  stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackOut_73_2 = "{...}";
                  stackIn_75_0 = stackOut_73_0;
                  stackIn_75_1 = stackOut_73_1;
                  stackIn_75_2 = stackOut_73_2;
                  break L36;
                }
              }
              throw qo.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param1 + ')');
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

    sd(int param0) {
        this(param0, param0);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = Sumoblitz.field_L ? 1 : 0;
          if (param3 == 27) {
            break L0;
          } else {
            field_a = (ri[]) null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param4 > param5) {
              break L2;
            } else {
              L3: {
                if (param2 <= param5) {
                  break L3;
                } else {
                  uw.a(lk.field_a, param6, param4, param2, param1, param7, 1955582416, param0, param5);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param2 > param4) {
                  break L4;
                } else {
                  uw.a(lk.field_a, param7, param2, param5, param1, param0, 1955582416, param6, param4);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              uw.a(lk.field_a, param7, param4, param5, param1, param6, 1955582416, param0, param2);
              if (var9 == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L5: {
            if (param4 < param2) {
              break L5;
            } else {
              L6: {
                if (param2 <= param5) {
                  break L6;
                } else {
                  uw.a(lk.field_a, param0, param5, param4, param1, param6, param3 ^ 1955582411, param7, param2);
                  if (var9 == 0) {
                    break L1;
                  } else {
                    break L6;
                  }
                }
              }
              uw.a(lk.field_a, param0, param2, param4, param1, param7, 1955582416, param6, param5);
              if (var9 == 0) {
                break L1;
              } else {
                break L5;
              }
            }
          }
          uw.a(lk.field_a, param6, param5, param2, param1, param0, param3 + 1955582389, param7, param4);
          break L1;
        }
    }

    private final void a(jt param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
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
              if (param0 != null) {
                param0.b(false);
                param0.c(-5106);
                this.field_d = this.field_d + param0.field_z;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 == -124) {
                break L2;
              } else {
                field_a = (ri[]) null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var3);
            stackOut_6_1 = new StringBuilder().append("sd.M(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    final void a(long param0, Object param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(1, (byte) -95, param1, param0);
              if (param2 == 19) {
                break L1;
              } else {
                this.a(-95L, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sd.J(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    final Object b(int param0) {
        jt var2 = null;
        Object var3 = null;
        jt var4 = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackOut_4_0 = null;
        var5 = Sumoblitz.field_L ? 1 : 0;
        var2 = (jt) ((Object) this.field_c.c(-1));
        if (param0 == 0) {
          L0: while (true) {
            if (var2 != null) {
              var3 = var2.c((byte) 103);
              stackOut_4_0 = null;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (var5 == 0) {
                L1: {
                  if (stackIn_6_0 != var3) {
                    break L1;
                  } else {
                    var4 = var2;
                    var2 = (jt) ((Object) this.field_c.a(-1));
                    var4.b(false);
                    var4.c(-5106);
                    this.field_d = this.field_d + var4.field_z;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L1;
                    }
                  }
                }
                return var3;
              } else {
                return stackIn_5_0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (Object) null;
        }
    }

    final static String a(byte[] param0, int param1, int param2, int param3) {
        int incrementValue$2 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_3_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var12 = new char[param2];
            var11 = var12;
            var10 = var11;
            var4 = var10;
            if (param3 == 26564) {
              var5 = 0;
              var6 = 0;
              L1: while (true) {
                if (var6 >= param2) {
                  stackOut_18_0 = new String(var12, 0, var5);
                  stackIn_19_0 = stackOut_18_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      var7 = 255 & param0[param1 - -var6];
                      if (0 != var7) {
                        break L3;
                      } else {
                        if (var9 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (-129 < (var7 ^ -1)) {
                        break L4;
                      } else {
                        if (var7 < 160) {
                          L5: {
                            var8 = uk.field_lb[var7 + -128];
                            if (var8 == 0) {
                              var8 = 63;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var7 = var8;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    incrementValue$2 = var5;
                    var5++;
                    var10[incrementValue$2] = (char)var7;
                    break L2;
                  }
                  var6++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4_ref);
            stackOut_20_1 = new StringBuilder().append("sd.H(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_19_0;
        }
    }

    private final void a(long param0, boolean param1) {
        jt var4 = (jt) ((Object) this.field_c.a(575, param0));
        if (param1) {
            this.a(-43, (byte) -104, (Object) null, -101L);
        }
        this.a(var4, (byte) -124);
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_a = (ri[]) null;
        }
        field_a = null;
        field_b = null;
        field_e = null;
    }

    private final void a(int param0, byte param1, Object param2, long param3) {
        RuntimeException runtimeException = null;
        jt var6 = null;
        av var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var8 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (this.field_g < param0) {
              throw new IllegalStateException();
            } else {
              this.a(param3, false);
              this.field_d = this.field_d - param0;
              L1: while (true) {
                L2: {
                  if (0 <= this.field_d) {
                    break L2;
                  } else {
                    var6 = (jt) ((Object) this.field_h.b((byte) -61));
                    this.a(var6, (byte) -124);
                    if (var8 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6_ref = new av(param2, param0);
                this.field_c.a(-20657, var6_ref, param3);
                var7 = 2 % ((12 - param1) / 33);
                this.field_h.a((pj) (var6_ref), (byte) -122);
                ((jt) ((Object) var6_ref)).field_l = 0L;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("sd.B(").append(param0).append(',').append(param1).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param3 + ')');
        }
    }

    private sd(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.field_h = new hl();
        this.field_d = param0;
        this.field_g = param0;
        var3 = 1;
        L0: while (true) {
          L1: {
            if (var3 + var3 >= param0) {
              break L1;
            } else {
              if (param1 <= var3) {
                break L1;
              } else {
                var3 = var3 + var3;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
          }
          this.field_c = new um(var3);
          return;
        }
    }

    static {
        field_e = new fs(256);
        field_b = "ACHIEVEMENTS THIS GAME";
    }
}
