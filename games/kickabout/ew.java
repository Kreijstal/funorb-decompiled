/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ew {
    private long field_e;
    static String field_d;
    private byte[] field_k;
    private long field_c;
    private long field_m;
    private ao field_j;
    private long field_l;
    private int field_g;
    private int field_b;
    private byte[] field_h;
    private long field_f;
    private long field_i;
    static int field_a;

    final void a(byte param0, long param1) throws IOException {
        if ((param1 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          if (param0 != 4) {
            return;
          } else {
            ((ew) this).field_m = param1;
            return;
          }
        }
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        var1 = (Object) (Object) lw.field_e;
        synchronized (var1) {
          L0: {
            nl.field_p = ao.field_d;
            lb.field_M = lb.field_M + 1;
            el.field_A = vf.field_G;
            n.field_m = gf.field_b;
            el.field_C = rp.field_A;
            rp.field_A = false;
            wj.field_A = vu.field_Fb;
            sm.field_q = fp.field_w;
            vc.field_y = fd.field_l;
            vu.field_Fb = 0;
            break L0;
          }
        }
        L1: {
          if (param0 == 58) {
            break L1;
          } else {
            field_d = null;
            break L1;
          }
        }
    }

    final static boolean a(int param0, String param1) {
        int var2 = 0;
        CharSequence var3 = null;
        var2 = -11 / ((67 - param0) / 50);
        if (vg.field_Wb) {
          if (-3 == (ov.field_b ^ -1)) {
            if (null != qi.field_o) {
              var3 = (CharSequence) (Object) param1;
              if (!qi.field_o.equals((Object) (Object) mo.a(0, var3))) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static void a(int param0, int param1, hu param2, hu param3) {
        vp.field_k = param1;
        sf.field_F = param3;
        cv.field_f = param2;
        int var4 = 82 / ((60 - param0) / 61);
        bs.a(on.field_f / 2, 0, on.field_g / 2);
        sb.a(param3.field_L, param3.field_p + param3.field_L, param2.field_L, param2.field_p + param2.field_L, (byte) 5);
    }

    private final void b(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Kickabout.field_G;
          ((ew) this).field_b = param0;
          if ((((ew) this).field_c ^ -1L) != (((ew) this).field_m ^ -1L)) {
            ((ew) this).field_j.a(param0 ^ 15557, ((ew) this).field_m);
            ((ew) this).field_c = ((ew) this).field_m;
            break L0;
          } else {
            break L0;
          }
        }
        ((ew) this).field_e = ((ew) this).field_m;
        L1: while (true) {
          L2: {
            if (((ew) this).field_h.length <= ((ew) this).field_b) {
              break L2;
            } else {
              L3: {
                var2 = ((ew) this).field_h.length + -((ew) this).field_b;
                if (var2 <= 200000000) {
                  break L3;
                } else {
                  var2 = 200000000;
                  break L3;
                }
              }
              var3 = ((ew) this).field_j.a(33, var2, ((ew) this).field_h, ((ew) this).field_b);
              if ((var3 ^ -1) == 0) {
                break L2;
              } else {
                ((ew) this).field_c = ((ew) this).field_c + (long)var3;
                ((ew) this).field_b = ((ew) this).field_b + var3;
                continue L1;
              }
            }
          }
          return;
        }
    }

    public static void d(int param0) {
        if (param0 <= 68) {
            field_d = null;
        }
        field_d = null;
    }

    final void a(int param0, byte[] param1) throws IOException {
        if (param0 <= 57) {
            ((ew) this).field_c = -73L;
        }
        ((ew) this).a(param1.length, 0, (byte) 115, param1);
    }

    final void c(int param0) throws IOException {
        this.e(121);
        ((ew) this).field_j.a(param0 ^ -111);
        if (param0 != 1) {
            Object var3 = null;
            boolean discarded$0 = ew.a(60, (String) null);
        }
    }

    final long a(int param0) {
        int var2 = 97 % ((-25 - param0) / 45);
        return ((ew) this).field_f;
    }

    final static void a(boolean param0, sj param1, sj param2, int param3) {
        el.a((hu) (Object) jw.field_Ab, kr.field_b, kn.field_F, uk.field_b, nj.field_d, param0, r.field_c, jf.field_B, ul.field_c, dw.field_e, 5, ip.field_c);
        il.field_d = se.a(param1, -127, "lobby", "chatfilter");
        tf.field_h[2] = pa.field_j;
        tf.field_h[param3] = gr.field_Q;
        tf.field_h[1] = lk.field_n;
        at.a((hu) (Object) rq.field_E, param2, (byte) -32);
    }

    final static int a(byte param0, int param1, ml param2, int param3, int param4, int param5) {
        if (param0 != 125) {
            field_a = -16;
        }
        return fs.a(-128, (param3 ^ -1) == -1 ? 0 : 1 << -1 + param3, -1 == (param1 ^ -1) ? 0 : 1 << -1 + param1, param4, param1, 0 != param5 ? 1 << param5 - 1 : 0, 0 == param4 ? 0 : 1 << param4 + -1, param2, param5, param3);
    }

    final void a(int param0, int param1, byte param2, byte[] param3) throws IOException {
        IOException var5 = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        long var9 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int var14 = 0;
        Throwable decompiledCaughtException = null;
        var14 = Kickabout.field_G;
        try {
          L0: {
            if (param3.length >= param0 + param1) {
              L1: {
                if (((ew) this).field_l == -1L) {
                  break L1;
                } else {
                  if ((((ew) this).field_m ^ -1L) > (((ew) this).field_l ^ -1L)) {
                    break L1;
                  } else {
                    if ((((ew) this).field_m + (long)param0 ^ -1L) >= (((ew) this).field_l - -(long)((ew) this).field_g ^ -1L)) {
                      dv.a(((ew) this).field_k, (int)(((ew) this).field_m - ((ew) this).field_l), param3, param1, param0);
                      ((ew) this).field_m = ((ew) this).field_m + (long)param0;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              var5_long = ((ew) this).field_m;
              var7 = param1;
              var8 = param0;
              if (param2 >= 89) {
                L2: {
                  if (((ew) this).field_m < ((ew) this).field_e) {
                    break L2;
                  } else {
                    if (((ew) this).field_e - -(long)((ew) this).field_b <= ((ew) this).field_m) {
                      break L2;
                    } else {
                      L3: {
                        var9_int = (int)((long)((ew) this).field_b + (((ew) this).field_e + -((ew) this).field_m));
                        if (var9_int > param0) {
                          var9_int = param0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      dv.a(((ew) this).field_h, (int)(((ew) this).field_m + -((ew) this).field_e), param3, param1, var9_int);
                      param0 = param0 - var9_int;
                      param1 = param1 + var9_int;
                      ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                      break L2;
                    }
                  }
                }
                L4: {
                  if (((ew) this).field_h.length < param0) {
                    ((ew) this).field_j.a(15557, ((ew) this).field_m);
                    ((ew) this).field_c = ((ew) this).field_m;
                    L5: while (true) {
                      if (param0 <= 0) {
                        break L4;
                      } else {
                        var9_int = ((ew) this).field_j.a(33, param0, param3, param1);
                        if (-1 != var9_int) {
                          ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                          ((ew) this).field_c = ((ew) this).field_c + (long)var9_int;
                          param0 = param0 - var9_int;
                          param1 = param1 + var9_int;
                          continue L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                  } else {
                    if (0 >= param0) {
                      break L4;
                    } else {
                      L6: {
                        this.b(0);
                        var9_int = param0;
                        if (((ew) this).field_b < var9_int) {
                          var9_int = ((ew) this).field_b;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      dv.a(((ew) this).field_h, 0, param3, param1, var9_int);
                      ((ew) this).field_m = ((ew) this).field_m + (long)var9_int;
                      param1 = param1 + var9_int;
                      param0 = param0 - var9_int;
                      break L4;
                    }
                  }
                }
                L7: {
                  if (((ew) this).field_l == -1L) {
                    break L7;
                  } else {
                    L8: {
                      if ((((ew) this).field_m ^ -1L) <= (((ew) this).field_l ^ -1L)) {
                        break L8;
                      } else {
                        if (0 < param0) {
                          L9: {
                            var9_int = (int)(((ew) this).field_l - ((ew) this).field_m) + param1;
                            if (var9_int <= param0 + param1) {
                              break L9;
                            } else {
                              var9_int = param1 + param0;
                              break L9;
                            }
                          }
                          L10: while (true) {
                            if (var9_int <= param1) {
                              break L8;
                            } else {
                              int incrementValue$1 = param1;
                              param1++;
                              param3[incrementValue$1] = (byte) 0;
                              param0--;
                              ((ew) this).field_m = ((ew) this).field_m + 1L;
                              continue L10;
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    L11: {
                      L12: {
                        var9 = -1L;
                        var11 = -1L;
                        if ((((ew) this).field_l ^ -1L) > (var5_long ^ -1L)) {
                          break L12;
                        } else {
                          if ((long)var8 + var5_long > ((ew) this).field_l) {
                            var9 = ((ew) this).field_l;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      if (var5_long < ((ew) this).field_l) {
                        break L11;
                      } else {
                        if (var5_long < (long)((ew) this).field_g + ((ew) this).field_l) {
                          var9 = var5_long;
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                    }
                    L13: {
                      L14: {
                        if ((var5_long ^ -1L) <= (((ew) this).field_l - -(long)((ew) this).field_g ^ -1L)) {
                          break L14;
                        } else {
                          if (var5_long + (long)var8 < (long)((ew) this).field_g + ((ew) this).field_l) {
                            break L14;
                          } else {
                            var11 = ((ew) this).field_l + (long)((ew) this).field_g;
                            break L13;
                          }
                        }
                      }
                      if ((((ew) this).field_l ^ -1L) <= ((long)var8 + var5_long ^ -1L)) {
                        break L13;
                      } else {
                        if (var5_long - -(long)var8 > (long)((ew) this).field_g + ((ew) this).field_l) {
                          break L13;
                        } else {
                          var11 = (long)var8 + var5_long;
                          break L13;
                        }
                      }
                    }
                    if (-1L >= var9) {
                      break L7;
                    } else {
                      if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                        break L7;
                      } else {
                        var13 = (int)(var11 + -var9);
                        dv.a(((ew) this).field_k, (int)(-((ew) this).field_l + var9), param3, (int)(-var5_long + var9) + var7, var13);
                        if (((ew) this).field_m >= var11) {
                          break L7;
                        } else {
                          param0 = (int)((long)param0 - (var11 - ((ew) this).field_m));
                          ((ew) this).field_m = var11;
                          break L7;
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              throw new ArrayIndexOutOfBoundsException(param0 + (param1 - param3.length));
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ew) this).field_c = -1L;
          throw var5;
        }
        if (0 < param0) {
          throw new EOFException();
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var10 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if ((((ew) this).field_f ^ -1L) > (((ew) this).field_m + (long)param2 ^ -1L)) {
                ((ew) this).field_f = (long)param2 + ((ew) this).field_m;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if ((((ew) this).field_l ^ -1L) == 0L) {
                break L2;
              } else {
                if ((((ew) this).field_m ^ -1L) <= (((ew) this).field_l ^ -1L)) {
                  if ((((ew) this).field_l - -(long)((ew) this).field_g ^ -1L) <= (((ew) this).field_m ^ -1L)) {
                    break L2;
                  } else {
                    this.e(102);
                    break L2;
                  }
                } else {
                  this.e(102);
                  break L2;
                }
              }
            }
            if (param1 > 37) {
              L3: {
                if (0L == (((ew) this).field_l ^ -1L)) {
                  break L3;
                } else {
                  if (((long)((ew) this).field_k.length + ((ew) this).field_l ^ -1L) > (((ew) this).field_m - -(long)param2 ^ -1L)) {
                    var5_int = (int)((long)((ew) this).field_k.length - (-((ew) this).field_l + ((ew) this).field_m));
                    dv.a(param3, param0, ((ew) this).field_k, (int)(((ew) this).field_m + -((ew) this).field_l), var5_int);
                    param2 = param2 - var5_int;
                    ((ew) this).field_m = ((ew) this).field_m + (long)var5_int;
                    param0 = param0 + var5_int;
                    ((ew) this).field_g = ((ew) this).field_k.length;
                    this.e(109);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (((ew) this).field_k.length < param2) {
                L4: {
                  if ((((ew) this).field_c ^ -1L) != (((ew) this).field_m ^ -1L)) {
                    ((ew) this).field_j.a(15557, ((ew) this).field_m);
                    ((ew) this).field_c = ((ew) this).field_m;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  ((ew) this).field_j.a(1, param3, param0, param2);
                  ((ew) this).field_c = ((ew) this).field_c + (long)param2;
                  if (((ew) this).field_c > ((ew) this).field_i) {
                    ((ew) this).field_i = ((ew) this).field_c;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    var5_long = -1L;
                    var7 = -1L;
                    if ((((ew) this).field_e ^ -1L) < (((ew) this).field_m ^ -1L)) {
                      break L7;
                    } else {
                      if ((long)((ew) this).field_b + ((ew) this).field_e > ((ew) this).field_m) {
                        var5_long = ((ew) this).field_m;
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  if ((((ew) this).field_e ^ -1L) > (((ew) this).field_m ^ -1L)) {
                    break L6;
                  } else {
                    if (((ew) this).field_e < (long)param2 + ((ew) this).field_m) {
                      var5_long = ((ew) this).field_e;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L8: {
                  L9: {
                    if (((ew) this).field_m - -(long)param2 <= ((ew) this).field_e) {
                      break L9;
                    } else {
                      if ((((ew) this).field_m - -(long)param2 ^ -1L) < (((ew) this).field_e - -(long)((ew) this).field_b ^ -1L)) {
                        break L9;
                      } else {
                        var7 = (long)param2 + ((ew) this).field_m;
                        break L8;
                      }
                    }
                  }
                  if (((ew) this).field_m >= ((ew) this).field_e - -(long)((ew) this).field_b) {
                    break L8;
                  } else {
                    if (((ew) this).field_e + (long)((ew) this).field_b <= ((ew) this).field_m + (long)param2) {
                      var7 = ((ew) this).field_e - -(long)((ew) this).field_b;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L10: {
                  if ((var5_long ^ -1L) >= 0L) {
                    break L10;
                  } else {
                    if (var7 <= var5_long) {
                      break L10;
                    } else {
                      var9 = (int)(var7 + -var5_long);
                      dv.a(param3, (int)((long)param0 - (-var5_long - -((ew) this).field_m)), ((ew) this).field_h, (int)(-((ew) this).field_e + var5_long), var9);
                      break L10;
                    }
                  }
                }
                ((ew) this).field_m = ((ew) this).field_m + (long)param2;
                return;
              } else {
                if ((param2 ^ -1) >= -1) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L11: {
                    if (((ew) this).field_l != -1L) {
                      break L11;
                    } else {
                      ((ew) this).field_l = ((ew) this).field_m;
                      break L11;
                    }
                  }
                  L12: {
                    dv.a(param3, param0, ((ew) this).field_k, (int)(((ew) this).field_m - ((ew) this).field_l), param2);
                    ((ew) this).field_m = ((ew) this).field_m + (long)param2;
                    if ((long)((ew) this).field_g >= ((ew) this).field_m - ((ew) this).field_l) {
                      break L12;
                    } else {
                      ((ew) this).field_g = (int)(-((ew) this).field_l + ((ew) this).field_m);
                      break L12;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((ew) this).field_c = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void e(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Kickabout.field_G;
          if (param0 > 92) {
            break L0;
          } else {
            ((ew) this).field_f = 70L;
            break L0;
          }
        }
        L1: {
          if (-1L != ((ew) this).field_l) {
            L2: {
              if (((ew) this).field_c == ((ew) this).field_l) {
                break L2;
              } else {
                ((ew) this).field_j.a(15557, ((ew) this).field_l);
                ((ew) this).field_c = ((ew) this).field_l;
                break L2;
              }
            }
            L3: {
              ((ew) this).field_j.a(1, ((ew) this).field_k, 0, ((ew) this).field_g);
              ((ew) this).field_c = ((ew) this).field_c + (long)((ew) this).field_g;
              if (((ew) this).field_i >= ((ew) this).field_c) {
                break L3;
              } else {
                ((ew) this).field_i = ((ew) this).field_c;
                break L3;
              }
            }
            L4: {
              L5: {
                var2 = -1L;
                var4 = -1L;
                if ((((ew) this).field_l ^ -1L) > (((ew) this).field_e ^ -1L)) {
                  break L5;
                } else {
                  if ((((ew) this).field_l ^ -1L) <= (((ew) this).field_e + (long)((ew) this).field_b ^ -1L)) {
                    break L5;
                  } else {
                    var2 = ((ew) this).field_l;
                    break L4;
                  }
                }
              }
              if (((ew) this).field_e < ((ew) this).field_l) {
                break L4;
              } else {
                if (((long)((ew) this).field_g + ((ew) this).field_l ^ -1L) >= (((ew) this).field_e ^ -1L)) {
                  break L4;
                } else {
                  var2 = ((ew) this).field_e;
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (((ew) this).field_l - -(long)((ew) this).field_g <= ((ew) this).field_e) {
                  break L7;
                } else {
                  if ((long)((ew) this).field_b + ((ew) this).field_e >= ((ew) this).field_l + (long)((ew) this).field_g) {
                    var4 = ((ew) this).field_l + (long)((ew) this).field_g;
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              if (((long)((ew) this).field_b + ((ew) this).field_e ^ -1L) >= (((ew) this).field_l ^ -1L)) {
                break L6;
              } else {
                if ((((ew) this).field_l - -(long)((ew) this).field_g ^ -1L) > ((long)((ew) this).field_b + ((ew) this).field_e ^ -1L)) {
                  break L6;
                } else {
                  var4 = (long)((ew) this).field_b + ((ew) this).field_e;
                  break L6;
                }
              }
            }
            L8: {
              if (0L <= (var2 ^ -1L)) {
                break L8;
              } else {
                if ((var2 ^ -1L) <= (var4 ^ -1L)) {
                  break L8;
                } else {
                  var6 = (int)(var4 + -var2);
                  dv.a(((ew) this).field_k, (int)(var2 + -((ew) this).field_l), ((ew) this).field_h, (int)(-((ew) this).field_e + var2), var6);
                  break L8;
                }
              }
            }
            ((ew) this).field_g = 0;
            ((ew) this).field_l = -1L;
            break L1;
          } else {
            break L1;
          }
        }
    }

    ew(ao param0, int param1, int param2) throws IOException {
        ((ew) this).field_e = -1L;
        ((ew) this).field_l = -1L;
        ((ew) this).field_g = 0;
        ((ew) this).field_j = param0;
        long dupTemp$0 = param0.c(31114);
        ((ew) this).field_i = dupTemp$0;
        ((ew) this).field_f = dupTemp$0;
        ((ew) this).field_k = new byte[param2];
        ((ew) this).field_h = new byte[param1];
        ((ew) this).field_m = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "The auction system is currently offline.";
    }
}
