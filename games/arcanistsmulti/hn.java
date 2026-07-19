/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hn implements Runnable {
    private int field_b;
    private wk field_h;
    static String field_c;
    private og field_j;
    static vn field_q;
    private java.net.URL field_m;
    static String field_l;
    private og field_a;
    private dl field_n;
    private og field_g;
    static int[] field_k;
    static String field_o;
    static String field_i;
    static qb[] field_d;
    private DataInputStream field_f;
    static int field_p;
    static String field_e;

    public static void a(int param0) {
        field_k = null;
        field_l = null;
        field_i = null;
        field_c = null;
        field_o = null;
        field_d = null;
        int var1 = -7 / ((-28 - param0) / 50);
        field_e = null;
        field_q = null;
    }

    final wk b(int param0) {
        if (param0 != 21496) {
            return (wk) null;
        }
        if (this.field_b != 3) {
            return null;
        }
        return this.field_h;
    }

    final synchronized boolean c(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        if (-3 < (this.field_b ^ -1)) {
          L0: {
            if (-1 != (this.field_b ^ -1)) {
              break L0;
            } else {
              L1: {
                if (this.field_a == null) {
                  this.field_a = this.field_n.a(true, this.field_m);
                  break L1;
                } else {
                  break L1;
                }
              }
              if (0 != this.field_a.field_e) {
                if (1 != this.field_a.field_e) {
                  this.field_b = this.field_b + 1;
                  this.field_a = null;
                  return false;
                } else {
                  break L0;
                }
              } else {
                return false;
              }
            }
          }
          L2: {
            if (-2 == (this.field_b ^ -1)) {
              L3: {
                if (null == this.field_j) {
                  this.field_j = this.field_n.a(443, true, this.field_m.getHost());
                  break L3;
                } else {
                  break L3;
                }
              }
              if (this.field_j.field_e == 0) {
                return false;
              } else {
                if ((this.field_j.field_e ^ -1) == -2) {
                  break L2;
                } else {
                  this.field_j = null;
                  this.field_b = this.field_b + 1;
                  return false;
                }
              }
            } else {
              break L2;
            }
          }
          L4: {
            if (this.field_f != null) {
              break L4;
            } else {
              try {
                L5: {
                  L6: {
                    if (-1 != (this.field_b ^ -1)) {
                      break L6;
                    } else {
                      this.field_f = (DataInputStream) (this.field_a.field_g);
                      break L6;
                    }
                  }
                  L7: {
                    if (-2 == (this.field_b ^ -1)) {
                      var4 = (java.net.Socket) (this.field_j.field_g);
                      var4.setSoTimeout(10000);
                      var3 = var4.getOutputStream();
                      var3.write(17);
                      var5 = (CharSequence) ((Object) ("JAGGRAB " + this.field_m.getFile() + "\n\n"));
                      var3.write(go.a(var5, (byte) -82));
                      this.field_f = new DataInputStream(var4.getInputStream());
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  this.field_h.field_g = 0;
                  decompiledRegionSelector0 = 0;
                  break L5;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L8: {
                  var2 = (IOException) (Object) decompiledCaughtException;
                  this.finalize();
                  this.field_b = this.field_b + 1;
                  decompiledRegionSelector0 = 1;
                  break L8;
                }
              }
              if (decompiledRegionSelector0 == 0) {
                if (param0 < -51) {
                  L9: {
                    if (this.field_g != null) {
                      break L9;
                    } else {
                      this.field_g = this.field_n.a(124, 5, (Runnable) (this));
                      break L9;
                    }
                  }
                  if (this.field_g.field_e == 0) {
                    return false;
                  } else {
                    if (-2 == (this.field_g.field_e ^ -1)) {
                      return false;
                    } else {
                      this.finalize();
                      this.field_b = this.field_b + 1;
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                break L4;
              }
            }
          }
          if (param0 < -51) {
            if (this.field_g != null) {
              if (this.field_g.field_e == 0) {
                return false;
              } else {
                L10: {
                  if (-2 != (this.field_g.field_e ^ -1)) {
                    this.finalize();
                    this.field_b = this.field_b + 1;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                return false;
              }
            } else {
              this.field_g = this.field_n.a(124, 5, (Runnable) (this));
              if (this.field_g.field_e == 0) {
                return false;
              } else {
                L11: {
                  if (-2 != (this.field_g.field_e ^ -1)) {
                    this.finalize();
                    this.field_b = this.field_b + 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return true;
        }
    }

    final static boolean a(char param0, int param1) {
        boolean discarded$1 = false;
        int stackIn_23_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_21_0 = 0;
        if (param1 == 17769) {
          if (param0 < 48) {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param0 <= 90) {
                stackOut_65_0 = 1;
                stackIn_67_0 = stackOut_65_0;
                return stackIn_67_0 != 0;
              } else {
                L0: {
                  L1: {
                    if (param0 < 97) {
                      break L1;
                    } else {
                      if (param0 > 122) {
                        break L1;
                      } else {
                        stackOut_62_0 = 1;
                        stackIn_64_0 = stackOut_62_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_63_0 = 0;
                  stackIn_64_0 = stackOut_63_0;
                  break L0;
                }
                return stackIn_64_0 != 0;
              }
            }
          } else {
            if (57 < param0) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L2: {
                    L3: {
                      if (param0 < 97) {
                        break L3;
                      } else {
                        if (param0 > 122) {
                          break L3;
                        } else {
                          stackOut_48_0 = 1;
                          stackIn_50_0 = stackOut_48_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_49_0 = 0;
                    stackIn_50_0 = stackOut_49_0;
                    break L2;
                  }
                  return stackIn_50_0 != 0;
                } else {
                  stackOut_43_0 = 1;
                  stackIn_45_0 = stackOut_43_0;
                  return stackIn_45_0 != 0;
                }
              }
            } else {
              stackOut_38_0 = 1;
              stackIn_40_0 = stackOut_38_0;
              return stackIn_40_0 != 0;
            }
          }
        } else {
          discarded$1 = hn.a('f', 28);
          if (param0 >= 48) {
            if (57 < param0) {
              if (param0 < 65) {
                if (param0 >= 97) {
                  if (param0 <= 122) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (param0 > 90) {
                  L4: {
                    L5: {
                      if (param0 < 97) {
                        break L5;
                      } else {
                        if (param0 > 122) {
                          break L5;
                        } else {
                          stackOut_26_0 = 1;
                          stackIn_28_0 = stackOut_26_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_27_0 = 0;
                    stackIn_28_0 = stackOut_27_0;
                    break L4;
                  }
                  return stackIn_28_0 != 0;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  return stackIn_23_0 != 0;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 < 65) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              if (param0 > 90) {
                if (param0 >= 97) {
                  if (param0 > 122) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Object var2 = null;
            Throwable var3 = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            var4 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: while (true) {
                L1: {
                  if (this.field_h.field_j.length <= this.field_h.field_g) {
                    break L1;
                  } else {
                    var1_int = this.field_f.read(this.field_h.field_j, this.field_h.field_g, this.field_h.field_j.length + -this.field_h.field_g);
                    if (-1 < (var1_int ^ -1)) {
                      break L1;
                    } else {
                      this.field_h.field_g = this.field_h.field_g + var1_int;
                      continue L0;
                    }
                  }
                }
                if (this.field_h.field_j.length == this.field_h.field_g) {
                  throw hn.<RuntimeException>$cfr$sneakyThrow(new Exception("HG1: " + this.field_h.field_j.length + " " + this.field_m));
                } else {
                  var1 = this;
                  synchronized (var1) {
                    L2: {
                      this.finalize();
                      this.field_b = 3;
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
                  this.field_b = this.field_b + 1;
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

    final static boolean a(byte param0) {
        int var1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_12_0 = 0;
        var1 = 85 % ((param0 - 10) / 60);
        if (jf.field_e) {
          if (pe.field_Jb) {
            if (!be.field_g) {
              if (lc.a((byte) 112)) {
                return true;
              } else {
                return false;
              }
            } else {
              if (!kg.field_a) {
                L0: {
                  if (!lc.a((byte) 112)) {
                    stackOut_17_0 = 0;
                    stackIn_18_0 = stackOut_17_0;
                    break L0;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_18_0 = stackOut_16_0;
                    break L0;
                  }
                }
                return stackIn_18_0 != 0;
              } else {
                stackOut_12_0 = 1;
                stackIn_14_0 = stackOut_12_0;
                return stackIn_14_0 != 0;
              }
            }
          } else {
            if (lc.a((byte) 112)) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          if (lc.a((byte) 112)) {
            return true;
          } else {
            return false;
          }
        }
    }

    protected final void finalize() {
        if (!(this.field_a == null)) {
            if (null != this.field_a.field_g) {
                try {
                    ((DataInputStream) (this.field_a.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_a = null;
        }
        if (this.field_j != null) {
            if (!(this.field_j.field_g == null)) {
                try {
                    ((java.net.Socket) (this.field_j.field_g)).close();
                } catch (Exception exception) {
                }
            }
            this.field_j = null;
        }
        if (!(null == this.field_f)) {
            try {
                this.field_f.close();
            } catch (Exception exception) {
            }
            this.field_f = null;
        }
        this.field_g = null;
    }

    hn(dl param0, java.net.URL param1, int param2) {
        try {
            this.field_m = param1;
            this.field_n = param0;
            this.field_h = new wk(param2);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "hn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Advanced Elemental Control";
        field_l = "Loading...";
        field_q = new vn();
        field_i = "Either affect your Arcanist or the whole arena - just click the mouse to activate.";
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
        field_o = "Goblin Caves:";
        field_p = 20;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
