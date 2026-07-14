/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class eb extends gl {
    static volatile int field_F;
    static String[] field_J;
    static String field_E;
    static String field_G;
    static String field_B;
    static int field_D;
    static int field_I;
    private boolean field_z;
    private boolean field_H;
    boolean field_A;
    boolean field_C;

    boolean a(char param0, gl param1, int param2, int param3) {
        if (param2 == 30) {
          if (((eb) this).d(-105)) {
            if (84 != param3) {
              if (param3 != 83) {
                return false;
              } else {
                ((eb) this).a(-1, 1, (byte) -2, -1);
                return true;
              }
            } else {
              ((eb) this).a(-1, 1, (byte) -2, -1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((eb) this).field_H = true;
          if (((eb) this).d(-105)) {
            if (84 != param3) {
              if (param3 == 83) {
                ((eb) this).a(-1, 1, (byte) -2, -1);
                return true;
              } else {
                return false;
              }
            } else {
              ((eb) this).a(-1, 1, (byte) -2, -1);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 >= -103) {
            return false;
        }
        return ((eb) this).field_H;
    }

    final static void a(int param0, byte param1) {
        int var3 = 79 % ((param1 - 80) / 44);
        uc var2 = di.field_l;
        var2.k(-17410, param0);
        var2.i(1, -106);
        var2.i(2, 73);
    }

    void a(gl param0, int param1, int param2, int param3) {
        Object var6 = null;
        super.a(param0, param1, param2, 108);
        if (param3 >= 25) {
          if (((eb) this).field_j != 0) {
            if (((eb) this).field_j != oh.field_f) {
              if (!((eb) this).a(param2, param1, false, jb.field_b, ef.field_j)) {
                ((eb) this).a(110, ef.field_j, param1, param2, jb.field_b, param0);
                return;
              } else {
                if (oh.field_f == 0) {
                  ((eb) this).a(jb.field_b - param1, ((eb) this).field_j, (byte) -2, ef.field_j - param2);
                  ((eb) this).a(110, ef.field_j, param1, param2, jb.field_b, param0);
                  return;
                } else {
                  ((eb) this).a(110, ef.field_j, param1, param2, jb.field_b, param0);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          boolean discarded$1 = ((eb) this).a((byte) -51, (gl) null);
          if (((eb) this).field_j != 0) {
            if (((eb) this).field_j != oh.field_f) {
              if (!((eb) this).a(param2, param1, false, jb.field_b, ef.field_j)) {
                ((eb) this).a(110, ef.field_j, param1, param2, jb.field_b, param0);
                return;
              } else {
                if (oh.field_f == 0) {
                  ((eb) this).a(jb.field_b - param1, ((eb) this).field_j, (byte) -2, ef.field_j - param2);
                  ((eb) this).a(110, ef.field_j, param1, param2, jb.field_b, param0);
                  return;
                } else {
                  ((eb) this).a(110, ef.field_j, param1, param2, jb.field_b, param0);
                  return;
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void e(byte param0) {
        if (param0 >= -53) {
            return;
        }
        field_B = null;
        field_E = null;
        field_G = null;
        field_J = null;
    }

    boolean a(byte param0, gl param1) {
        if (((eb) this).field_A) {
          if (((eb) this).field_z) {
            if (param0 > 2) {
              param1.e(-80);
              ((eb) this).field_H = true;
              if (null != ((eb) this).field_r) {
                if (!(((eb) this).field_r instanceof kc)) {
                  return true;
                } else {
                  ((kc) (Object) ((eb) this).field_r).a(true, (gl) this, ((eb) this).field_H);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void e(int param0) {
        Object var3 = null;
        if (param0 < 0) {
          if (((eb) this).field_H) {
            ((eb) this).field_H = false;
            if (null != ((eb) this).field_r) {
              if (((eb) this).field_r instanceof kc) {
                ((kc) (Object) ((eb) this).field_r).a(true, (gl) this, ((eb) this).field_H);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          var3 = null;
          ((eb) this).a((gl) null, 7, -73, -28);
          if (((eb) this).field_H) {
            ((eb) this).field_H = false;
            if (null != ((eb) this).field_r) {
              if (((eb) this).field_r instanceof kc) {
                ((kc) (Object) ((eb) this).field_r).a(true, (gl) this, ((eb) this).field_H);
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    boolean a(boolean param0, int param1, int param2, int param3, int param4, gl param5, int param6) {
        if (!((eb) this).field_A) {
          if (param0) {
            return false;
          } else {
            return false;
          }
        } else {
          if (((eb) this).a(param3, param2, false, param6, param1)) {
            boolean discarded$2 = ((eb) this).a((byte) 11, param5);
            ((eb) this).field_j = param4;
            if (((eb) this).field_r != null) {
              if (!(((eb) this).field_r instanceof ac)) {
                return true;
              } else {
                ((ac) (Object) ((eb) this).field_r).a(param2, (eb) this, param4, param1, param3, -32751, param6);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param0) {
              return false;
            } else {
              return false;
            }
          }
        }
    }

    final static void a(ja param0, int param1, int param2) {
        uc var3 = null;
        var3 = di.field_l;
        if (param1 != 0) {
          return;
        } else {
          var3.k(-17410, param2);
          var3.i(param0.field_o, -90);
          var3.i(param0.field_k, 38);
          return;
        }
    }

    eb(String param0, cj param1, sc param2) {
        super(param0, param1, param2);
        ((eb) this).field_H = false;
        ((eb) this).field_z = true;
        ((eb) this).field_A = true;
    }

    eb(String param0, sc param1) {
        this(param0, vc.field_c.field_n, param1);
    }

    final StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        Object var6 = null;
        if (param0 == 34) {
          if (((eb) this).a(param1, param3, -110, param2)) {
            ((eb) this).a(param3, param2, (byte) 27, param1);
            if (!((eb) this).field_C) {
              if (!((eb) this).field_A) {
                StringBuilder discarded$7 = param1.append(" disabled");
                return param1;
              } else {
                return param1;
              }
            } else {
              StringBuilder discarded$8 = param1.append(" active");
              if (!((eb) this).field_A) {
                StringBuilder discarded$9 = param1.append(" disabled");
                return param1;
              } else {
                return param1;
              }
            }
          } else {
            return param1;
          }
        } else {
          var6 = null;
          boolean discarded$10 = ((eb) this).a((byte) 48, (gl) null);
          if (((eb) this).a(param1, param3, -110, param2)) {
            ((eb) this).a(param3, param2, (byte) 27, param1);
            if (((eb) this).field_C) {
              StringBuilder discarded$11 = param1.append(" active");
              if (((eb) this).field_A) {
                return param1;
              } else {
                StringBuilder discarded$12 = param1.append(" disabled");
                return param1;
              }
            } else {
              if (!((eb) this).field_A) {
                StringBuilder discarded$13 = param1.append(" disabled");
                return param1;
              } else {
                return param1;
              }
            }
          } else {
            return param1;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, gl param5) {
        Object var8 = null;
        if (null != ((eb) this).field_r) {
          if (((eb) this).field_r instanceof ac) {
            ((ac) (Object) ((eb) this).field_r).a(param3, param1, -110, param4, param2, (eb) this);
            if (param0 < 36) {
              var8 = null;
              boolean discarded$3 = ((eb) this).a('￐', (gl) null, 48, -89);
              ((eb) this).field_j = 0;
              return;
            } else {
              ((eb) this).field_j = 0;
              return;
            }
          } else {
            if (param0 < 36) {
              var8 = null;
              boolean discarded$4 = ((eb) this).a('￐', (gl) null, 48, -89);
              ((eb) this).field_j = 0;
              return;
            } else {
              ((eb) this).field_j = 0;
              return;
            }
          }
        } else {
          if (param0 < 36) {
            var8 = null;
            boolean discarded$5 = ((eb) this).a('￐', (gl) null, 48, -89);
            ((eb) this).field_j = 0;
            return;
          } else {
            ((eb) this).field_j = 0;
            return;
          }
        }
    }

    protected eb() {
        ((eb) this).field_H = false;
        ((eb) this).field_z = true;
        ((eb) this).field_A = true;
        ((eb) this).field_l = vc.field_c.field_e;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (((eb) this).field_r != null) {
          if (((eb) this).field_r instanceof n) {
            ((n) (Object) ((eb) this).field_r).a((eb) this, param3, param1, param0, -87);
            if (param2 != -2) {
              ((eb) this).a(-10, 84, (byte) 118, 88);
              return;
            } else {
              return;
            }
          } else {
            if (param2 != -2) {
              ((eb) this).a(-10, 84, (byte) 118, 88);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param2 != -2) {
            ((eb) this).a(-10, 84, (byte) 118, 88);
            return;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = 0;
        field_E = "Password: ";
        field_J = new String[]{"Get a soldier to 90% accuracy", "Get a soldier to 90 health points", "Get a soldier to 10 kills", "Get a soldier to 25 kills", "Progress a soldier to captain", "Complete a mission after ACT I with no injuries", "Complete a mission after ACT I just using grenades", "Complete a mission after ACT I using high explosive weapons only (not grenades)", "Complete a mission after ACT I using just pistols", "Complete ACT I", "Complete ACT II", "Complete ACT III", "Complete ACT IV", "Complete the game using no researched technology", "Complete the game without recruiting any new soldiers on normal difficulty", "Complete the game on hard difficulty", "Defeat the zombie hordes within the city during the Hallowe'en holiday"};
        field_G = "Select mission";
    }
}
