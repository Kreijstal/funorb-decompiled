/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    private be field_g;
    static String[] field_f;
    private java.net.URL field_l;
    private ce field_h;
    static mk field_e;
    private ce field_i;
    static String field_b;
    private uf field_c;
    private int field_j;
    private ce field_k;
    private DataInputStream field_a;
    static qj field_d;

    final be a(int param0) {
        if (param0 != -5) {
            return (be) null;
        }
        if (!(-4 != (this.field_j ^ -1))) {
            return this.field_g;
        }
        return null;
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!param0) {
              stackOut_3_0 = mb.a(55, param1, 10, true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("ej.E(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        Throwable decompiledCaughtException = null;
        if (-3 >= (this.field_j ^ -1)) {
          return true;
        } else {
          L0: {
            if (-1 == (this.field_j ^ -1)) {
              L1: {
                if (null == this.field_i) {
                  this.field_i = this.field_c.a(false, this.field_l);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (-1 == (this.field_i.field_f ^ -1)) {
                return false;
              } else {
                if ((this.field_i.field_f ^ -1) != -2) {
                  this.field_j = this.field_j + 1;
                  this.field_i = null;
                  return false;
                } else {
                  break L0;
                }
              }
            } else {
              break L0;
            }
          }
          L2: {
            if (this.field_j != 1) {
              break L2;
            } else {
              L3: {
                if (null != this.field_h) {
                  break L3;
                } else {
                  this.field_h = this.field_c.a(55, 443, this.field_l.getHost());
                  break L3;
                }
              }
              if (-1 == (this.field_h.field_f ^ -1)) {
                return false;
              } else {
                if (this.field_h.field_f != 1) {
                  this.field_j = this.field_j + 1;
                  this.field_h = null;
                  return false;
                } else {
                  break L2;
                }
              }
            }
          }
          if (this.field_a == null) {
            try {
              L4: {
                L5: {
                  if (0 != this.field_j) {
                    break L5;
                  } else {
                    this.field_a = (DataInputStream) (this.field_i.field_e);
                    break L5;
                  }
                }
                L6: {
                  if (1 == this.field_j) {
                    var4 = (java.net.Socket) (this.field_h.field_e);
                    var4.setSoTimeout(10000);
                    var3 = var4.getOutputStream();
                    var3.write(17);
                    var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_l.getFile() + "\n\n"));
                    var3.write(bc.a((byte) -6, var5));
                    this.field_a = new DataInputStream(var4.getInputStream());
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_g.field_k = 0;
                break L4;
              }
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var2 = (IOException) (Object) decompiledCaughtException;
                this.finalize();
                this.field_j = this.field_j + 1;
                if (null == this.field_k) {
                  this.field_k = this.field_c.a(5, (Runnable) (this), 72);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (-1 == (this.field_k.field_f ^ -1)) {
                return false;
              } else {
                if (param0 >= 72) {
                  if (-2 != (this.field_k.field_f ^ -1)) {
                    this.finalize();
                    this.field_j = this.field_j + 1;
                    return false;
                  } else {
                    return false;
                  }
                } else {
                  this.finalize();
                  if (-2 == (this.field_k.field_f ^ -1)) {
                    return false;
                  } else {
                    this.finalize();
                    this.field_j = this.field_j + 1;
                    return false;
                  }
                }
              }
            }
            L8: {
              if (null == this.field_k) {
                this.field_k = this.field_c.a(5, (Runnable) (this), 72);
                break L8;
              } else {
                break L8;
              }
            }
            if (-1 == (this.field_k.field_f ^ -1)) {
              return false;
            } else {
              L9: {
                if (param0 >= 72) {
                  break L9;
                } else {
                  this.finalize();
                  break L9;
                }
              }
              L10: {
                if (-2 == (this.field_k.field_f ^ -1)) {
                  break L10;
                } else {
                  this.finalize();
                  this.field_j = this.field_j + 1;
                  break L10;
                }
              }
              return false;
            }
          } else {
            L11: {
              if (null == this.field_k) {
                this.field_k = this.field_c.a(5, (Runnable) (this), 72);
                break L11;
              } else {
                break L11;
              }
            }
            if (-1 == (this.field_k.field_f ^ -1)) {
              return false;
            } else {
              L12: {
                if (param0 >= 72) {
                  break L12;
                } else {
                  this.finalize();
                  break L12;
                }
              }
              if (-2 != (this.field_k.field_f ^ -1)) {
                this.finalize();
                this.field_j = this.field_j + 1;
                return false;
              } else {
                return false;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        ob.field_u = null;
        w.field_V = null;
        rf.field_c = 0;
        var2 = ga.field_e;
        ga.field_e = fj.field_T;
        fj.field_T = var2;
        if (param0 > 8) {
          rj.field_d.field_e = rj.field_d.field_e + 1;
          if (param1 == 51) {
            rj.field_d.field_b = 2;
            if (-3 < (rj.field_d.field_e ^ -1)) {
              if (-3 < (rj.field_d.field_e ^ -1)) {
                if ((rj.field_d.field_e ^ -1) > -5) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (-51 == (param1 ^ -1)) {
                  return 5;
                } else {
                  if ((rj.field_d.field_e ^ -1) > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if ((param1 ^ -1) == -52) {
                return 2;
              } else {
                if (-3 < (rj.field_d.field_e ^ -1)) {
                  if ((rj.field_d.field_e ^ -1) > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          } else {
            if ((param1 ^ -1) != -51) {
              rj.field_d.field_b = 1;
              if (-3 < (rj.field_d.field_e ^ -1)) {
                if (-3 < (rj.field_d.field_e ^ -1)) {
                  if ((rj.field_d.field_e ^ -1) > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if ((param1 ^ -1) == -52) {
                  return 2;
                } else {
                  if (-3 >= (rj.field_d.field_e ^ -1)) {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      if ((rj.field_d.field_e ^ -1) > -5) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            } else {
              rj.field_d.field_b = 5;
              if (-3 < (rj.field_d.field_e ^ -1)) {
                if (-3 < (rj.field_d.field_e ^ -1)) {
                  if ((rj.field_d.field_e ^ -1) > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                if ((param1 ^ -1) == -52) {
                  return 2;
                } else {
                  if (-3 < (rj.field_d.field_e ^ -1)) {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      if ((rj.field_d.field_e ^ -1) > -5) {
                        return -1;
                      } else {
                        return 1;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          field_b = (String) null;
          rj.field_d.field_e = rj.field_d.field_e + 1;
          if (param1 == 51) {
            rj.field_d.field_b = 2;
            if (-3 >= (rj.field_d.field_e ^ -1)) {
              if ((param1 ^ -1) == -52) {
                return 2;
              } else {
                if (-3 >= (rj.field_d.field_e ^ -1)) {
                  if (-51 == (param1 ^ -1)) {
                    return 5;
                  } else {
                    if ((rj.field_d.field_e ^ -1) > -5) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if ((rj.field_d.field_e ^ -1) > -5) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (-3 < (rj.field_d.field_e ^ -1)) {
                if ((rj.field_d.field_e ^ -1) > -5) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (-51 != (param1 ^ -1)) {
                  if ((rj.field_d.field_e ^ -1) <= -5) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          } else {
            if ((param1 ^ -1) != -51) {
              rj.field_d.field_b = 1;
              if (-3 >= (rj.field_d.field_e ^ -1)) {
                if ((param1 ^ -1) == -52) {
                  return 2;
                } else {
                  if (-3 >= (rj.field_d.field_e ^ -1)) {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      if ((rj.field_d.field_e ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    if ((rj.field_d.field_e ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L0: {
                  if (-3 < (rj.field_d.field_e ^ -1)) {
                    break L0;
                  } else {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      break L0;
                    }
                  }
                }
                if ((rj.field_d.field_e ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              }
            } else {
              rj.field_d.field_b = 5;
              if (-3 >= (rj.field_d.field_e ^ -1)) {
                if ((param1 ^ -1) == -52) {
                  return 2;
                } else {
                  if (-3 >= (rj.field_d.field_e ^ -1)) {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      if ((rj.field_d.field_e ^ -1) <= -5) {
                        return 1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    if ((rj.field_d.field_e ^ -1) <= -5) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                }
              } else {
                L1: {
                  if (-3 < (rj.field_d.field_e ^ -1)) {
                    break L1;
                  } else {
                    if (-51 == (param1 ^ -1)) {
                      return 5;
                    } else {
                      break L1;
                    }
                  }
                }
                if ((rj.field_d.field_e ^ -1) <= -5) {
                  return 1;
                } else {
                  return -1;
                }
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -55 % ((-73 - param1) / 38);
            stackOut_0_0 = rd.a(8058, true, param2, param0);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("ej.D(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = TrackController.field_F ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_g.field_k >= this.field_g.field_j.length) {
                    break L1;
                  } else {
                    var1_int = this.field_a.read(this.field_g.field_j, this.field_g.field_k, -this.field_g.field_k + this.field_g.field_j.length);
                    if ((var1_int ^ -1) > -1) {
                      break L1;
                    } else {
                      this.field_g.field_k = this.field_g.field_k + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_g.field_j.length == this.field_g.field_k) {
                  throw ej.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_g.field_j.length + " " + this.field_l));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_j = 3;
                      break L2;
                    }
                  }
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var2 = this;
              synchronized (var2) {
                L3: {
                  this.finalize();
                  this.field_j = this.field_j + 1;
                  break L3;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected final void finalize() {
        if (null != this.field_i) {
            if (this.field_i.field_e != null) {
                try {
                    ((DataInputStream) (this.field_i.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_i = null;
        }
        if (null != this.field_h) {
            if (!(null == this.field_h.field_e)) {
                try {
                    ((java.net.Socket) (this.field_h.field_e)).close();
                } catch (Exception exception) {
                }
            }
            this.field_h = null;
        }
        if (!(this.field_a == null)) {
            try {
                this.field_a.close();
            } catch (Exception exception) {
            }
            this.field_a = null;
        }
        this.field_k = null;
    }

    public static void b(int param0) {
        field_b = null;
        field_f = null;
        field_d = null;
        if (param0 != 17) {
            field_e = (mk) null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    ej(uf param0, java.net.URL param1, int param2) {
        try {
            this.field_l = param1;
            this.field_c = param0;
            this.field_g = new be(param2);
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_f = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_b = "Use the arrow keys or mouse to move.";
        field_e = new mk();
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
