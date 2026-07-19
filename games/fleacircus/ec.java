/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ec implements Runnable {
    volatile boolean field_h;
    ce field_f;
    volatile boolean field_g;
    static fh field_b;
    volatile la[] field_c;
    static String field_d;
    static String field_e;
    static String field_a;

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_e = null;
        if (param0 <= 116) {
            field_a = (String) null;
        }
    }

    final static void a(ih param0, boolean param1) {
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
            fg var13 = null;
            java.lang.reflect.Field var14 = null;
            java.lang.reflect.Field var15 = null;
            fg var17 = null;
            Object var18 = null;
            Object var20 = null;
            Object var21 = null;
            byte[][] var24 = null;
            java.lang.reflect.Field var25 = null;
            java.lang.reflect.Method var26 = null;
            java.lang.reflect.Method var27 = null;
            int stackIn_23_0 = 0;
            int stackIn_69_0 = 0;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_73_0 = null;
            StringBuilder stackIn_73_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            String stackIn_74_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_22_0 = 0;
            int stackOut_68_0 = 0;
            RuntimeException stackOut_71_0 = null;
            StringBuilder stackOut_71_1 = null;
            RuntimeException stackOut_73_0 = null;
            StringBuilder stackOut_73_1 = null;
            String stackOut_73_2 = null;
            RuntimeException stackOut_72_0 = null;
            StringBuilder stackOut_72_1 = null;
            String stackOut_72_2 = null;
            var18 = null;
            var20 = null;
            var21 = null;
            var12 = fleas.field_A ? 1 : 0;
            try {
              L0: {
                var13 = (fg) ((Object) jk.field_m.c((byte) 47));
                var17 = var13;
                if (var17 != null) {
                  var3 = param1 ? 1 : 0;
                  var4 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var17.field_k <= var4) {
                          break L3;
                        } else {
                          if (var12 != 0) {
                            break L2;
                          } else {
                            L4: {
                              if (null == var13.field_n[var4]) {
                                break L4;
                              } else {
                                L5: {
                                  if (2 != var13.field_n[var4].field_b) {
                                    break L5;
                                  } else {
                                    var13.field_r[var4] = -5;
                                    break L5;
                                  }
                                }
                                if (0 != var13.field_n[var4].field_b) {
                                  break L4;
                                } else {
                                  var3 = 1;
                                  break L4;
                                }
                              }
                            }
                            L6: {
                              if (var13.field_s[var4] == null) {
                                break L6;
                              } else {
                                L7: {
                                  if (2 != var13.field_s[var4].field_b) {
                                    break L7;
                                  } else {
                                    var13.field_r[var4] = -6;
                                    break L7;
                                  }
                                }
                                if (-1 != (var13.field_s[var4].field_b ^ -1)) {
                                  break L6;
                                } else {
                                  var3 = 1;
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
                      if (var3 != 0) {
                        break L2;
                      } else {
                        var4 = param0.field_i;
                        param0.a(var17.field_v, (byte) -84);
                        var5 = 0;
                        L8: while (true) {
                          L9: {
                            L10: {
                              if (var17.field_k <= var5) {
                                break L10;
                              } else {
                                stackOut_22_0 = var13.field_r[var5] ^ -1;
                                stackIn_69_0 = stackOut_22_0;
                                stackIn_23_0 = stackOut_22_0;
                                if (var12 != 0) {
                                  break L9;
                                } else {
                                  L11: {
                                    L12: {
                                      if (stackIn_23_0 != -1) {
                                        param0.a(-11, var13.field_r[var5]);
                                        if (var12 == 0) {
                                          break L11;
                                        } else {
                                          break L12;
                                        }
                                      } else {
                                        break L12;
                                      }
                                    }
                                    try {
                                      L13: {
                                        L14: {
                                          L15: {
                                            var6_int = var13.field_o[var5];
                                            if (var6_int != 0) {
                                              break L15;
                                            } else {
                                              var25 = (java.lang.reflect.Field) (var13.field_n[var5].field_e);
                                              var8 = var25.getInt((Object) null);
                                              param0.a(-11, 0);
                                              param0.a(var8, (byte) -58);
                                              if (var12 == 0) {
                                                break L14;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var6_int != 1) {
                                              break L16;
                                            } else {
                                              var14 = (java.lang.reflect.Field) (var13.field_n[var5].field_e);
                                              var7 = var14;
                                              var14.setInt((Object) null, var13.field_p[var5]);
                                              param0.a(-11, 0);
                                              if (var12 == 0) {
                                                break L14;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          if (2 == var6_int) {
                                            var15 = (java.lang.reflect.Field) (var13.field_n[var5].field_e);
                                            var8 = var15.getModifiers();
                                            param0.a(-11, 0);
                                            param0.a(var8, (byte) -18);
                                            break L14;
                                          } else {
                                            break L14;
                                          }
                                        }
                                        L17: {
                                          L18: {
                                            if (var6_int != 3) {
                                              break L18;
                                            } else {
                                              var26 = (java.lang.reflect.Method) (var13.field_s[var5].field_e);
                                              var24 = var13.field_w[var5];
                                              var9 = new Object[var24.length];
                                              var10_int = 0;
                                              L19: while (true) {
                                                L20: {
                                                  if (var24.length <= var10_int) {
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
                                                  var10 = var26.invoke((Object) null, var9);
                                                  if (var10 != null) {
                                                    L22: {
                                                      if (!(var10 instanceof Number)) {
                                                        break L22;
                                                      } else {
                                                        param0.a(-11, 1);
                                                        param0.a(-83, ((Number) (var10)).longValue());
                                                        if (var12 == 0) {
                                                          break L21;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                    L23: {
                                                      if (var10 instanceof String) {
                                                        break L23;
                                                      } else {
                                                        param0.a(-11, 4);
                                                        if (var12 == 0) {
                                                          break L21;
                                                        } else {
                                                          break L23;
                                                        }
                                                      }
                                                    }
                                                    param0.a(-11, 2);
                                                    param0.a(127, (String) (var10));
                                                    if (var12 == 0) {
                                                      break L21;
                                                    } else {
                                                      param0.a(-11, 0);
                                                      break L21;
                                                    }
                                                  } else {
                                                    param0.a(-11, 0);
                                                    break L21;
                                                  }
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
                                            var27 = (java.lang.reflect.Method) (var13.field_s[var5].field_e);
                                            var8 = var27.getModifiers();
                                            param0.a(-11, 0);
                                            param0.a(var8, (byte) -32);
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        break L13;
                                      }
                                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                                      decompiledCaughtException = decompiledCaughtParameter0;
                                      L24: {
                                        var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                                        param0.a(-11, -10);
                                        break L24;
                                      }
                                    } catch (java.io.InvalidClassException decompiledCaughtParameter1) {
                                      decompiledCaughtException = decompiledCaughtParameter1;
                                      L25: {
                                        var6_ref = (InvalidClassException) (Object) decompiledCaughtException;
                                        param0.a(-11, -11);
                                        break L25;
                                      }
                                    } catch (java.io.StreamCorruptedException decompiledCaughtParameter2) {
                                      decompiledCaughtException = decompiledCaughtParameter2;
                                      L26: {
                                        var6_ref2 = (StreamCorruptedException) (Object) decompiledCaughtException;
                                        param0.a(-11, -12);
                                        break L26;
                                      }
                                    } catch (java.io.OptionalDataException decompiledCaughtParameter3) {
                                      decompiledCaughtException = decompiledCaughtParameter3;
                                      L27: {
                                        var6_ref3 = (OptionalDataException) (Object) decompiledCaughtException;
                                        param0.a(-11, -13);
                                        break L27;
                                      }
                                    } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                      decompiledCaughtException = decompiledCaughtParameter4;
                                      L28: {
                                        var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                        param0.a(-11, -14);
                                        break L28;
                                      }
                                    } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                      decompiledCaughtException = decompiledCaughtParameter5;
                                      L29: {
                                        var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                        param0.a(-11, -15);
                                        break L29;
                                      }
                                    } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                      decompiledCaughtException = decompiledCaughtParameter6;
                                      L30: {
                                        var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                        param0.a(-11, -16);
                                        break L30;
                                      }
                                    } catch (java.lang.SecurityException decompiledCaughtParameter7) {
                                      decompiledCaughtException = decompiledCaughtParameter7;
                                      L31: {
                                        var6_ref7 = (SecurityException) (Object) decompiledCaughtException;
                                        param0.a(-11, -17);
                                        break L31;
                                      }
                                    } catch (java.io.IOException decompiledCaughtParameter8) {
                                      decompiledCaughtException = decompiledCaughtParameter8;
                                      L32: {
                                        var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                        param0.a(-11, -18);
                                        break L32;
                                      }
                                    } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                      decompiledCaughtException = decompiledCaughtParameter9;
                                      L33: {
                                        var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                        param0.a(-11, -19);
                                        break L33;
                                      }
                                    } catch (java.lang.Exception decompiledCaughtParameter10) {
                                      decompiledCaughtException = decompiledCaughtParameter10;
                                      L34: {
                                        var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                        param0.a(-11, -20);
                                        break L34;
                                      }
                                    } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                      decompiledCaughtException = decompiledCaughtParameter11;
                                      L35: {
                                        var6_ref11 = decompiledCaughtException;
                                        param0.a(-11, -21);
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
                            stackOut_68_0 = param0.c(var4, -30532);
                            stackIn_69_0 = stackOut_68_0;
                            break L9;
                          }
                          var17.c(-1);
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
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
                stackOut_71_0 = (RuntimeException) (var2);
                stackOut_71_1 = new StringBuilder().append("ec.C(");
                stackIn_73_0 = stackOut_71_0;
                stackIn_73_1 = stackOut_71_1;
                stackIn_72_0 = stackOut_71_0;
                stackIn_72_1 = stackOut_71_1;
                if (param0 == null) {
                  stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
                  stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
                  stackOut_73_2 = "null";
                  stackIn_74_0 = stackOut_73_0;
                  stackIn_74_1 = stackOut_73_1;
                  stackIn_74_2 = stackOut_73_2;
                  break L36;
                } else {
                  stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
                  stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
                  stackOut_72_2 = "{...}";
                  stackIn_74_0 = stackOut_72_0;
                  stackIn_74_1 = stackOut_72_1;
                  stackIn_74_2 = stackOut_72_2;
                  break L36;
                }
              }
              throw pf.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(hg param0, byte param1, int param2) {
        ih var3 = ud.field_b;
        var3.e(8, param2);
        if (param1 != 30) {
            return;
        }
        try {
            var3.a(-11, param0.field_m);
            var3.a(-11, param0.field_j);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "ec.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        la var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        this.field_h = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    if (this.field_g) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          L5: {
                            if (var1_int >= 2) {
                              vh.a(10L, -108);
                              aj.a((byte) -60, (Object) null, this.field_f);
                              break L5;
                            } else {
                              var2 = this.field_c[var1_int];
                              if (var4 != 0) {
                                break L5;
                              } else {
                                L6: {
                                  if (var2 == null) {
                                    break L6;
                                  } else {
                                    var2.a();
                                    break L6;
                                  }
                                }
                                var1_int++;
                                continue L4;
                              }
                            }
                          }
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                exception = (Exception) (Object) decompiledCaughtException;
                var5 = (String) null;
                ud.a((String) null, (Throwable) ((Object) exception), 0);
                this.field_h = false;
                decompiledRegionSelector0 = 1;
                break L7;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_h = false;
          throw ec.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L8: {
          if (decompiledRegionSelector1 == 0) {
            this.field_h = false;
            break L8;
          } else {
            break L8;
          }
        }
    }

    ec() {
        this.field_c = new la[2];
        this.field_g = false;
        this.field_h = false;
    }

    static {
        field_b = new fh(1, 2, 2, 0);
        field_d = "Hints (1/2)";
        field_e = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_a = "Start new levels";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
