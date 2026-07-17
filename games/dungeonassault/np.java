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
        int var4 = 0;
        rj var5 = null;
        int var6 = 0;
        var6 = DungeonAssault.field_K;
        if (!((np) this).field_N) {
          return;
        } else {
          if (null != ((np) this).field_L) {
            gf.a(((np) this).field_L);
            gf.a(param0 + ((np) this).field_t, param1 + ((np) this).field_i, ((np) this).field_q + ((np) this).field_t - -param0, param1 + ((np) this).field_x + ((np) this).field_i);
            var4 = 0;
            if (null != ((np) this).field_J) {
              var5 = (rj) (Object) ((np) this).field_J.e(-24172);
              L0: while (true) {
                if (var5 != null) {
                  var5.a(param0, param1, (byte) 122);
                  var5 = (rj) (Object) ((np) this).field_J.a(4);
                  continue L0;
                } else {
                  gf.b(((np) this).field_L);
                  return;
                }
              }
            } else {
              gf.b(((np) this).field_L);
              return;
            }
          } else {
            ((np) this).field_L = new int[4];
            gf.a(((np) this).field_L);
            gf.a(param0 + ((np) this).field_t, param1 + ((np) this).field_i, ((np) this).field_q + ((np) this).field_t - -param0, param1 + ((np) this).field_x + ((np) this).field_i);
            var4 = 0;
            if (null != ((np) this).field_J) {
              var5 = (rj) (Object) ((np) this).field_J.e(-24172);
              L1: while (true) {
                if (var5 != null) {
                  var5.a(param0, param1, (byte) 122);
                  var5 = (rj) (Object) ((np) this).field_J.a(4);
                  continue L1;
                } else {
                  gf.b(((np) this).field_L);
                  return;
                }
              }
            } else {
              gf.b(((np) this).field_L);
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
            throw vk.a((Throwable) (Object) runtimeException, "np.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static String b(int param0, int param1) {
        return k.a((byte) -122, 3, 3, param1);
    }

    final static void d(byte param0) {
        Object var2 = null;
        gg.a((byte) -92, (String) null, he.field_m);
    }

    void b(byte param0) {
        int var3 = 0;
        rj var4 = null;
        var3 = DungeonAssault.field_K;
        if (null != ((np) this).field_J) {
          var4 = (rj) (Object) ((np) this).field_J.e(-24172);
          L0: while (true) {
            if (var4 != null) {
              var4.b((byte) 30);
              var4 = (rj) (Object) ((np) this).field_J.a(4);
              continue L0;
            } else {
              super.b((byte) 30);
              return;
            }
          }
        } else {
          super.b((byte) 30);
          return;
        }
    }

    void a(rj param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        try {
            var3_int = ((np) this).field_t;
            if (0 != (1 & param0.field_v)) {
                var3_int = var3_int + ((np) this).field_q;
            }
            var4 = ((np) this).field_i;
            if (0 != (param0.field_v & 2)) {
                var4 = var4 + ((np) this).field_x;
            }
            param0.e(var4, var3_int, 100);
            if (null == ((np) this).field_J) {
                ((np) this).field_J = new md();
            }
            ((np) this).field_J.b((ne) (Object) param0, false);
            param0.field_r = (rj) this;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "np.B(" + (param0 != null ? "{...}" : "null") + 44 + -76 + 41);
        }
    }

    np(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, 0);
        ((np) this).field_N = true;
    }

    public static void c() {
        field_G = null;
        field_I = null;
        field_z = null;
        field_F = null;
        field_E = null;
        field_A = null;
        field_M = null;
        field_C = null;
    }

    void e(int param0, int param1, int param2) {
        int var5 = 0;
        rj var6 = null;
        var5 = DungeonAssault.field_K;
        if (param1 == 0) {
          if (0 != param0) {
            if (null != ((np) this).field_J) {
              var6 = (rj) (Object) ((np) this).field_J.e(-24172);
              L0: while (true) {
                if (var6 != null) {
                  var6.e(param0, param1, 75);
                  var6 = (rj) (Object) ((np) this).field_J.a(4);
                  continue L0;
                } else {
                  if (param2 >= 69) {
                    ((np) this).field_i = ((np) this).field_i + param0;
                    ((np) this).field_t = ((np) this).field_t + param1;
                    return;
                  } else {
                    ((np) this).b(-70, -8, 121);
                    ((np) this).field_i = ((np) this).field_i + param0;
                    ((np) this).field_t = ((np) this).field_t + param1;
                    return;
                  }
                }
              }
            } else {
              if (param2 < 69) {
                ((np) this).b(-70, -8, 121);
                ((np) this).field_i = ((np) this).field_i + param0;
                ((np) this).field_t = ((np) this).field_t + param1;
                return;
              } else {
                ((np) this).field_i = ((np) this).field_i + param0;
                ((np) this).field_t = ((np) this).field_t + param1;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          if (null != ((np) this).field_J) {
            var6 = (rj) (Object) ((np) this).field_J.e(-24172);
            L1: while (true) {
              if (var6 != null) {
                var6.e(param0, param1, 75);
                var6 = (rj) (Object) ((np) this).field_J.a(4);
                continue L1;
              } else {
                if (param2 < 69) {
                  ((np) this).b(-70, -8, 121);
                  ((np) this).field_i = ((np) this).field_i + param0;
                  ((np) this).field_t = ((np) this).field_t + param1;
                  return;
                } else {
                  ((np) this).field_i = ((np) this).field_i + param0;
                  ((np) this).field_t = ((np) this).field_t + param1;
                  return;
                }
              }
            }
          } else {
            if (param2 < 69) {
              ((np) this).b(-70, -8, 121);
              ((np) this).field_i = ((np) this).field_i + param0;
              ((np) this).field_t = ((np) this).field_t + param1;
              return;
            } else {
              ((np) this).field_i = ((np) this).field_i + param0;
              ((np) this).field_t = ((np) this).field_t + param1;
              return;
            }
          }
        }
    }

    void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        rj var6_ref_rj = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var8 = DungeonAssault.field_K;
        var4 = param1 + -((np) this).field_q;
        var5 = param2 + -((np) this).field_x;
        if (((np) this).field_J != null) {
          var6_ref_rj = (rj) (Object) ((np) this).field_J.e(-24172);
          L0: while (true) {
            if (var6_ref_rj == null) {
              if (0 != (((np) this).field_v & 1)) {
                L1: {
                  var6 = -var4;
                  if ((2 & ((np) this).field_v) == 0) {
                    stackOut_23_0 = 0;
                    stackIn_24_0 = stackOut_23_0;
                    break L1;
                  } else {
                    stackOut_22_0 = -var5;
                    stackIn_24_0 = stackOut_22_0;
                    break L1;
                  }
                }
                var7 = stackIn_24_0;
                ((np) this).e(var7, var6, 115);
                ((np) this).field_q = param1;
                ((np) this).field_x = param2;
                return;
              } else {
                L2: {
                  var6 = 0;
                  if ((2 & ((np) this).field_v) == 0) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L2;
                  } else {
                    stackOut_18_0 = -var5;
                    stackIn_20_0 = stackOut_18_0;
                    break L2;
                  }
                }
                var7 = stackIn_20_0;
                ((np) this).e(var7, var6, 115);
                ((np) this).field_q = param1;
                ((np) this).field_x = param2;
                return;
              }
            } else {
              L3: {
                if ((var6_ref_rj.field_v & 4) == -1) {
                  break L3;
                } else {
                  var6_ref_rj.e(0, var4, 111);
                  break L3;
                }
              }
              L4: {
                if (-1 == (8 & var6_ref_rj.field_v)) {
                  break L4;
                } else {
                  var6_ref_rj.e(var5, 0, 92);
                  break L4;
                }
              }
              var6_ref_rj = (rj) (Object) ((np) this).field_J.a(4);
              continue L0;
            }
          }
        } else {
          L5: {
            if (0 != (((np) this).field_v & 1)) {
              stackOut_3_0 = -var4;
              stackIn_4_0 = stackOut_3_0;
              break L5;
            } else {
              stackOut_2_0 = 0;
              stackIn_4_0 = stackOut_2_0;
              break L5;
            }
          }
          L6: {
            var6 = stackIn_4_0;
            if ((2 & ((np) this).field_v) == 0) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L6;
            } else {
              stackOut_5_0 = -var5;
              stackIn_7_0 = stackOut_5_0;
              break L6;
            }
          }
          var7 = stackIn_7_0;
          ((np) this).e(var7, var6, 115);
          ((np) this).field_q = param1;
          ((np) this).field_x = param2;
          return;
        }
    }

    void b(int param0, int param1, int param2) {
        int var5 = 0;
        rj var6 = null;
        var5 = DungeonAssault.field_K;
        if (((np) this).field_N) {
          if (((np) this).field_L != null) {
            gf.a(((np) this).field_L);
            gf.a(((np) this).field_t - -param0, param2 + ((np) this).field_i, param0 + (((np) this).field_q + ((np) this).field_t), ((np) this).field_i + ((np) this).field_x + param2);
            if (param1 == 8187) {
              if (null != ((np) this).field_J) {
                var6 = (rj) (Object) ((np) this).field_J.e(-24172);
                L0: while (true) {
                  if (var6 != null) {
                    var6.b(param0, 8187, param2);
                    var6 = (rj) (Object) ((np) this).field_J.a(4);
                    continue L0;
                  } else {
                    gf.b(((np) this).field_L);
                    return;
                  }
                }
              } else {
                gf.b(((np) this).field_L);
                return;
              }
            } else {
              rj discarded$2 = ((np) this).a(-49, 0, 87);
              if (null != ((np) this).field_J) {
                var6 = (rj) (Object) ((np) this).field_J.e(-24172);
                L1: while (true) {
                  if (var6 != null) {
                    var6.b(param0, 8187, param2);
                    var6 = (rj) (Object) ((np) this).field_J.a(4);
                    continue L1;
                  } else {
                    gf.b(((np) this).field_L);
                    return;
                  }
                }
              } else {
                gf.b(((np) this).field_L);
                return;
              }
            }
          } else {
            ((np) this).field_L = new int[4];
            gf.a(((np) this).field_L);
            gf.a(((np) this).field_t - -param0, param2 + ((np) this).field_i, param0 + (((np) this).field_q + ((np) this).field_t), ((np) this).field_i + ((np) this).field_x + param2);
            if (param1 != 8187) {
              rj discarded$3 = ((np) this).a(-49, 0, 87);
              if (null != ((np) this).field_J) {
                var6 = (rj) (Object) ((np) this).field_J.e(-24172);
                L2: while (true) {
                  if (var6 != null) {
                    var6.b(param0, 8187, param2);
                    var6 = (rj) (Object) ((np) this).field_J.a(4);
                    continue L2;
                  } else {
                    gf.b(((np) this).field_L);
                    return;
                  }
                }
              } else {
                gf.b(((np) this).field_L);
                return;
              }
            } else {
              if (null != ((np) this).field_J) {
                var6 = (rj) (Object) ((np) this).field_J.e(-24172);
                L3: while (true) {
                  if (var6 != null) {
                    var6.b(param0, 8187, param2);
                    var6 = (rj) (Object) ((np) this).field_J.a(4);
                    continue L3;
                  } else {
                    gf.b(((np) this).field_L);
                    return;
                  }
                }
              } else {
                gf.b(((np) this).field_L);
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    rj a(int param0, int param1, int param2) {
        rj var5 = null;
        int var6 = 0;
        Object var7 = null;
        rj var8 = null;
        var6 = DungeonAssault.field_K;
        if (((np) this).a((byte) 117, param1, param2)) {
          if (param0 < -10) {
            if (((np) this).field_J != null) {
              var8 = (rj) (Object) ((np) this).field_J.e(-24172);
              L0: while (true) {
                if (var8 != null) {
                  rj dupTemp$14 = var8.a(-31, param1, param2);
                  var5 = dupTemp$14;
                  if (dupTemp$14 != null) {
                    return var5;
                  } else {
                    var8 = (rj) (Object) ((np) this).field_J.a(4);
                    continue L0;
                  }
                } else {
                  return (rj) this;
                }
              }
            } else {
              return (rj) this;
            }
          } else {
            var7 = null;
            np.a((byte) 33, (java.applet.Applet) null);
            if (((np) this).field_J != null) {
              var8 = (rj) (Object) ((np) this).field_J.e(-24172);
              L1: while (true) {
                if (var8 != null) {
                  rj dupTemp$15 = var8.a(-31, param1, param2);
                  var5 = dupTemp$15;
                  if (dupTemp$15 != null) {
                    return var5;
                  } else {
                    var8 = (rj) (Object) ((np) this).field_J.a(4);
                    continue L1;
                  }
                } else {
                  return (rj) this;
                }
              }
            } else {
              return (rj) this;
            }
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Raider avoided guardian and disarmed it.";
        field_z = new String[]{"Armoured", "The heavy plate armour worn by the <%0> negates the first blow he recieves each combat."};
        field_C = new String[]{null, "Each dungeon room may contain a <%monster>, a <%trap>, or a <%guardian>. These different types of rooms will be explained as you encounter them.<br><br><%command>Continue exploring the dungeon. Move your party towards the hoard room.</col>"};
        field_D = false;
        field_I = new int[6];
        field_E = new ab();
    }
}
