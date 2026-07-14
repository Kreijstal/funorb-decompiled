/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sq extends tc {
    private int field_l;
    private int field_p;
    static String field_n;
    private int field_m;
    static String field_o;
    static String field_s;
    private tc field_q;
    static int field_k;
    private String field_r;

    final static boolean c(byte param0) {
        int var1 = 0;
        var1 = 52 / ((-9 - param0) / 42);
        if (fs.a(false)) {
          if (-1 != (uk.field_n & 8 ^ -1)) {
            return false;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static String a(int param0, byte param1, int param2, int param3) {
        int var4 = 0;
        ic var5 = null;
        var4 = -110 / ((param1 - -76) / 36);
        var5 = rd.field_j;
        if (var5 == null) {
          return "No game in progress.";
        } else {
          if (param2 >= 0) {
            if (var5.field_xb.field_W < param2) {
              return "Please choose a player, 0-based.";
            } else {
              var5.field_xb.b(10001, param2, false);
              var5.field_xb.field_mb[var5.field_q] = param3;
              var5.field_xb.field_zb[var5.field_q] = param0;
              var5.j(true);
              return "Done.";
            }
          } else {
            return "Please choose a player, 0-based.";
          }
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        L0: {
          if (0 >= ((sq) this).field_m) {
            break L0;
          } else {
            if (((sq) this).field_l > ((sq) this).field_m) {
              var3 = (int)(127.0 * (1.0 - Math.cos((double)((sq) this).field_m * 3.141592653589793 / (double)(((sq) this).field_l / 2))));
              qn.a(-(((sq) this).field_p >> 37942177) + 320, param1 + (-((sq) this).field_m + -14), ((sq) this).field_p, 20, 5, 0, var3);
              rs.field_n.a(((sq) this).field_r, 320, param1 + -((sq) this).field_m, 16777215, 0, var3);
              break L0;
            } else {
              if (null != ((sq) this).field_b) {
                if (((sq) this).field_b != ((sq) this).field_q) {
                  L1: {
                    if (((sq) (Object) ((sq) this).field_b).field_m > 0) {
                      ((sq) (Object) ((sq) this).field_b).b(500, param1);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (param0 != 500) {
                    sq.a(false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param0 != 500) {
                    sq.a(false);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param0 != 500) {
                  sq.a(false);
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
        if (null != ((sq) this).field_b) {
          if (((sq) this).field_b != ((sq) this).field_q) {
            if (((sq) (Object) ((sq) this).field_b).field_m > 0) {
              ((sq) (Object) ((sq) this).field_b).b(500, param1);
              if (param0 != 500) {
                sq.a(false);
                return;
              } else {
                return;
              }
            } else {
              if (param0 != 500) {
                sq.a(false);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0 != 500) {
              sq.a(false);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 != 500) {
            sq.a(false);
            return;
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_o = null;
        field_n = null;
        field_s = null;
        if (param0) {
            String discarded$0 = sq.a(24, (byte) 101, 43, 1);
        }
    }

    sq(String param0, boolean param1, at param2) {
        ((sq) this).field_m = 0;
        ((sq) this).field_r = param0;
        ((sq) this).field_p = 8 + rs.field_n.a(((sq) this).field_r);
        ((sq) this).field_q = param2.field_d;
        ((sq) this).field_l = !param1 ? 128 : 500;
    }

    final void a(byte param0) {
        ((sq) this).field_m = ((sq) this).field_m + 1;
        if (((sq) this).field_m >= 16) {
          if (null != ((sq) this).field_b) {
            if (((sq) this).field_q == ((sq) this).field_b) {
              if (param0 == 66) {
                if (((sq) this).field_l <= ((sq) this).field_m) {
                  ((sq) this).d(-122);
                  return;
                } else {
                  return;
                }
              } else {
                boolean discarded$4 = sq.c((byte) -116);
                if (((sq) this).field_l <= ((sq) this).field_m) {
                  ((sq) this).d(-122);
                  return;
                } else {
                  return;
                }
              }
            } else {
              ((sq) (Object) ((sq) this).field_b).a((byte) 66);
              if (param0 == 66) {
                if (((sq) this).field_l <= ((sq) this).field_m) {
                  ((sq) this).d(-122);
                  return;
                } else {
                  return;
                }
              } else {
                boolean discarded$5 = sq.c((byte) -116);
                if (((sq) this).field_l <= ((sq) this).field_m) {
                  ((sq) this).d(-122);
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            if (param0 == 66) {
              if (((sq) this).field_l <= ((sq) this).field_m) {
                ((sq) this).d(-122);
                return;
              } else {
                return;
              }
            } else {
              boolean discarded$6 = sq.c((byte) -116);
              if (((sq) this).field_l <= ((sq) this).field_m) {
                ((sq) this).d(-122);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param0 == 66) {
            if (((sq) this).field_l <= ((sq) this).field_m) {
              ((sq) this).d(-122);
              return;
            } else {
              return;
            }
          } else {
            boolean discarded$7 = sq.c((byte) -116);
            if (((sq) this).field_l <= ((sq) this).field_m) {
              ((sq) this).d(-122);
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Add <%0> to ignore list";
        field_n = "You are invited to <%0>'s game.";
        field_s = "Clone <%0> cannot be used on a level <%1> unit.";
    }
}
