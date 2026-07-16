/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ad implements Runnable {
    private int field_f;
    private boolean field_p;
    private boolean field_n;
    private byte[] field_a;
    private nj field_d;
    static int field_h;
    static String field_o;
    static hd field_b;
    private int field_j;
    private InputStream field_l;
    private java.net.Socket field_e;
    private dl field_k;
    static String[] field_c;
    private OutputStream field_g;
    static int field_m;
    private int field_i;

    public static void a(byte param0) {
        field_o = null;
        field_b = null;
        if (param0 < 64) {
            field_c = null;
            field_c = null;
            return;
        }
        field_c = null;
    }

    final static boolean a(byte param0, String param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 >= -11) {
          L0: {
            field_o = null;
            if (mc.a(param1, (byte) 105) == null) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (mc.a(param1, (byte) 105) == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Throwable var7 = null;
        int var8 = 0;
        Throwable decompiledCaughtException = null;
        var8 = SolKnight.field_L ? 1 : 0;
        if (!((ad) this).field_n) {
          if (!((ad) this).field_p) {
            L0: {
              if (((ad) this).field_a == null) {
                ((ad) this).field_a = new byte[((ad) this).field_f];
                break L0;
              } else {
                break L0;
              }
            }
            var5 = this;
            synchronized (var5) {
              L1: {
                var6 = 0;
                L2: while (true) {
                  if (param2 <= var6) {
                    L3: {
                      if (param0 == -28748) {
                        break L3;
                      } else {
                        field_c = null;
                        break L3;
                      }
                    }
                    L4: {
                      if (((ad) this).field_d != null) {
                        break L4;
                      } else {
                        ((ad) this).field_d = ((ad) this).field_k.a(3, -29, (Runnable) this);
                        break L4;
                      }
                    }
                    this.notifyAll();
                    break L1;
                  } else {
                    ((ad) this).field_a[((ad) this).field_j] = param3[param1 + var6];
                    ((ad) this).field_j = (1 + ((ad) this).field_j) % ((ad) this).field_f;
                    if (((ad) this).field_j != (-100 + (((ad) this).field_f + ((ad) this).field_i)) % ((ad) this).field_f) {
                      var6++;
                      continue L2;
                    } else {
                      throw new IOException();
                    }
                  }
                }
              }
            }
            return;
          } else {
            ((ad) this).field_p = false;
            throw new IOException();
          }
        } else {
          return;
        }
    }

    final void a(boolean param0) throws IOException {
        if (param0) {
          if (!((ad) this).field_n) {
            if (((ad) this).field_p) {
              ((ad) this).field_p = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((ad) this).run();
          if (!((ad) this).field_n) {
            if (((ad) this).field_p) {
              ((ad) this).field_p = false;
              throw new IOException();
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final int b(int param0) throws IOException {
        if (param0 != -30119) {
            Object var3 = null;
            boolean discarded$4 = ad.a((byte) -118, (String) null);
            if (!(!((ad) this).field_n)) {
                return 0;
            }
            return ((ad) this).field_l.available();
        }
        if (!(!((ad) this).field_n)) {
            return 0;
        }
        return ((ad) this).field_l.available();
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            Throwable decompiledCaughtException = null;
            var6 = SolKnight.field_L ? 1 : 0;
            try {
              L0: {
                L1: while (true) {
                  L2: {
                    var3 = this;
                    if (((ad) this).field_i != ((ad) this).field_j) {
                      break L2;
                    } else {
                      if (((ad) this).field_n) {
                        try {
                          L3: {
                            L4: {
                              if (((ad) this).field_l == null) {
                                break L4;
                              } else {
                                ((ad) this).field_l.close();
                                break L4;
                              }
                            }
                            L5: {
                              if (null == ((ad) this).field_g) {
                                break L5;
                              } else {
                                ((ad) this).field_g.close();
                                break L5;
                              }
                            }
                            L6: {
                              if (null != ((ad) this).field_e) {
                                ((ad) this).field_e.close();
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            break L3;
                          }
                        } catch (java.io.IOException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L7: {
                            var1 = (IOException) (Object) decompiledCaughtException;
                            break L7;
                          }
                        }
                        ((ad) this).field_a = null;
                        break L0;
                      } else {
                        this.wait();
                        break L2;
                      }
                    }
                  }
                  L8: {
                    var2 = ((ad) this).field_i;
                    if (((ad) this).field_j >= ((ad) this).field_i) {
                      var1_int = -((ad) this).field_i + ((ad) this).field_j;
                      break L8;
                    } else {
                      var1_int = ((ad) this).field_f + -((ad) this).field_i;
                      break L8;
                    }
                  }
                  if (-1 <= (var1_int ^ -1)) {
                    continue L1;
                  } else {
                    try {
                      L9: {
                        ((ad) this).field_g.write(((ad) this).field_a, var2, var1_int);
                        break L9;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L10: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((ad) this).field_p = true;
                        break L10;
                      }
                    }
                    ((ad) this).field_i = (var1_int + ((ad) this).field_i) % ((ad) this).field_f;
                    try {
                      L11: {
                        L12: {
                          if (((ad) this).field_i != ((ad) this).field_j) {
                            break L12;
                          } else {
                            ((ad) this).field_g.flush();
                            break L12;
                          }
                        }
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var3_ref = (IOException) (Object) decompiledCaughtException;
                        ((ad) this).field_p = true;
                        break L13;
                      }
                    }
                    continue L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              L14: {
                var1_ref = (Exception) (Object) decompiledCaughtException;
                var7 = null;
                hi.a((Throwable) (Object) var1_ref, (String) null, 1);
                break L14;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    ad(java.net.Socket param0, dl param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static int a(int param0, int param1, int param2) {
        if (null != dh.field_j) {
          if (param2 == 0) {
            L0: {
              if (param1 < sa.field_m) {
                break L0;
              } else {
                if (sa.field_m - -dh.field_j.field_p <= param1) {
                  break L0;
                } else {
                  if (param0 < da.field_f) {
                    break L0;
                  } else {
                    if (dh.field_j.field_t + da.field_f <= param0) {
                      break L0;
                    } else {
                      return 0;
                    }
                  }
                }
              }
            }
            if (ke.field_I <= param1) {
              if (ke.field_I + dh.field_j.field_p > param1) {
                if (lk.field_c <= param0) {
                  if (param0 < dh.field_j.field_t + lk.field_c) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          } else {
            field_b = null;
            if (param1 >= sa.field_m) {
              if (sa.field_m - -dh.field_j.field_p > param1) {
                L1: {
                  if (param0 < da.field_f) {
                    break L1;
                  } else {
                    if (dh.field_j.field_t + da.field_f <= param0) {
                      break L1;
                    } else {
                      return 0;
                    }
                  }
                }
                if (ke.field_I <= param1) {
                  if (ke.field_I + dh.field_j.field_p > param1) {
                    if (lk.field_c <= param0) {
                      if (param0 < dh.field_j.field_t + lk.field_c) {
                        return 1;
                      } else {
                        return -1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                if (ke.field_I <= param1) {
                  if (ke.field_I + dh.field_j.field_p > param1) {
                    if (lk.field_c <= param0) {
                      if (param0 >= dh.field_j.field_t + lk.field_c) {
                        return -1;
                      } else {
                        return 1;
                      }
                    } else {
                      return -1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              }
            } else {
              if (ke.field_I <= param1) {
                if (ke.field_I + dh.field_j.field_p > param1) {
                  if (lk.field_c <= param0) {
                    if (param0 >= dh.field_j.field_t + lk.field_c) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    return -1;
                  }
                } else {
                  return -1;
                }
              } else {
                return -1;
              }
            }
          }
        } else {
          return -1;
        }
    }

    final int a(int param0) throws IOException {
        if (((ad) this).field_n) {
            return 0;
        }
        if (param0 > -104) {
            ((ad) this).run();
            return ((ad) this).field_l.read();
        }
        return ((ad) this).field_l.read();
    }

    protected final void finalize() {
        ((ad) this).d(2);
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = 0;
        int var6 = SolKnight.field_L ? 1 : 0;
        if (!(!((ad) this).field_n)) {
            return;
        }
        while (-1 > (param2 ^ -1)) {
            var5 = ((ad) this).field_l.read(param3, param1, param2);
            if (-1 <= (var5 ^ -1)) {
                throw new EOFException();
            }
            param2 = param2 - var5;
            param1 = param1 + var5;
        }
        if (param0 <= 32) {
            ((ad) this).field_l = null;
            return;
        }
    }

    final static pc b(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var6 = SolKnight.field_L ? 1 : 0;
        var2 = param1.length();
        if (-1 == (var2 ^ -1)) {
          return h.field_a;
        } else {
          if (64 >= var2) {
            if (param1.charAt(0) != 34) {
              var3 = 0;
              var4 = 0;
              L0: while (true) {
                if (var2 > var4) {
                  var5 = param1.charAt(var4);
                  if (var5 == 46) {
                    L1: {
                      if (0 == var4) {
                        break L1;
                      } else {
                        if (-1 + var2 == var4) {
                          break L1;
                        } else {
                          if (var3 == 0) {
                            var3 = 1;
                            var4++;
                            continue L0;
                          } else {
                            break L1;
                          }
                        }
                      }
                    }
                    return si.field_C;
                  } else {
                    if (0 == (ab.field_q.indexOf(var5) ^ -1)) {
                      return si.field_C;
                    } else {
                      var3 = 0;
                      var4++;
                      continue L0;
                    }
                  }
                } else {
                  var4 = 107 % ((param0 - -79) / 45);
                  return null;
                }
              }
            } else {
              if (param1.charAt(var2 + -1) == 34) {
                var3 = 0;
                var4 = 1;
                L2: while (true) {
                  if (var2 + -1 > var4) {
                    var5 = param1.charAt(var4);
                    if (var5 != 92) {
                      L3: {
                        if (var5 != 34) {
                          break L3;
                        } else {
                          if (var3 == 0) {
                            return si.field_C;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var3 = 0;
                      var4++;
                      continue L2;
                    } else {
                      L4: {
                        if (var3 != 0) {
                          stackOut_14_0 = 0;
                          stackIn_15_0 = stackOut_14_0;
                          break L4;
                        } else {
                          stackOut_13_0 = 1;
                          stackIn_15_0 = stackOut_13_0;
                          break L4;
                        }
                      }
                      var3 = stackIn_15_0;
                      var4++;
                      continue L2;
                    }
                  } else {
                    return null;
                  }
                }
              } else {
                return si.field_C;
              }
            }
          } else {
            return el.field_o;
          }
        }
    }

    final static int c(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = SolKnight.field_L ? 1 : 0;
        var1 = 0;
        var2 = 0;
        if (param0 <= 64) {
          field_b = null;
          L0: while (true) {
            if (!wk.a((byte) -56)) {
              L1: {
                bc.field_K.a(-121, uc.a(gb.field_j, 1691746689, field_m), uc.a(db.field_o, 1691746689, s.field_gb));
                if (bc.field_K.d((byte) -36)) {
                  var1 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              var3 = 0;
              if (var1 != 0) {
                if (-1 >= (bc.field_K.field_f ^ -1)) {
                  L2: {
                    var3 = fl.field_b[bc.field_K.field_f];
                    if (var3 == 2) {
                      kh.a(-78);
                      break L2;
                    } else {
                      if (5 == var3) {
                        kh.a(-78);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (0 != var3) {
                      break L3;
                    } else {
                      if (te.field_M != 2) {
                        break L3;
                      } else {
                        var4 = je.a(1) + -fg.field_f;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (0 >= var6) {
                          hc.a(true, true, 5);
                          var3 = 2;
                          break L3;
                        } else {
                          return var3;
                        }
                      }
                    }
                  }
                  return var3;
                } else {
                  L4: {
                    if (var2 == 0) {
                      break L4;
                    } else {
                      if (te.field_M == 2) {
                        break L4;
                      } else {
                        kh.a(-89);
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (0 != var3) {
                      break L5;
                    } else {
                      if (te.field_M != 2) {
                        break L5;
                      } else {
                        var4 = je.a(1) + -fg.field_f;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (0 >= var6) {
                          hc.a(true, true, 5);
                          var3 = 2;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  return var3;
                }
              } else {
                L6: {
                  if (var2 == 0) {
                    break L6;
                  } else {
                    if (te.field_M == 2) {
                      break L6;
                    } else {
                      kh.a(-89);
                      break L6;
                    }
                  }
                }
                L7: {
                  if (0 != var3) {
                    break L7;
                  } else {
                    if (te.field_M != 2) {
                      break L7;
                    } else {
                      var4 = je.a(1) + -fg.field_f;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 >= var6) {
                        hc.a(true, true, 5);
                        var3 = 2;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                return var3;
              }
            } else {
              L8: {
                bc.field_K.a(true);
                if (bc.field_K.d((byte) -38)) {
                  var1 = 1;
                  break L8;
                } else {
                  break L8;
                }
              }
              if (13 == el.field_n) {
                var2 = 1;
                continue L0;
              } else {
                continue L0;
              }
            }
          }
        } else {
          L9: while (true) {
            if (!wk.a((byte) -56)) {
              L10: {
                bc.field_K.a(-121, uc.a(gb.field_j, 1691746689, field_m), uc.a(db.field_o, 1691746689, s.field_gb));
                if (bc.field_K.d((byte) -36)) {
                  var1 = 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              var3 = 0;
              if (var1 != 0) {
                if (-1 >= (bc.field_K.field_f ^ -1)) {
                  var3 = fl.field_b[bc.field_K.field_f];
                  if (var3 == 2) {
                    kh.a(-78);
                    if (0 == var3) {
                      if (te.field_M == 2) {
                        var4 = je.a(1) + -fg.field_f;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (0 < var6) {
                          return var3;
                        } else {
                          hc.a(true, true, 5);
                          var3 = 2;
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    if (5 == var3) {
                      L11: {
                        kh.a(-78);
                        if (0 != var3) {
                          break L11;
                        } else {
                          if (te.field_M != 2) {
                            break L11;
                          } else {
                            var4 = je.a(1) + -fg.field_f;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (0 >= var6) {
                              hc.a(true, true, 5);
                              var3 = 2;
                              break L11;
                            } else {
                              return var3;
                            }
                          }
                        }
                      }
                      return var3;
                    } else {
                      if (0 == var3) {
                        if (te.field_M == 2) {
                          var4 = je.a(1) + -fg.field_f;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (0 < var6) {
                            return var3;
                          } else {
                            hc.a(true, true, 5);
                            var3 = 2;
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                } else {
                  L12: {
                    if (var2 == 0) {
                      break L12;
                    } else {
                      if (te.field_M == 2) {
                        break L12;
                      } else {
                        kh.a(-89);
                        if (0 == var3) {
                          if (te.field_M == 2) {
                            var4 = je.a(1) + -fg.field_f;
                            var6 = (int)((-var4 + 10999L) / 1000L);
                            if (0 >= var6) {
                              hc.a(true, true, 5);
                              var3 = 2;
                              return var3;
                            } else {
                              return var3;
                            }
                          } else {
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      }
                    }
                  }
                  if (0 == var3) {
                    if (te.field_M == 2) {
                      var4 = je.a(1) + -fg.field_f;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (0 >= var6) {
                        hc.a(true, true, 5);
                        var3 = 2;
                        return var3;
                      } else {
                        return var3;
                      }
                    } else {
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                }
              } else {
                L13: {
                  if (var2 == 0) {
                    break L13;
                  } else {
                    if (te.field_M == 2) {
                      break L13;
                    } else {
                      kh.a(-89);
                      if (0 == var3) {
                        if (te.field_M == 2) {
                          var4 = je.a(1) + -fg.field_f;
                          var6 = (int)((-var4 + 10999L) / 1000L);
                          if (0 < var6) {
                            return var3;
                          } else {
                            hc.a(true, true, 5);
                            var3 = 2;
                            return var3;
                          }
                        } else {
                          return var3;
                        }
                      } else {
                        return var3;
                      }
                    }
                  }
                }
                if (0 == var3) {
                  if (te.field_M == 2) {
                    var4 = je.a(1) + -fg.field_f;
                    var6 = (int)((-var4 + 10999L) / 1000L);
                    if (0 < var6) {
                      return var3;
                    } else {
                      hc.a(true, true, 5);
                      var3 = 2;
                      return var3;
                    }
                  } else {
                    return var3;
                  }
                } else {
                  return var3;
                }
              }
            } else {
              L14: {
                bc.field_K.a(true);
                if (bc.field_K.d((byte) -38)) {
                  var1 = 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              if (13 == el.field_n) {
                var2 = 1;
                continue L9;
              } else {
                continue L9;
              }
            }
          }
        }
    }

    final void d(int param0) {
        Object var2 = null;
        InterruptedException var2_ref = null;
        Throwable var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        if (!((ad) this).field_n) {
          var2 = this;
          synchronized (var2) {
            L0: {
              L1: {
                if (param0 == 2) {
                  break L1;
                } else {
                  field_m = -24;
                  break L1;
                }
              }
              ((ad) this).field_n = true;
              this.notifyAll();
              break L0;
            }
          }
          if (null != ((ad) this).field_d) {
            L2: while (true) {
              if (0 != ((ad) this).field_d.field_c) {
                L3: {
                  if (-2 != (((ad) this).field_d.field_c ^ -1)) {
                    break L3;
                  } else {
                    try {
                      L4: {
                        ((Thread) ((ad) this).field_d.field_e).join();
                        decompiledRegionSelector0 = 0;
                        break L4;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                        decompiledRegionSelector0 = 1;
                        break L5;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      ((ad) this).field_d = null;
                      return;
                    } else {
                      break L3;
                    }
                  }
                }
                ((ad) this).field_d = null;
                return;
              } else {
                i.a((byte) 56, 1L);
                continue L2;
              }
            }
          } else {
            ((ad) this).field_d = null;
            return;
          }
        } else {
          return;
        }
    }

    private ad(java.net.Socket param0, dl param1, int param2) throws IOException {
        ((ad) this).field_n = false;
        ((ad) this).field_j = 0;
        ((ad) this).field_i = 0;
        ((ad) this).field_p = false;
        ((ad) this).field_k = param1;
        ((ad) this).field_e = param0;
        ((ad) this).field_e.setSoTimeout(30000);
        ((ad) this).field_e.setTcpNoDelay(true);
        ((ad) this).field_l = ((ad) this).field_e.getInputStream();
        ((ad) this).field_g = ((ad) this).field_e.getOutputStream();
        ((ad) this).field_f = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Friends can be added in multiplayer<nbsp>games";
        field_c = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_m = 0;
    }
}
