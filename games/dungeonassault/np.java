/*
 * Decompiled by CFR-JS 0.4.0.
 */
class np extends rj {
    static String field_G;
    static String[] field_z;
    static rj field_M;
    static ab field_E;
    static nh field_A;
    private int[] field_L;
    static boolean field_D;
    boolean field_N;
    static int[] field_I;
    static cn field_F;
    md field_J;
    static String[] field_C;
    static int field_K;

    void a(int param0, int param1, byte param2) {
        int var4;
        rj var5;
        int var6;
        var6 = DungeonAssault.field_K;
        if (!this.field_N) {
          return;
        } else {
          if (null != this.field_L) {
            gf.a(this.field_L);
            gf.a(param0 + this.field_t, param1 + this.field_i, this.field_q + this.field_t - -param0, param1 + this.field_x + this.field_i);
            var4 = 56 % ((41 - param2) / 61);
            if (null != this.field_J) {
              var5 = (rj) ((Object) this.field_J.e(-24172));
              L0: while (true) {
                if (var5 != null) {
                  var5.a(param0, param1, (byte) 122);
                  var5 = (rj) ((Object) this.field_J.a(4));
                  continue L0;
                } else {
                  gf.b(this.field_L);
                  return;
                }
              }
            } else {
              gf.b(this.field_L);
              return;
            }
          } else {
            this.field_L = new int[4];
            gf.a(this.field_L);
            gf.a(param0 + this.field_t, param1 + this.field_i, this.field_q + this.field_t - -param0, param1 + this.field_x + this.field_i);
            var4 = 56 % ((41 - param2) / 61);
            if (null != this.field_J) {
              var5 = (rj) ((Object) this.field_J.e(-24172));
              L1: while (true) {
                if (var5 != null) {
                  var5.a(param0, param1, (byte) 122);
                  var5 = (rj) ((Object) this.field_J.a(4));
                  continue L1;
                } else {
                  gf.b(this.field_L);
                  return;
                }
              }
            } else {
              gf.b(this.field_L);
              return;
            }
          }
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        long var4 = 0L;
        mm.field_k = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        if (param0 >= -121) {
            return;
        }
        try {
            var4 = -1L;
            lm.a(false, var2, var4, param1, var3);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "np.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String b(int param0, int param1) {
        if (param0 != 3) {
            field_F = (cn) null;
            return k.a((byte) -122, 3, 3, param1);
        }
        return k.a((byte) -122, 3, 3, param1);
    }

    final static void d(byte param0) {
        String var2 = (String) null;
        gg.a((byte) -92, (String) null, he.field_m);
        if (param0 < 45) {
            np.b(25, 106);
        }
    }

    void b(byte param0) {
        int var3;
        rj var4;
        var3 = DungeonAssault.field_K;
        if (null != this.field_J) {
          var4 = (rj) ((Object) this.field_J.e(param0 ^ -24182));
          L0: while (true) {
            if (var4 != null) {
              var4.b((byte) 30);
              var4 = (rj) ((Object) this.field_J.a(4));
              continue L0;
            } else {
              super.b(param0);
              return;
            }
          }
        } else {
          super.b(param0);
          return;
        }
    }

    void a(rj param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            if (param1 > -27) {
                field_I = (int[]) null;
            }
            var3_int = this.field_t;
            if (0 != (1 & param0.field_v)) {
                var3_int = var3_int + this.field_q;
            }
            var4 = this.field_i;
            if (0 != (param0.field_v & 2)) {
                var4 = var4 + this.field_x;
            }
            param0.e(var4, var3_int, 100);
            if (null == this.field_J) {
                this.field_J = new md();
            }
            this.field_J.b(param0, false);
            param0.field_r = (rj) (this);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "np.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    np(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, 0);
        this.field_N = true;
    }

    public static void c(byte param0) {
        field_G = null;
        field_I = null;
        field_z = null;
        field_F = null;
        field_E = null;
        field_A = null;
        field_M = null;
        if (param0 != -74) {
          return;
        } else {
          field_C = null;
          return;
        }
    }

    void e(int param0, int param1, int param2) {
        int var5;
        rj var6;
        var5 = DungeonAssault.field_K;
        if (param1 == 0) {
          if (0 != param0) {
            if (null != this.field_J) {
              var6 = (rj) ((Object) this.field_J.e(-24172));
              L0: while (true) {
                if (var6 != null) {
                  var6.e(param0, param1, 75);
                  var6 = (rj) ((Object) this.field_J.a(4));
                  continue L0;
                } else {
                  if (param2 >= 69) {
                    this.field_i = this.field_i + param0;
                    this.field_t = this.field_t + param1;
                    return;
                  } else {
                    this.b(-70, -8, 121);
                    this.field_i = this.field_i + param0;
                    this.field_t = this.field_t + param1;
                    return;
                  }
                }
              }
            } else {
              if (param2 < 69) {
                this.b(-70, -8, 121);
                this.field_i = this.field_i + param0;
                this.field_t = this.field_t + param1;
                return;
              } else {
                this.field_i = this.field_i + param0;
                this.field_t = this.field_t + param1;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          if (null != this.field_J) {
            var6 = (rj) ((Object) this.field_J.e(-24172));
            L1: while (true) {
              if (var6 != null) {
                var6.e(param0, param1, 75);
                var6 = (rj) ((Object) this.field_J.a(4));
                continue L1;
              } else {
                if (param2 < 69) {
                  this.b(-70, -8, 121);
                  this.field_i = this.field_i + param0;
                  this.field_t = this.field_t + param1;
                  return;
                } else {
                  this.field_i = this.field_i + param0;
                  this.field_t = this.field_t + param1;
                  return;
                }
              }
            }
          } else {
            if (param2 < 69) {
              this.b(-70, -8, 121);
              this.field_i = this.field_i + param0;
              this.field_t = this.field_t + param1;
              return;
            } else {
              this.field_i = this.field_i + param0;
              this.field_t = this.field_t + param1;
              return;
            }
          }
        }
    }

    void a(boolean param0, int param1, int param2) {
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int var4;
        int var5;
        Object var6;
        rj var6_ref;
        int var6_int;
        int var7;
        int var8;
        var6 = null;
        var8 = DungeonAssault.field_K;
        var4 = param1 + -this.field_q;
        var5 = param2 + -this.field_x;
        if (!param0) {
          if (this.field_J != null) {
            var6_ref = (rj) ((Object) this.field_J.e(-24172));
            L0: while (true) {
              if (var6_ref != null) {
                L1: {
                  if ((var6_ref.field_v & 4 ^ -1) == -1) {
                    break L1;
                  } else {
                    var6_ref.e(0, var4, 111);
                    break L1;
                  }
                }
                L2: {
                  if (-1 == (8 & var6_ref.field_v ^ -1)) {
                    break L2;
                  } else {
                    var6_ref.e(var5, 0, 92);
                    break L2;
                  }
                }
                var6_ref = (rj) ((Object) this.field_J.a(4));
                continue L0;
              } else {
                L3: {
                  if (0 != (this.field_v & 1)) {
                    stackIn_50_0 = -var4;
                    break L3;
                  } else {
                    stackIn_50_0 = 0;
                    break L3;
                  }
                }
                L4: {
                  var6_int = stackIn_50_0;
                  if ((2 & this.field_v) == 0) {
                    stackIn_53_0 = 0;
                    break L4;
                  } else {
                    stackIn_53_0 = -var5;
                    break L4;
                  }
                }
                var7 = stackIn_53_0;
                this.e(var7, var6_int, 115);
                this.field_q = param1;
                this.field_x = param2;
                return;
              }
            }
          } else {
            L5: {
              if (0 != (this.field_v & 1)) {
                stackIn_41_0 = -var4;
                break L5;
              } else {
                stackIn_41_0 = 0;
                break L5;
              }
            }
            L6: {
              var6_int = stackIn_41_0;
              if ((2 & this.field_v) == 0) {
                stackIn_44_0 = 0;
                break L6;
              } else {
                stackIn_44_0 = -var5;
                break L6;
              }
            }
            var7 = stackIn_44_0;
            this.e(var7, var6_int, 115);
            this.field_q = param1;
            this.field_x = param2;
            return;
          }
        } else {
          field_A = (nh) null;
          if (this.field_J != null) {
            var6_ref = (rj) ((Object) this.field_J.e(-24172));
            L7: while (true) {
              if (var6_ref != null) {
                stackIn_29_0 = var6_ref.field_v & 4 ^ -1;

                stackIn_29_1 = -1;

                L8: {
                  if (stackIn_29_0 == stackIn_29_1) {
                    break L8;
                  } else {
                    var6_ref.e(0, var4, 111);
                    break L8;
                  }
                }
                L9: {
                  if (-1 == (8 & var6_ref.field_v ^ -1)) {
                    break L9;
                  } else {
                    var6_ref.e(var5, 0, 92);
                    break L9;
                  }
                }
                var6_ref = (rj) ((Object) this.field_J.a(4));
                continue L7;
              } else {
                L12: {
                  if (0 != (this.field_v & 1)) {
                    stackIn_14_0 = -var4;
                    break L12;
                  } else {
                    stackIn_14_0 = 0;
                    break L12;
                  }
                }
                L13: {
                  var6_int = stackIn_14_0;
                  if ((2 & this.field_v) == 0) {
                    stackIn_17_0 = 0;
                    break L13;
                  } else {
                    stackIn_17_0 = -var5;
                    break L13;
                  }
                }
                var7 = stackIn_17_0;
                this.e(var7, var6_int, 115);
                this.field_q = param1;
                this.field_x = param2;
                return;
              }
            }
          } else {
            L14: {
              if (0 != (this.field_v & 1)) {
                stackIn_5_0 = -var4;
                break L14;
              } else {
                stackIn_5_0 = 0;
                break L14;
              }
            }
            L15: {
              var6_int = stackIn_5_0;
              if ((2 & this.field_v) == 0) {
                stackIn_8_0 = 0;
                break L15;
              } else {
                stackIn_8_0 = -var5;
                break L15;
              }
            }
            var7 = stackIn_8_0;
            this.e(var7, var6_int, 115);
            this.field_q = param1;
            this.field_x = param2;
            return;
          }
        }
    }

    void b(int param0, int param1, int param2) {
        int var5;
        rj var6;
        var5 = DungeonAssault.field_K;
        if (this.field_N) {
          if (this.field_L != null) {
            gf.a(this.field_L);
            gf.a(this.field_t - -param0, param2 + this.field_i, param0 + (this.field_q + this.field_t), this.field_i + this.field_x + param2);
            if (param1 == 8187) {
              if (null != this.field_J) {
                var6 = (rj) ((Object) this.field_J.e(-24172));
                L0: while (true) {
                  if (var6 != null) {
                    var6.b(param0, 8187, param2);
                    var6 = (rj) ((Object) this.field_J.a(4));
                    continue L0;
                  } else {
                    gf.b(this.field_L);
                    return;
                  }
                }
              } else {
                gf.b(this.field_L);
                return;
              }
            } else {
              this.a(-49, 0, 87);
              if (null != this.field_J) {
                var6 = (rj) ((Object) this.field_J.e(-24172));
                L1: while (true) {
                  if (var6 != null) {
                    var6.b(param0, 8187, param2);
                    var6 = (rj) ((Object) this.field_J.a(4));
                    continue L1;
                  } else {
                    gf.b(this.field_L);
                    return;
                  }
                }
              } else {
                gf.b(this.field_L);
                return;
              }
            }
          } else {
            this.field_L = new int[4];
            gf.a(this.field_L);
            gf.a(this.field_t - -param0, param2 + this.field_i, param0 + (this.field_q + this.field_t), this.field_i + this.field_x + param2);
            if (param1 != 8187) {
              this.a(-49, 0, 87);
              if (null != this.field_J) {
                var6 = (rj) ((Object) this.field_J.e(-24172));
                L2: while (true) {
                  if (var6 != null) {
                    var6.b(param0, 8187, param2);
                    var6 = (rj) ((Object) this.field_J.a(4));
                    continue L2;
                  } else {
                    gf.b(this.field_L);
                    return;
                  }
                }
              } else {
                gf.b(this.field_L);
                return;
              }
            } else {
              if (null != this.field_J) {
                var6 = (rj) ((Object) this.field_J.e(-24172));
                L3: while (true) {
                  if (var6 != null) {
                    var6.b(param0, 8187, param2);
                    var6 = (rj) ((Object) this.field_J.a(4));
                    continue L3;
                  } else {
                    gf.b(this.field_L);
                    return;
                  }
                }
              } else {
                gf.b(this.field_L);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    rj a(int param0, int param1, int param2) {
        rj dupTemp$1 = null;
        rj dupTemp$2 = null;
        rj var5;
        int var6;
        java.applet.Applet var7;
        rj var8;
        var6 = DungeonAssault.field_K;
        if (this.a((byte) 117, param1, param2)) {
          if (param0 < -10) {
            if (this.field_J != null) {
              var8 = (rj) ((Object) this.field_J.e(-24172));
              L0: while (true) {
                if (var8 != null) {
                  dupTemp$1 = var8.a(-31, param1, param2);
                  var5 = dupTemp$1;
                  if (dupTemp$1 != null) {
                    return var5;
                  } else {
                    var8 = (rj) ((Object) this.field_J.a(4));
                    continue L0;
                  }
                } else {
                  return (rj) (this);
                }
              }
            } else {
              return (rj) (this);
            }
          } else {
            var7 = (java.applet.Applet) null;
            np.a((byte) 33, (java.applet.Applet) null);
            if (this.field_J != null) {
              var8 = (rj) ((Object) this.field_J.e(-24172));
              L1: while (true) {
                if (var8 != null) {
                  dupTemp$2 = var8.a(-31, param1, param2);
                  var5 = dupTemp$2;
                  if (dupTemp$2 != null) {
                    return var5;
                  } else {
                    var8 = (rj) ((Object) this.field_J.a(4));
                    continue L1;
                  }
                } else {
                  return (rj) (this);
                }
              }
            } else {
              return (rj) (this);
            }
          }
        } else {
          return null;
        }
    }

    static {
        field_G = "Raider avoided guardian and disarmed it.";
        field_z = new String[]{"Armoured", "The heavy plate armour worn by the <%0> negates the first blow he recieves each combat."};
        field_C = new String[]{null, "Each dungeon room may contain a <%monster>, a <%trap>, or a <%guardian>. These different types of rooms will be explained as you encounter them.<br><br><%command>Continue exploring the dungeon. Move your party towards the hoard room.</col>"};
        field_D = false;
        field_I = new int[6];
        field_E = new ab();
    }
}
