/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nh {
    private long field_b;
    private long field_k;
    private long field_n;
    private long field_j;
    private long field_e;
    private hf field_h;
    private int field_m;
    private byte[] field_g;
    private long field_o;
    private byte[] field_d;
    private int field_c;
    static qm field_i;
    static boolean field_a;
    static char[] field_l;
    static String field_f;

    public static void a(byte param0) {
        field_f = null;
        field_l = null;
        if (param0 != -73) {
            return;
        }
        field_i = null;
    }

    final void a(long param0, byte param1) throws IOException {
        if ((param0 ^ -1L) > -1L) {
          throw new IOException();
        } else {
          L0: {
            ((nh) this).field_j = param0;
            if (param1 == -109) {
              break L0;
            } else {
              nh.a((byte) 91);
              break L0;
            }
          }
          return;
        }
    }

    private final void b(byte param0) throws IOException {
        int var2 = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = client.field_A ? 1 : 0;
          var2 = 75 / ((param0 - -55) / 40);
          if (((nh) this).field_e != -1L) {
            L1: {
              if ((((nh) this).field_e ^ -1L) != (((nh) this).field_b ^ -1L)) {
                ((nh) this).field_h.a(((nh) this).field_e, 80);
                ((nh) this).field_b = ((nh) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((nh) this).field_h.a(((nh) this).field_d, 117, 0, ((nh) this).field_c);
              ((nh) this).field_b = ((nh) this).field_b + (long)((nh) this).field_c;
              if ((((nh) this).field_k ^ -1L) > (((nh) this).field_b ^ -1L)) {
                ((nh) this).field_k = ((nh) this).field_b;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var3 = -1L;
                if ((((nh) this).field_e ^ -1L) > (((nh) this).field_o ^ -1L)) {
                  break L4;
                } else {
                  if ((((nh) this).field_e ^ -1L) > (((nh) this).field_o + (long)((nh) this).field_m ^ -1L)) {
                    var3 = ((nh) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if ((((nh) this).field_e ^ -1L) < (((nh) this).field_o ^ -1L)) {
                break L3;
              } else {
                if (((long)((nh) this).field_c + ((nh) this).field_e ^ -1L) < (((nh) this).field_o ^ -1L)) {
                  var3 = ((nh) this).field_o;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var5 = -1L;
                if ((((nh) this).field_o ^ -1L) <= ((long)((nh) this).field_c + ((nh) this).field_e ^ -1L)) {
                  break L6;
                } else {
                  if ((long)((nh) this).field_m + ((nh) this).field_o >= (long)((nh) this).field_c + ((nh) this).field_e) {
                    var5 = ((nh) this).field_e + (long)((nh) this).field_c;
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              if ((long)((nh) this).field_m + ((nh) this).field_o <= ((nh) this).field_e) {
                break L5;
              } else {
                if (((nh) this).field_o + (long)((nh) this).field_m <= ((nh) this).field_e + (long)((nh) this).field_c) {
                  var5 = ((nh) this).field_o + (long)((nh) this).field_m;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (-1L >= var3) {
                break L7;
              } else {
                if ((var3 ^ -1L) > (var5 ^ -1L)) {
                  var7 = (int)(var5 - var3);
                  an.a(((nh) this).field_d, (int)(-((nh) this).field_e + var3), ((nh) this).field_g, (int)(-((nh) this).field_o + var3), var7);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((nh) this).field_e = -1L;
            ((nh) this).field_c = 0;
            break L0;
          } else {
            break L0;
          }
        }
    }

    final long b(int param0) {
        int var2 = 93 / ((-25 - param0) / 62);
        return ((nh) this).field_n;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = client.field_A ? 1 : 0;
        ((nh) this).field_m = param0;
        if (!(((nh) this).field_b == ((nh) this).field_j)) {
            ((nh) this).field_h.a(((nh) this).field_j, 123);
            ((nh) this).field_b = ((nh) this).field_j;
        }
        ((nh) this).field_o = ((nh) this).field_j;
        while (((nh) this).field_m < ((nh) this).field_g.length) {
            var2 = -((nh) this).field_m + ((nh) this).field_g.length;
            if (!(-200000001 <= (var2 ^ -1))) {
                var2 = 200000000;
            }
            var3 = ((nh) this).field_h.a(((nh) this).field_g, (byte) -103, ((nh) this).field_m, var2);
            if (-1 == var3) {
                break;
            }
            ((nh) this).field_m = ((nh) this).field_m + var3;
            ((nh) this).field_b = ((nh) this).field_b + (long)var3;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
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
        var14 = client.field_A ? 1 : 0;
        try {
          L0: {
            if (param2 == 741) {
              break L0;
            } else {
              nh.a((byte) 18, 18);
              break L0;
            }
          }
          if (param1.length < param0 - -param3) {
            throw new ArrayIndexOutOfBoundsException(-param1.length + (param0 + param3));
          } else {
            L1: {
              if ((((nh) this).field_e ^ -1L) == 0L) {
                break L1;
              } else {
                if (((nh) this).field_j < ((nh) this).field_e) {
                  break L1;
                } else {
                  if (((nh) this).field_j + (long)param3 > (long)((nh) this).field_c + ((nh) this).field_e) {
                    break L1;
                  } else {
                    an.a(((nh) this).field_d, (int)(-((nh) this).field_e + ((nh) this).field_j), param1, param0, param3);
                    ((nh) this).field_j = ((nh) this).field_j + (long)param3;
                    return;
                  }
                }
              }
            }
            L2: {
              var5_long = ((nh) this).field_j;
              var7 = param0;
              var8 = param3;
              if ((((nh) this).field_j ^ -1L) > (((nh) this).field_o ^ -1L)) {
                break L2;
              } else {
                if (((nh) this).field_j < (long)((nh) this).field_m + ((nh) this).field_o) {
                  L3: {
                    var9_int = (int)((long)((nh) this).field_m + (-((nh) this).field_j - -((nh) this).field_o));
                    if (param3 >= var9_int) {
                      break L3;
                    } else {
                      var9_int = param3;
                      break L3;
                    }
                  }
                  an.a(((nh) this).field_g, (int)(((nh) this).field_j - ((nh) this).field_o), param1, param0, var9_int);
                  ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                  param3 = param3 - var9_int;
                  param0 = param0 + var9_int;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L4: {
              if (param3 <= ((nh) this).field_g.length) {
                if ((param3 ^ -1) >= -1) {
                  break L4;
                } else {
                  L5: {
                    this.a(0);
                    var9_int = param3;
                    if (((nh) this).field_m < var9_int) {
                      var9_int = ((nh) this).field_m;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  an.a(((nh) this).field_g, 0, param1, param0, var9_int);
                  param0 = param0 + var9_int;
                  param3 = param3 - var9_int;
                  ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                  break L4;
                }
              } else {
                ((nh) this).field_h.a(((nh) this).field_j, 23);
                ((nh) this).field_b = ((nh) this).field_j;
                L6: while (true) {
                  if (0 >= param3) {
                    break L4;
                  } else {
                    var9_int = ((nh) this).field_h.a(param1, (byte) -38, param0, param3);
                    if ((var9_int ^ -1) == 0) {
                      break L4;
                    } else {
                      ((nh) this).field_b = ((nh) this).field_b + (long)var9_int;
                      param3 = param3 - var9_int;
                      param0 = param0 + var9_int;
                      ((nh) this).field_j = ((nh) this).field_j + (long)var9_int;
                      continue L6;
                    }
                  }
                }
              }
            }
            L7: {
              if (((nh) this).field_e != -1L) {
                L8: {
                  if (((nh) this).field_j >= ((nh) this).field_e) {
                    break L8;
                  } else {
                    if (-1 > (param3 ^ -1)) {
                      L9: {
                        var9_int = param0 - -(int)(((nh) this).field_e - ((nh) this).field_j);
                        if (var9_int <= param0 - -param3) {
                          break L9;
                        } else {
                          var9_int = param3 + param0;
                          break L9;
                        }
                      }
                      L10: while (true) {
                        if (var9_int <= param0) {
                          break L8;
                        } else {
                          param3--;
                          int incrementValue$1 = param0;
                          param0++;
                          param1[incrementValue$1] = (byte) 0;
                          ((nh) this).field_j = ((nh) this).field_j + 1L;
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
                    if ((var5_long ^ -1L) < (((nh) this).field_e ^ -1L)) {
                      break L12;
                    } else {
                      if (((nh) this).field_e >= var5_long - -(long)var8) {
                        break L12;
                      } else {
                        var9 = ((nh) this).field_e;
                        break L11;
                      }
                    }
                  }
                  if ((((nh) this).field_e ^ -1L) < (var5_long ^ -1L)) {
                    break L11;
                  } else {
                    if ((var5_long ^ -1L) > ((long)((nh) this).field_c + ((nh) this).field_e ^ -1L)) {
                      var9 = var5_long;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                }
                L13: {
                  L14: {
                    var11 = -1L;
                    if ((long)((nh) this).field_c + ((nh) this).field_e <= var5_long) {
                      break L14;
                    } else {
                      if (((long)var8 + var5_long ^ -1L) <= ((long)((nh) this).field_c + ((nh) this).field_e ^ -1L)) {
                        var11 = ((nh) this).field_e - -(long)((nh) this).field_c;
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (((nh) this).field_e >= (long)var8 + var5_long) {
                    break L13;
                  } else {
                    if (((long)((nh) this).field_c + ((nh) this).field_e ^ -1L) <= (var5_long + (long)var8 ^ -1L)) {
                      var11 = (long)var8 + var5_long;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                if (var9 <= -1L) {
                  break L7;
                } else {
                  if ((var11 ^ -1L) >= (var9 ^ -1L)) {
                    break L7;
                  } else {
                    var13 = (int)(var11 - var9);
                    an.a(((nh) this).field_d, (int)(-((nh) this).field_e + var9), param1, var7 + (int)(-var5_long + var9), var13);
                    if ((var11 ^ -1L) >= (((nh) this).field_j ^ -1L)) {
                      break L7;
                    } else {
                      param3 = (int)((long)param3 - (-((nh) this).field_j + var11));
                      ((nh) this).field_j = var11;
                      break L7;
                    }
                  }
                }
              } else {
                break L7;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((nh) this).field_b = -1L;
          throw var5;
        }
        if ((param3 ^ -1) < -1) {
          throw new EOFException();
        } else {
          return;
        }
    }

    final void c(byte param0) throws IOException {
        this.b((byte) -99);
        ((nh) this).field_h.a(-82);
        if (param0 < 113) {
            field_l = null;
        }
    }

    final void a(byte[] param0, byte param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var10 = client.field_A ? 1 : 0;
        try {
          L0: {
            if ((((nh) this).field_n ^ -1L) <= (((nh) this).field_j - -(long)param3 ^ -1L)) {
              break L0;
            } else {
              ((nh) this).field_n = (long)param3 + ((nh) this).field_j;
              break L0;
            }
          }
          L1: {
            if (-1L == ((nh) this).field_e) {
              break L1;
            } else {
              L2: {
                if ((((nh) this).field_j ^ -1L) > (((nh) this).field_e ^ -1L)) {
                  break L2;
                } else {
                  if ((((nh) this).field_j ^ -1L) < (((nh) this).field_e - -(long)((nh) this).field_c ^ -1L)) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              this.b((byte) -120);
              break L1;
            }
          }
          L3: {
            if (0L == (((nh) this).field_e ^ -1L)) {
              break L3;
            } else {
              if (((nh) this).field_j + (long)param3 <= ((nh) this).field_e - -(long)((nh) this).field_d.length) {
                break L3;
              } else {
                var5_int = (int)((long)((nh) this).field_d.length + (((nh) this).field_e + -((nh) this).field_j));
                an.a(param0, param2, ((nh) this).field_d, (int)(((nh) this).field_j - ((nh) this).field_e), var5_int);
                param2 = param2 + var5_int;
                param3 = param3 - var5_int;
                ((nh) this).field_j = ((nh) this).field_j + (long)var5_int;
                ((nh) this).field_c = ((nh) this).field_d.length;
                this.b((byte) -15);
                break L3;
              }
            }
          }
          if (((nh) this).field_d.length < param3) {
            L4: {
              if ((((nh) this).field_j ^ -1L) == (((nh) this).field_b ^ -1L)) {
                break L4;
              } else {
                ((nh) this).field_h.a(((nh) this).field_j, 47);
                ((nh) this).field_b = ((nh) this).field_j;
                break L4;
              }
            }
            L5: {
              ((nh) this).field_h.a(param0, 83, param2, param3);
              ((nh) this).field_b = ((nh) this).field_b + (long)param3;
              if (((nh) this).field_b <= ((nh) this).field_k) {
                break L5;
              } else {
                ((nh) this).field_k = ((nh) this).field_b;
                break L5;
              }
            }
            L6: {
              L7: {
                var5_long = -1L;
                if ((((nh) this).field_o ^ -1L) < (((nh) this).field_j ^ -1L)) {
                  break L7;
                } else {
                  if (((nh) this).field_j >= ((nh) this).field_o + (long)((nh) this).field_m) {
                    break L7;
                  } else {
                    var5_long = ((nh) this).field_j;
                    break L6;
                  }
                }
              }
              if (((nh) this).field_o < ((nh) this).field_j) {
                break L6;
              } else {
                if (((nh) this).field_o < (long)param3 + ((nh) this).field_j) {
                  var5_long = ((nh) this).field_o;
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L8: {
              L9: {
                var7 = -1L;
                if (((nh) this).field_o >= ((nh) this).field_j - -(long)param3) {
                  break L9;
                } else {
                  if ((long)((nh) this).field_m + ((nh) this).field_o >= (long)param3 + ((nh) this).field_j) {
                    var7 = ((nh) this).field_j + (long)param3;
                    break L8;
                  } else {
                    break L9;
                  }
                }
              }
              if ((long)((nh) this).field_m + ((nh) this).field_o <= ((nh) this).field_j) {
                break L8;
              } else {
                if ((((nh) this).field_o - -(long)((nh) this).field_m ^ -1L) >= ((long)param3 + ((nh) this).field_j ^ -1L)) {
                  var7 = ((nh) this).field_o - -(long)((nh) this).field_m;
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
                if (var7 > var5_long) {
                  var9 = (int)(-var5_long + var7);
                  an.a(param0, (int)(var5_long + ((long)param2 + -((nh) this).field_j)), ((nh) this).field_g, (int)(-((nh) this).field_o + var5_long), var9);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            ((nh) this).field_j = ((nh) this).field_j + (long)param3;
            return;
          } else {
            L11: {
              if (param1 > 91) {
                break L11;
              } else {
                field_f = null;
                break L11;
              }
            }
            if (param3 <= 0) {
              decompiledRegionSelector0 = 0;
            } else {
              L12: {
                if ((((nh) this).field_e ^ -1L) == 0L) {
                  ((nh) this).field_e = ((nh) this).field_j;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                an.a(param0, param2, ((nh) this).field_d, (int)(((nh) this).field_j - ((nh) this).field_e), param3);
                ((nh) this).field_j = ((nh) this).field_j + (long)param3;
                if ((((nh) this).field_j + -((nh) this).field_e ^ -1L) < ((long)((nh) this).field_c ^ -1L)) {
                  ((nh) this).field_c = (int)(-((nh) this).field_e + ((nh) this).field_j);
                  break L13;
                } else {
                  break L13;
                }
              }
              decompiledRegionSelector0 = 1;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((nh) this).field_b = -1L;
          throw var5;
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 != 12) {
          return;
        } else {
          L0: {
            qk.field_i = 3 & param1 >> -171891708;
            wh.field_d = (13 & param1) >> -1689619070;
            if (2 >= qk.field_i) {
              break L0;
            } else {
              qk.field_i = 2;
              break L0;
            }
          }
          L1: {
            wl.field_o = 3 & param1;
            if (wh.field_d <= 2) {
              break L1;
            } else {
              wh.field_d = 2;
              break L1;
            }
          }
          L2: {
            if (-3 <= (wl.field_o ^ -1)) {
              break L2;
            } else {
              wl.field_o = 2;
              break L2;
            }
          }
          return;
        }
    }

    nh(hf param0, int param1, int param2) throws IOException {
        ((nh) this).field_o = -1L;
        ((nh) this).field_e = -1L;
        ((nh) this).field_c = 0;
        ((nh) this).field_h = param0;
        ((nh) this).field_k = param0.a((byte) -50);
        ((nh) this).field_n = param0.a((byte) -50);
        ((nh) this).field_g = new byte[param1];
        ((nh) this).field_j = 0L;
        ((nh) this).field_d = new byte[param2];
    }

    final void a(byte[] param0, byte param1) throws IOException {
        ((nh) this).a(0, param0, 741, param0.length);
        int var3 = 38 / ((param1 - 70) / 44);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new qm(0, 2, 2, 1);
        field_f = "Show all lobby chat";
        field_l = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
