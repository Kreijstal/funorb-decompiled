/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mb {
    private boolean field_a;
    static String field_e;
    private int[] field_b;
    private int field_g;
    static int field_c;
    static int[] field_d;
    private int field_f;

    final static boolean a(boolean param0, int param1) {
        try {
            int var2 = 0;
            uf var2_ref_uf = null;
            IOException var2_ref_IOException = null;
            int stackIn_9_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_8_0 = 0;
            int stackOut_7_0 = 0;
            L0: {
              if (k.field_c != null) {
                break L0;
              } else {
                k.field_c = lf.field_f.a(114, mc.field_e, hc.field_a);
                break L0;
              }
            }
            if ((k.field_c.field_c ^ -1) != -1) {
              long dupTemp$2 = ik.a(4);
              el.field_J = dupTemp$2;
              p.field_a = dupTemp$2;
              if (-2 == (k.field_c.field_c ^ -1)) {
                try {
                  L1: {
                    L2: {
                      qc.field_s = new qk((java.net.Socket) k.field_c.field_b, lf.field_f);
                      var2_ref_uf = de.field_V;
                      we.field_b.field_n = 0;
                      ph.field_xb = ba.field_f;
                      if (!param0) {
                        stackOut_8_0 = -1;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = -2;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    lg.field_U = stackIn_9_0;
                    bb.field_d = stackIn_9_0;
                    kf.field_L = stackIn_9_0;
                    var2_ref_uf.field_n = 0;
                    gi.a(kb.field_g, l.field_c, 17, (wl) (Object) we.field_b, qk.field_a);
                    wj.c(4792, -1);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2_ref_IOException = (IOException) (Object) decompiledCaughtException;
                  ph.field_xb = kl.field_B;
                  k.field_c = null;
                  var2 = 79 / ((param1 - 21) / 48);
                  return true;
                }
                k.field_c = null;
                var2 = 79 / ((param1 - 21) / 48);
                return true;
              } else {
                ph.field_xb = kl.field_B;
                k.field_c = null;
                var2 = 79 / ((param1 - 21) / 48);
                return true;
              }
            } else {
              return false;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        int var2 = 97 % ((param0 - 37) / 50);
        return ((mb) this).field_g + 1;
    }

    final static String a(int param0, hl param1) {
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        String var5 = null;
        Object var6 = null;
        var4 = client.field_A ? 1 : 0;
        var6 = null;
        var2 = var6;
        if (param1.field_p != null) {
          L0: {
            var5 = param1.field_p;
            var3 = var5;
            var3 = var5;
            if (param1.field_l == 1) {
              var2 = (Object) (Object) ("<img=0>" + var5);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-3 == (param1.field_l ^ -1)) {
              var2 = (Object) (Object) ("<img=1>" + var2);
              var3 = (String) var2;
              var3 = (String) var2;
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 <= 96) {
            field_c = -12;
            var3 = "";
            if (2 == param1.field_m) {
              if (!param1.field_j) {
                if (0 != param1.field_i) {
                  var3 = cm.a((byte) 110, im.field_j, new String[1]);
                  return var3;
                } else {
                  if (param1.field_n != 0) {
                    var3 = cm.a((byte) 110, im.field_j, new String[1]);
                    return var3;
                  } else {
                    var3 = cm.a((byte) 90, oj.field_b, new String[1]);
                    return var3;
                  }
                }
              } else {
                return var3;
              }
            } else {
              L2: {
                if (0 != param1.field_m) {
                  break L2;
                } else {
                  if (ii.field_q) {
                    var3 = "[" + uc.field_b + "] ";
                    break L2;
                  } else {
                    L3: {
                      if ((param1.field_m ^ -1) != -2) {
                        break L3;
                      } else {
                        var3 = "[" + cm.a((byte) 125, hf.field_a, new String[1]) + "] ";
                        break L3;
                      }
                    }
                    if (4 == param1.field_m) {
                      L4: {
                        if (f.field_q != null) {
                          var3 = "[" + f.field_q + "] ";
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (-4 != (param1.field_m ^ -1)) {
                          break L5;
                        } else {
                          var3 = "[#" + param1.field_g + "] ";
                          break L5;
                        }
                      }
                      if (!param1.field_j) {
                        var3 = var3 + var2 + ": ";
                        return var3;
                      } else {
                        return var3;
                      }
                    } else {
                      L6: {
                        if (-4 != (param1.field_m ^ -1)) {
                          break L6;
                        } else {
                          var3 = "[#" + param1.field_g + "] ";
                          break L6;
                        }
                      }
                      if (!param1.field_j) {
                        var3 = var3 + var2 + ": ";
                        return var3;
                      } else {
                        return var3;
                      }
                    }
                  }
                }
              }
              L7: {
                if ((param1.field_m ^ -1) != -2) {
                  break L7;
                } else {
                  var3 = "[" + cm.a((byte) 125, hf.field_a, new String[1]) + "] ";
                  break L7;
                }
              }
              L8: {
                if (4 != param1.field_m) {
                  break L8;
                } else {
                  if (f.field_q != null) {
                    var3 = "[" + f.field_q + "] ";
                    break L8;
                  } else {
                    L9: {
                      if (-4 != (param1.field_m ^ -1)) {
                        break L9;
                      } else {
                        var3 = "[#" + param1.field_g + "] ";
                        break L9;
                      }
                    }
                    if (!param1.field_j) {
                      var3 = var3 + var2 + ": ";
                      return var3;
                    } else {
                      return var3;
                    }
                  }
                }
              }
              L10: {
                if (-4 != (param1.field_m ^ -1)) {
                  break L10;
                } else {
                  var3 = "[#" + param1.field_g + "] ";
                  break L10;
                }
              }
              if (!param1.field_j) {
                var3 = var3 + var2 + ": ";
                return var3;
              } else {
                return var3;
              }
            }
          } else {
            var3 = "";
            if (2 == param1.field_m) {
              if (!param1.field_j) {
                if (0 != param1.field_i) {
                  var3 = cm.a((byte) 110, im.field_j, new String[1]);
                  return var3;
                } else {
                  if (param1.field_n != 0) {
                    var3 = cm.a((byte) 110, im.field_j, new String[1]);
                    return var3;
                  } else {
                    var3 = cm.a((byte) 90, oj.field_b, new String[1]);
                    return var3;
                  }
                }
              } else {
                return var3;
              }
            } else {
              L11: {
                if (0 != param1.field_m) {
                  break L11;
                } else {
                  if (ii.field_q) {
                    var3 = "[" + uc.field_b + "] ";
                    break L11;
                  } else {
                    L12: {
                      if ((param1.field_m ^ -1) != -2) {
                        break L12;
                      } else {
                        var3 = "[" + cm.a((byte) 125, hf.field_a, new String[1]) + "] ";
                        break L12;
                      }
                    }
                    L13: {
                      if (4 != param1.field_m) {
                        break L13;
                      } else {
                        if (f.field_q != null) {
                          var3 = "[" + f.field_q + "] ";
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                    }
                    L14: {
                      if (-4 != (param1.field_m ^ -1)) {
                        break L14;
                      } else {
                        var3 = "[#" + param1.field_g + "] ";
                        break L14;
                      }
                    }
                    if (!param1.field_j) {
                      var3 = var3 + var2 + ": ";
                      return var3;
                    } else {
                      return var3;
                    }
                  }
                }
              }
              L15: {
                if ((param1.field_m ^ -1) != -2) {
                  break L15;
                } else {
                  var3 = "[" + cm.a((byte) 125, hf.field_a, new String[1]) + "] ";
                  break L15;
                }
              }
              L16: {
                if (4 != param1.field_m) {
                  break L16;
                } else {
                  if (f.field_q != null) {
                    var3 = "[" + f.field_q + "] ";
                    break L16;
                  } else {
                    L17: {
                      if (-4 != (param1.field_m ^ -1)) {
                        break L17;
                      } else {
                        var3 = "[#" + param1.field_g + "] ";
                        break L17;
                      }
                    }
                    if (!param1.field_j) {
                      var3 = var3 + var2 + ": ";
                      return var3;
                    } else {
                      return var3;
                    }
                  }
                }
              }
              L18: {
                if (-4 != (param1.field_m ^ -1)) {
                  break L18;
                } else {
                  var3 = "[#" + param1.field_g + "] ";
                  break L18;
                }
              }
              if (!param1.field_j) {
                var3 = var3 + var2 + ": ";
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          L19: {
            if (param0 > 96) {
              break L19;
            } else {
              field_c = -12;
              break L19;
            }
          }
          var3 = "";
          if (2 == param1.field_m) {
            if (!param1.field_j) {
              if (0 != param1.field_i) {
                var3 = cm.a((byte) 110, im.field_j, new String[1]);
                return var3;
              } else {
                if (param1.field_n != 0) {
                  var3 = cm.a((byte) 110, im.field_j, new String[1]);
                  return var3;
                } else {
                  var3 = cm.a((byte) 90, oj.field_b, new String[1]);
                  return var3;
                }
              }
            } else {
              return var3;
            }
          } else {
            L20: {
              if (0 != param1.field_m) {
                break L20;
              } else {
                if (ii.field_q) {
                  var3 = "[" + uc.field_b + "] ";
                  break L20;
                } else {
                  L21: {
                    if ((param1.field_m ^ -1) != -2) {
                      break L21;
                    } else {
                      var3 = "[" + cm.a((byte) 125, hf.field_a, new String[1]) + "] ";
                      break L21;
                    }
                  }
                  L22: {
                    if (4 != param1.field_m) {
                      break L22;
                    } else {
                      if (f.field_q != null) {
                        var3 = "[" + f.field_q + "] ";
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (-4 != (param1.field_m ^ -1)) {
                      break L23;
                    } else {
                      var3 = "[#" + param1.field_g + "] ";
                      break L23;
                    }
                  }
                  if (param1.field_j) {
                    return var3;
                  } else {
                    var3 = var3 + var6 + ": ";
                    return var3;
                  }
                }
              }
            }
            L24: {
              if ((param1.field_m ^ -1) != -2) {
                break L24;
              } else {
                var3 = "[" + cm.a((byte) 125, hf.field_a, new String[1]) + "] ";
                break L24;
              }
            }
            L25: {
              if (4 != param1.field_m) {
                break L25;
              } else {
                if (f.field_q != null) {
                  var3 = "[" + f.field_q + "] ";
                  break L25;
                } else {
                  L26: {
                    if (-4 != (param1.field_m ^ -1)) {
                      break L26;
                    } else {
                      var3 = "[#" + param1.field_g + "] ";
                      break L26;
                    }
                  }
                  if (param1.field_j) {
                    return var3;
                  } else {
                    var3 = var3 + var6 + ": ";
                    return var3;
                  }
                }
              }
            }
            L27: {
              if (-4 != (param1.field_m ^ -1)) {
                break L27;
              } else {
                var3 = "[#" + param1.field_g + "] ";
                break L27;
              }
            }
            if (!param1.field_j) {
              var3 = var3 + var6 + ": ";
              return var3;
            } else {
              return var3;
            }
          }
        }
    }

    final int b(int param0, int param1) {
        if (param0 <= ((mb) this).field_g) {
          if (param1 != 0) {
            ((mb) this).field_f = -5;
            return ((mb) this).field_b[param0];
          } else {
            return ((mb) this).field_b[param0];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    private final void a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.a((byte) -63, param0)];
        var3 = var4;
        if (param1 >= -4) {
          int discarded$2 = ((mb) this).b(9, -101);
          an.a(((mb) this).field_b, 0, var4, 0, ((mb) this).field_b.length);
          ((mb) this).field_b = var4;
          return;
        } else {
          an.a(((mb) this).field_b, 0, var4, 0, ((mb) this).field_b.length);
          ((mb) this).field_b = var4;
          return;
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = client.field_A ? 1 : 0;
        if (param0 != -63) {
          ((mb) this).field_f = -94;
          var3 = ((mb) this).field_b.length;
          L0: while (true) {
            if (param1 < var3) {
              return var3;
            } else {
              if (!((mb) this).field_a) {
                var3 = var3 + ((mb) this).field_f;
                continue L0;
              } else {
                if (var3 == 0) {
                  var3 = 1;
                  continue L0;
                } else {
                  var3 = var3 * ((mb) this).field_f;
                  continue L0;
                }
              }
            }
          }
        } else {
          var3 = ((mb) this).field_b.length;
          L1: while (true) {
            if (param1 < var3) {
              return var3;
            } else {
              if (!((mb) this).field_a) {
                var3 = var3 + ((mb) this).field_f;
                continue L1;
              } else {
                if (var3 == 0) {
                  var3 = 1;
                  continue L1;
                } else {
                  var3 = var3 * ((mb) this).field_f;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1, int param2) {
        if (((mb) this).field_g >= param1) {
          if (param0 >= 38) {
            if (param1 >= ((mb) this).field_b.length) {
              this.a(param1, -23);
              ((mb) this).field_b[param1] = param2;
              return;
            } else {
              ((mb) this).field_b[param1] = param2;
              return;
            }
          } else {
            return;
          }
        } else {
          ((mb) this).field_g = param1;
          if (param0 >= 38) {
            if (param1 < ((mb) this).field_b.length) {
              ((mb) this).field_b[param1] = param2;
              return;
            } else {
              this.a(param1, -23);
              ((mb) this).field_b[param1] = param2;
              return;
            }
          } else {
            return;
          }
        }
    }

    private mb() throws Throwable {
        throw new Error();
    }

    final static int a(boolean param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        L0: {
          var5 = 256 + param1 * (-param4 + param3);
          if (param0) {
            var5 += 64;
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != -122) {
          field_e = null;
          return var5;
        } else {
          return var5;
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          field_e = null;
          this.a((byte) 114, ((mb) this).field_g - -1, param0);
          return;
        } else {
          this.a((byte) 114, ((mb) this).field_g - -1, param0);
          return;
        }
    }

    public static void a(boolean param0) {
        field_e = null;
        field_d = null;
        if (param0) {
            field_e = null;
        }
    }

    final void c(int param0, int param1) {
        if (param1 >= 0) {
          if (((mb) this).field_g >= param1) {
            if (param0 > -25) {
              L0: {
                ((mb) this).field_f = 15;
                if (((mb) this).field_g != param1) {
                  an.a(((mb) this).field_b, param1 + 1, ((mb) this).field_b, param1, ((mb) this).field_g + -param1);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((mb) this).field_g = ((mb) this).field_g - 1;
              return;
            } else {
              L1: {
                if (((mb) this).field_g != param1) {
                  an.a(((mb) this).field_b, param1 + 1, ((mb) this).field_b, param1, ((mb) this).field_g + -param1);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((mb) this).field_g = ((mb) this).field_g - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Special Items";
    }
}
