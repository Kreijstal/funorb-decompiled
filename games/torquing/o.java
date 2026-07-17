/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class o {
    private byte[] field_a;
    private long field_k;
    private long field_l;
    private long field_e;
    private long field_h;
    private byte[] field_g;
    private long field_f;
    private int field_b;
    private long field_i;
    static String field_c;
    private int field_j;
    private ue field_d;

    private final void c(int param0) throws IOException {
        long var2 = 0L;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = Torquing.field_u;
          if (((o) this).field_e != -1L) {
            L1: {
              if (~((o) this).field_e != ~((o) this).field_h) {
                ((o) this).field_d.a(-2, ((o) this).field_e);
                ((o) this).field_h = ((o) this).field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              ((o) this).field_d.a(((o) this).field_b, 2, 0, ((o) this).field_g);
              ((o) this).field_h = ((o) this).field_h + (long)((o) this).field_b;
              if (~((o) this).field_k > ~((o) this).field_h) {
                ((o) this).field_k = ((o) this).field_h;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var2 = -1L;
                if (((o) this).field_e < ((o) this).field_f) {
                  break L4;
                } else {
                  if (((o) this).field_e < (long)((o) this).field_j + ((o) this).field_f) {
                    var2 = ((o) this).field_e;
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              if (((o) this).field_e > ((o) this).field_f) {
                break L3;
              } else {
                if (((o) this).field_f < ((o) this).field_e + (long)((o) this).field_b) {
                  var2 = ((o) this).field_f;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L5: {
              L6: {
                var4 = -1L;
                if (~((o) this).field_f <= ~((long)((o) this).field_b + ((o) this).field_e)) {
                  break L6;
                } else {
                  if (~(((o) this).field_e - -(long)((o) this).field_b) < ~(((o) this).field_f + (long)((o) this).field_j)) {
                    break L6;
                  } else {
                    var4 = ((o) this).field_e - -(long)((o) this).field_b;
                    break L5;
                  }
                }
              }
              if (((o) this).field_f - -(long)((o) this).field_j <= ((o) this).field_e) {
                break L5;
              } else {
                if (~(((o) this).field_e - -(long)((o) this).field_b) <= ~((long)((o) this).field_j + ((o) this).field_f)) {
                  var4 = ((o) this).field_f + (long)((o) this).field_j;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (var2 <= -1L) {
                break L7;
              } else {
                if (var2 < var4) {
                  var6 = (int)(var4 + -var2);
                  dk.a(((o) this).field_g, (int)(var2 - ((o) this).field_e), ((o) this).field_a, (int)(-((o) this).field_f + var2), var6);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            ((o) this).field_b = 0;
            ((o) this).field_e = -1L;
            break L0;
          } else {
            break L0;
          }
        }
        L8: {
          if (param0 > 45) {
            break L8;
          } else {
            o.b(77);
            break L8;
          }
        }
    }

    final long b(boolean param0) {
        if (!param0) {
            return -35L;
        }
        return ((o) this).field_l;
    }

    final void a(boolean param0) throws IOException {
        this.c(116);
        ((o) this).field_d.a((byte) -118);
        if (param0) {
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        int var5_int = 0;
        long var5_long = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var10 = Torquing.field_u;
        try {
          L0: {
            L1: {
              if (((o) this).field_i + (long)param1 > ((o) this).field_l) {
                ((o) this).field_l = (long)param1 + ((o) this).field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (((o) this).field_e == -1L) {
                break L2;
              } else {
                if (((o) this).field_i >= ((o) this).field_e) {
                  if (((o) this).field_e + (long)((o) this).field_b >= ((o) this).field_i) {
                    break L2;
                  } else {
                    this.c(100);
                    break L2;
                  }
                } else {
                  this.c(100);
                  break L2;
                }
              }
            }
            L3: {
              if (((o) this).field_e == -1L) {
                break L3;
              } else {
                if (~(((o) this).field_i + (long)param1) < ~((long)((o) this).field_g.length + ((o) this).field_e)) {
                  var5_int = (int)((long)((o) this).field_g.length - (((o) this).field_i + -((o) this).field_e));
                  dk.a(param3, param2, ((o) this).field_g, (int)(((o) this).field_i - ((o) this).field_e), var5_int);
                  param1 = param1 - var5_int;
                  ((o) this).field_i = ((o) this).field_i + (long)var5_int;
                  param2 = param2 + var5_int;
                  ((o) this).field_b = ((o) this).field_g.length;
                  this.c(55);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (((o) this).field_g.length >= param1) {
              if (param1 > 0) {
                L4: {
                  if (((o) this).field_e != -1L) {
                    break L4;
                  } else {
                    ((o) this).field_e = ((o) this).field_i;
                    break L4;
                  }
                }
                L5: {
                  dk.a(param3, param2, ((o) this).field_g, (int)(-((o) this).field_e + ((o) this).field_i), param1);
                  ((o) this).field_i = ((o) this).field_i + (long)param1;
                  if (~(long)((o) this).field_b <= ~(-((o) this).field_e + ((o) this).field_i)) {
                    break L5;
                  } else {
                    ((o) this).field_b = (int)(((o) this).field_i - ((o) this).field_e);
                    break L5;
                  }
                }
                return;
              } else {
                L6: {
                  if (param0 == -1) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                break L0;
              }
            } else {
              L7: {
                if (((o) this).field_i != ((o) this).field_h) {
                  ((o) this).field_d.a(-2, ((o) this).field_i);
                  ((o) this).field_h = ((o) this).field_i;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                ((o) this).field_d.a(param1, 2, param2, param3);
                ((o) this).field_h = ((o) this).field_h + (long)param1;
                if (~((o) this).field_h < ~((o) this).field_k) {
                  ((o) this).field_k = ((o) this).field_h;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                L10: {
                  var5_long = -1L;
                  if (((o) this).field_i < ((o) this).field_f) {
                    break L10;
                  } else {
                    if (~(((o) this).field_f + (long)((o) this).field_j) >= ~((o) this).field_i) {
                      break L10;
                    } else {
                      var5_long = ((o) this).field_i;
                      break L9;
                    }
                  }
                }
                if (((o) this).field_i > ((o) this).field_f) {
                  break L9;
                } else {
                  if (~(((o) this).field_i + (long)param1) < ~((o) this).field_f) {
                    var5_long = ((o) this).field_f;
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L11: {
                L12: {
                  var7 = -1L;
                  if (((o) this).field_i - -(long)param1 <= ((o) this).field_f) {
                    break L12;
                  } else {
                    if (~((long)param1 + ((o) this).field_i) >= ~((long)((o) this).field_j + ((o) this).field_f)) {
                      var7 = (long)param1 + ((o) this).field_i;
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
                if (((o) this).field_f + (long)((o) this).field_j <= ((o) this).field_i) {
                  break L11;
                } else {
                  if ((long)param1 + ((o) this).field_i < ((o) this).field_f + (long)((o) this).field_j) {
                    break L11;
                  } else {
                    var7 = (long)((o) this).field_j + ((o) this).field_f;
                    break L11;
                  }
                }
              }
              L13: {
                if (var5_long <= -1L) {
                  break L13;
                } else {
                  if (~var5_long > ~var7) {
                    var9 = (int)(var7 + -var5_long);
                    dk.a(param3, (int)((long)param2 - -var5_long + -((o) this).field_i), ((o) this).field_a, (int)(-((o) this).field_f + var5_long), var9);
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
              ((o) this).field_i = ((o) this).field_i + (long)param1;
              return;
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((o) this).field_h = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L14: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var5_ref;
            stackOut_53_1 = new StringBuilder().append("o.I(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_55_0 = stackOut_53_0;
            stackIn_55_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param3 == null) {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "null";
              stackIn_56_0 = stackOut_55_0;
              stackIn_56_1 = stackOut_55_1;
              stackIn_56_2 = stackOut_55_2;
              break L14;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_56_0 = stackOut_54_0;
              stackIn_56_1 = stackOut_54_1;
              stackIn_56_2 = stackOut_54_2;
              break L14;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_56_0, stackIn_56_2 + 41);
        }
    }

    public static void b(int param0) {
        if (param0 != -1) {
            field_c = null;
        }
        field_c = null;
    }

    private final void a(int param0) throws IOException {
        int var2 = 0;
        int var3 = 0;
        int var4 = Torquing.field_u;
        ((o) this).field_j = 0;
        if (!(((o) this).field_i == ((o) this).field_h)) {
            ((o) this).field_d.a(-2, ((o) this).field_i);
            ((o) this).field_h = ((o) this).field_i;
        }
        ((o) this).field_f = ((o) this).field_i;
        while (((o) this).field_a.length > ((o) this).field_j) {
            var2 = -((o) this).field_j + ((o) this).field_a.length;
            if (!(var2 <= 200000000)) {
                var2 = 200000000;
            }
            var3 = ((o) this).field_d.a(var2, ((o) this).field_j, ((o) this).field_a, 15389);
            if (var3 == -1) {
                break;
            }
            ((o) this).field_h = ((o) this).field_h + (long)var3;
            ((o) this).field_j = ((o) this).field_j + var3;
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        IOException var5 = null;
        RuntimeException var5_ref = null;
        long var5_long = 0L;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        int var15 = 0;
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
        var15 = Torquing.field_u;
        try {
          L0: {
            if (param1.length < param2 + param0) {
              throw new ArrayIndexOutOfBoundsException(-param1.length + param2 + param0);
            } else {
              L1: {
                if (-1L == ((o) this).field_e) {
                  break L1;
                } else {
                  if (((o) this).field_i < ((o) this).field_e) {
                    break L1;
                  } else {
                    if (((o) this).field_e - -(long)((o) this).field_b >= ((o) this).field_i - -(long)param2) {
                      dk.a(((o) this).field_g, (int)(-((o) this).field_e + ((o) this).field_i), param1, param0, param2);
                      ((o) this).field_i = ((o) this).field_i + (long)param2;
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              L2: {
                var8 = 76 / ((param3 - 1) / 44);
                var5_long = ((o) this).field_i;
                var7 = param0;
                var9 = param2;
                if (~((o) this).field_f < ~((o) this).field_i) {
                  break L2;
                } else {
                  if ((long)((o) this).field_j + ((o) this).field_f <= ((o) this).field_i) {
                    break L2;
                  } else {
                    L3: {
                      var10_int = (int)(((o) this).field_f + -((o) this).field_i + (long)((o) this).field_j);
                      if (var10_int <= param2) {
                        break L3;
                      } else {
                        var10_int = param2;
                        break L3;
                      }
                    }
                    dk.a(((o) this).field_a, (int)(-((o) this).field_f + ((o) this).field_i), param1, param0, var10_int);
                    ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                    param2 = param2 - var10_int;
                    param0 = param0 + var10_int;
                    break L2;
                  }
                }
              }
              L4: {
                if (~((o) this).field_a.length <= ~param2) {
                  if (0 >= param2) {
                    break L4;
                  } else {
                    L5: {
                      this.a(-70);
                      var10_int = param2;
                      if (var10_int > ((o) this).field_j) {
                        var10_int = ((o) this).field_j;
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    dk.a(((o) this).field_a, 0, param1, param0, var10_int);
                    param2 = param2 - var10_int;
                    ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                    param0 = param0 + var10_int;
                    break L4;
                  }
                } else {
                  ((o) this).field_d.a(-2, ((o) this).field_i);
                  ((o) this).field_h = ((o) this).field_i;
                  L6: while (true) {
                    if (param2 <= 0) {
                      break L4;
                    } else {
                      var10_int = ((o) this).field_d.a(param2, param0, param1, 15389);
                      if (var10_int != -1) {
                        param0 = param0 + var10_int;
                        ((o) this).field_i = ((o) this).field_i + (long)var10_int;
                        param2 = param2 - var10_int;
                        ((o) this).field_h = ((o) this).field_h + (long)var10_int;
                        continue L6;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              L7: {
                if (((o) this).field_e != -1L) {
                  L8: {
                    if (((o) this).field_i >= ((o) this).field_e) {
                      break L8;
                    } else {
                      if (param2 > 0) {
                        L9: {
                          var10_int = (int)(((o) this).field_e - ((o) this).field_i) + param0;
                          if (~(param2 + param0) > ~var10_int) {
                            var10_int = param2 + param0;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        L10: while (true) {
                          if (var10_int <= param0) {
                            break L8;
                          } else {
                            param2--;
                            int incrementValue$1 = param0;
                            param0++;
                            param1[incrementValue$1] = (byte) 0;
                            ((o) this).field_i = ((o) this).field_i + 1L;
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
                      var10 = -1L;
                      var12 = -1L;
                      if (var5_long > ((o) this).field_e) {
                        break L12;
                      } else {
                        if (~((o) this).field_e <= ~((long)var9 + var5_long)) {
                          break L12;
                        } else {
                          var10 = ((o) this).field_e;
                          break L11;
                        }
                      }
                    }
                    if (var5_long < ((o) this).field_e) {
                      break L11;
                    } else {
                      if (~var5_long <= ~(((o) this).field_e + (long)((o) this).field_b)) {
                        break L11;
                      } else {
                        var10 = var5_long;
                        break L11;
                      }
                    }
                  }
                  L13: {
                    L14: {
                      if (~(((o) this).field_e - -(long)((o) this).field_b) >= ~var5_long) {
                        break L14;
                      } else {
                        if (((o) this).field_e + (long)((o) this).field_b <= var5_long - -(long)var9) {
                          var12 = ((o) this).field_e - -(long)((o) this).field_b;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if ((long)var9 + var5_long <= ((o) this).field_e) {
                      break L13;
                    } else {
                      if ((long)((o) this).field_b + ((o) this).field_e < var5_long + (long)var9) {
                        break L13;
                      } else {
                        var12 = var5_long + (long)var9;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (var10 <= -1L) {
                      break L15;
                    } else {
                      if (var10 >= var12) {
                        break L15;
                      } else {
                        var14 = (int)(-var10 + var12);
                        dk.a(((o) this).field_g, (int)(-((o) this).field_e + var10), param1, var7 - -(int)(var10 - var5_long), var14);
                        if (((o) this).field_i >= var12) {
                          break L15;
                        } else {
                          param2 = (int)((long)param2 - (-((o) this).field_i + var12));
                          ((o) this).field_i = var12;
                          break L15;
                        }
                      }
                    }
                  }
                  break L7;
                } else {
                  break L7;
                }
              }
              if (param2 > 0) {
                throw new EOFException();
              } else {
                break L0;
              }
            }
          }
        } catch (java.io.IOException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = (IOException) (Object) decompiledCaughtException;
          ((o) this).field_h = -1L;
          throw var5;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L16: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_59_0 = (RuntimeException) var5_ref;
            stackOut_59_1 = new StringBuilder().append("o.H(").append(param0).append(44);
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
              break L16;
            } else {
              stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
              stackOut_60_1 = (StringBuilder) (Object) stackIn_60_1;
              stackOut_60_2 = "{...}";
              stackIn_62_0 = stackOut_60_0;
              stackIn_62_1 = stackOut_60_1;
              stackIn_62_2 = stackOut_60_2;
              break L16;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_62_0, stackIn_62_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        if (!(param1 >= 0L)) {
            throw new IOException();
        }
        ((o) this).field_i = param1;
        if (param0) {
            o.b(116);
        }
    }

    final void a(int param0, byte[] param1) throws IOException {
        try {
            if (param0 != -1) {
                field_c = null;
            }
            ((o) this).a(0, param1, param1.length, -78);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "o.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    o(ue param0, int param1, int param2) throws IOException {
        ((o) this).field_e = -1L;
        ((o) this).field_f = -1L;
        ((o) this).field_b = 0;
        try {
            ((o) this).field_d = param0;
            long dupTemp$0 = param0.b((byte) 94);
            ((o) this).field_k = dupTemp$0;
            ((o) this).field_l = dupTemp$0;
            ((o) this).field_i = 0L;
            ((o) this).field_g = new byte[param2];
            ((o) this).field_a = new byte[param1];
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "o.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Your email address is used to identify this account";
    }
}
