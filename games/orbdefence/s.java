/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class s extends pj {
    static int field_x;
    static sh field_A;
    private boolean field_z;
    private boolean field_B;
    static String[] field_E;
    static dj field_y;
    boolean field_D;
    boolean field_F;
    static mg field_C;

    public static void i(int param0) {
        field_y = null;
        field_A = null;
        if (param0 <= 7) {
          field_x = -57;
          field_E = null;
          field_C = null;
          return;
        } else {
          field_E = null;
          field_C = null;
          return;
        }
    }

    final void h(int param0) {
        Object var3 = null;
        if (param0 == 0) {
          if (((s) this).field_z) {
            ((s) this).field_z = false;
            if (null != ((s) this).field_h) {
              if (!(((s) this).field_h instanceof sb)) {
                return;
              } else {
                ((sb) (Object) ((s) this).field_h).a((pj) this, ((s) this).field_z, param0 ^ -119);
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
          StringBuilder discarded$4 = ((s) this).a((byte) 0, (Hashtable) null, -79, (StringBuilder) null);
          if (((s) this).field_z) {
            ((s) this).field_z = false;
            if (null != ((s) this).field_h) {
              if (!(((s) this).field_h instanceof sb)) {
                return;
              } else {
                ((sb) (Object) ((s) this).field_h).a((pj) this, ((s) this).field_z, param0 ^ -119);
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

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        if (((s) this).a(9882, param3, param2, param1)) {
          L0: {
            ((s) this).a(param2, (byte) -122, param1, param3);
            if (((s) this).field_D) {
              StringBuilder discarded$8 = param3.append(" active");
              break L0;
            } else {
              break L0;
            }
          }
          if (((s) this).field_F) {
            if (param0 >= -23) {
              return null;
            } else {
              return param3;
            }
          } else {
            StringBuilder discarded$9 = param3.append(" disabled");
            if (param0 >= -23) {
              return null;
            } else {
              return param3;
            }
          }
        } else {
          if (param0 >= -23) {
            return null;
          } else {
            return param3;
          }
        }
    }

    final boolean d(int param0) {
        if (param0 != -81) {
            return true;
        }
        return ((s) this).field_z;
    }

    s(String param0, td param1, ag param2) {
        super(param0, param1, param2);
        ((s) this).field_B = true;
        ((s) this).field_z = false;
        ((s) this).field_F = true;
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param0 == 84) {
          if (null != ((s) this).field_h) {
            if (!(((s) this).field_h instanceof ai)) {
              return;
            } else {
              ((ai) (Object) ((s) this).field_h).a((byte) -115, param3, param1, (s) this, param2);
              return;
            }
          } else {
            return;
          }
        } else {
          ((s) this).field_F = true;
          if (null == ((s) this).field_h) {
            return;
          } else {
            L0: {
              if (((s) this).field_h instanceof ai) {
                ((ai) (Object) ((s) this).field_h).a((byte) -115, param3, param1, (s) this, param2);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          }
        }
    }

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        if (((s) this).field_h != null) {
          if (((s) this).field_h instanceof gh) {
            ((gh) (Object) ((s) this).field_h).a(param5, 4071, param0, param4, param1, (s) this);
            if (param2 >= -91) {
              return;
            } else {
              ((s) this).field_v = 0;
              return;
            }
          } else {
            if (param2 >= -91) {
              return;
            } else {
              ((s) this).field_v = 0;
              return;
            }
          }
        } else {
          if (param2 >= -91) {
            return;
          } else {
            ((s) this).field_v = 0;
            return;
          }
        }
    }

    boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        Object var9 = null;
        if (param0 <= -115) {
          if (((s) this).field_F) {
            if (((s) this).a((byte) 3, param5, param4, param6, param3)) {
              boolean discarded$2 = ((s) this).a(-81, param1);
              ((s) this).field_v = param2;
              if (null != ((s) this).field_h) {
                if (!(((s) this).field_h instanceof gh)) {
                  return true;
                } else {
                  ((gh) (Object) ((s) this).field_h).a(param2, param5, param4, (s) this, param3, param6, (byte) 1);
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
        } else {
          var9 = null;
          ((s) this).a((byte) -30, (pj) null, 51, 84);
          if (((s) this).field_F) {
            if (((s) this).a((byte) 3, param5, param4, param6, param3)) {
              boolean discarded$3 = ((s) this).a(-81, param1);
              ((s) this).field_v = param2;
              if (null != ((s) this).field_h) {
                if (!(((s) this).field_h instanceof gh)) {
                  return true;
                } else {
                  ((gh) (Object) ((s) this).field_h).a(param2, param5, param4, (s) this, param3, param6, (byte) 1);
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
    }

    void a(byte param0, pj param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (-1 != (((s) this).field_v ^ -1)) {
          if (((s) this).field_v != of.field_G) {
            if (((s) this).a((byte) 3, ua.field_a, vl.field_d, param3, param2)) {
              if (0 == of.field_G) {
                ((s) this).b(84, vl.field_d - param3, ((s) this).field_v, -param2 + ua.field_a);
                ((s) this).a(param3, ua.field_a, (byte) -103, param1, param2, vl.field_d);
                return;
              } else {
                ((s) this).a(param3, ua.field_a, (byte) -103, param1, param2, vl.field_d);
                return;
              }
            } else {
              ((s) this).a(param3, ua.field_a, (byte) -103, param1, param2, vl.field_d);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        if (param3 == 0) {
          if (((s) this).d(-81)) {
            if (84 != param1) {
              if (param1 != 83) {
                return false;
              } else {
                ((s) this).b(param3 ^ 84, -1, 1, -1);
                return true;
              }
            } else {
              ((s) this).b(param3 ^ 84, -1, 1, -1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((s) this).field_B = true;
          if (((s) this).d(-81)) {
            if (84 != param1) {
              if (param1 == 83) {
                ((s) this).b(param3 ^ 84, -1, 1, -1);
                return true;
              } else {
                return false;
              }
            } else {
              ((s) this).b(param3 ^ 84, -1, 1, -1);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    boolean a(int param0, pj param1) {
        if (((s) this).field_F) {
          if (((s) this).field_B) {
            if (param0 == -81) {
              L0: {
                param1.h(0);
                ((s) this).field_z = true;
                if (((s) this).field_h == null) {
                  break L0;
                } else {
                  if (!(((s) this).field_h instanceof sb)) {
                    break L0;
                  } else {
                    ((sb) (Object) ((s) this).field_h).a((pj) this, ((s) this).field_z, 22);
                    return true;
                  }
                }
              }
              return true;
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    s(String param0, ag param1) {
        this(param0, mb.field_a.field_l, param1);
    }

    protected s() {
        ((s) this).field_B = true;
        ((s) this).field_z = false;
        ((s) this).field_F = true;
        ((s) this).field_j = mb.field_a.field_c;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = null;
        field_E = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
