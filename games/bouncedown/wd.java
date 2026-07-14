/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wd extends lk {
    static boolean field_x;
    private boolean field_A;
    boolean field_y;
    boolean field_z;
    private boolean field_w;

    void a(int param0, int param1, int param2, lk param3) {
        super.a(param0, param1, param2, param3);
        if (-1 != ((wd) this).field_u) {
          if (((wd) this).field_u != n.field_m) {
            if (!((wd) this).c(uc.field_C, 0, param2, param1, ll.field_y)) {
              ((wd) this).a(ll.field_y, param1, param3, param2, 34, uc.field_C);
              return;
            } else {
              if (-1 == n.field_m) {
                ((wd) this).a(ll.field_y - param2, uc.field_C - param1, (byte) -127, ((wd) this).field_u);
                ((wd) this).a(ll.field_y, param1, param3, param2, 34, uc.field_C);
                return;
              } else {
                ((wd) this).a(ll.field_y, param1, param3, param2, 34, uc.field_C);
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

    boolean a(int param0, lk param1, int param2, int param3, int param4, int param5, int param6) {
        if (!((wd) this).field_y) {
          if (param4 != 28455) {
            return false;
          } else {
            return false;
          }
        } else {
          if (((wd) this).c(param3, param4 + -28455, param6, param2, param5)) {
            boolean discarded$2 = ((wd) this).a(param1, false);
            ((wd) this).field_u = param0;
            if (((wd) this).field_n != null) {
              if (!(((wd) this).field_n instanceof cc)) {
                return true;
              } else {
                ((cc) (Object) ((wd) this).field_n).a(74, (wd) this, param3, param2, param6, param5, param0);
                return true;
              }
            } else {
              return true;
            }
          } else {
            if (param4 != 28455) {
              return false;
            } else {
              return false;
            }
          }
        }
    }

    wd(String param0, fc param1, sk param2) {
        super(param0, param1, param2);
        ((wd) this).field_y = true;
        ((wd) this).field_A = false;
        ((wd) this).field_w = true;
    }

    final void a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        if (param4 == 34) {
          if (null != ((wd) this).field_n) {
            if (!(((wd) this).field_n instanceof cc)) {
              ((wd) this).field_u = 0;
              return;
            } else {
              ((cc) (Object) ((wd) this).field_n).a(param3, param5, (wd) this, -53, param0, param1);
              ((wd) this).field_u = 0;
              return;
            }
          } else {
            ((wd) this).field_u = 0;
            return;
          }
        } else {
          ((wd) this).field_z = true;
          if (null == ((wd) this).field_n) {
            ((wd) this).field_u = 0;
            return;
          } else {
            L0: {
              if (((wd) this).field_n instanceof cc) {
                ((cc) (Object) ((wd) this).field_n).a(param3, param5, (wd) this, -53, param0, param1);
                break L0;
              } else {
                break L0;
              }
            }
            ((wd) this).field_u = 0;
            return;
          }
        }
    }

    final StringBuilder a(int param0, boolean param1, Hashtable param2, StringBuilder param3) {
        if (param1) {
          if (((wd) this).a(param2, param3, (byte) 14, param0)) {
            L0: {
              ((wd) this).a(param0, param3, param2, 32362);
              if (((wd) this).field_z) {
                StringBuilder discarded$4 = param3.append(" active");
                break L0;
              } else {
                break L0;
              }
            }
            if (((wd) this).field_y) {
              return param3;
            } else {
              StringBuilder discarded$5 = param3.append(" disabled");
              return param3;
            }
          } else {
            return param3;
          }
        } else {
          return null;
        }
    }

    boolean a(lk param0, boolean param1) {
        Object var4 = null;
        if (((wd) this).field_y) {
          if (((wd) this).field_w) {
            param0.c((byte) 102);
            if (!param1) {
              ((wd) this).field_A = true;
              if (((wd) this).field_n != null) {
                if (!(((wd) this).field_n instanceof dc)) {
                  return true;
                } else {
                  ((dc) (Object) ((wd) this).field_n).a(-78, ((wd) this).field_A, (lk) this);
                  return true;
                }
              } else {
                return true;
              }
            } else {
              var4 = null;
              ((wd) this).a(-13, 60, -58, (lk) null);
              ((wd) this).field_A = true;
              if (((wd) this).field_n != null) {
                if (!(((wd) this).field_n instanceof dc)) {
                  return true;
                } else {
                  ((dc) (Object) ((wd) this).field_n).a(-78, ((wd) this).field_A, (lk) this);
                  return true;
                }
              } else {
                return true;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    boolean a(lk param0, char param1, int param2, int param3) {
        if (param3 == -14565) {
          if (((wd) this).e(1)) {
            if (param2 != 84) {
              if (-84 != (param2 ^ -1)) {
                return false;
              } else {
                ((wd) this).a(-1, -1, (byte) -119, 1);
                return true;
              }
            } else {
              ((wd) this).a(-1, -1, (byte) -119, 1);
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((wd) this).a(22, 87, (byte) -62, 99);
          if (((wd) this).e(1)) {
            if (param2 != 84) {
              if (-84 != (param2 ^ -1)) {
                return false;
              } else {
                ((wd) this).a(-1, -1, (byte) -119, 1);
                return true;
              }
            } else {
              ((wd) this).a(-1, -1, (byte) -119, 1);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param1 < -71) {
          if (0 != param0) {
            if (param0 < -1) {
              L0: {
                var2 = 1;
                if (-65536 < param0) {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L0;
                } else {
                  break L0;
                }
              }
              L1: {
                if ((param0 ^ -1) < -256) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param0 > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if ((param0 ^ -1) >= -4) {
                  break L3;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L3;
                }
              }
              L4: {
                if (param0 < -2) {
                  var2++;
                  param0 = param0 >> 1;
                  break L4;
                } else {
                  break L4;
                }
              }
              return var2;
            } else {
              L5: {
                var2 = 2;
                if (65535 > param0) {
                  param0 = param0 >> 16;
                  var2 += 16;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (-256 <= param0) {
                  break L6;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L6;
                }
              }
              L7: {
                if (param0 > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (3 <= param0) {
                  break L8;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L8;
                }
              }
              L9: {
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            }
          } else {
            return 0;
          }
        } else {
          field_x = false;
          if (0 != param0) {
            if (param0 < -1) {
              L10: {
                var2 = 1;
                if (-65536 < param0) {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if ((param0 ^ -1) < -256) {
                  param0 = param0 >> 8;
                  var2 += 8;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (param0 > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if ((param0 ^ -1) >= -4) {
                  break L13;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L13;
                }
              }
              L14: {
                if (param0 < -2) {
                  var2++;
                  param0 = param0 >> 1;
                  break L14;
                } else {
                  break L14;
                }
              }
              return var2;
            } else {
              L15: {
                var2 = 2;
                if (65535 > param0) {
                  param0 = param0 >> 16;
                  var2 += 16;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (-256 <= param0) {
                  break L16;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L16;
                }
              }
              L17: {
                if (param0 > 15) {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L17;
                } else {
                  break L17;
                }
              }
              L18: {
                if (3 <= param0) {
                  break L18;
                } else {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L18;
                }
              }
              L19: {
                if ((param0 ^ -1) > 1) {
                  var2++;
                  param0 = param0 >> 1;
                  break L19;
                } else {
                  break L19;
                }
              }
              return var2;
            }
          } else {
            return 0;
          }
        }
    }

    final void c(byte param0) {
        if (param0 >= 80) {
          if (((wd) this).field_A) {
            ((wd) this).field_A = false;
            if (((wd) this).field_n != null) {
              if (!(((wd) this).field_n instanceof dc)) {
                return;
              } else {
                ((dc) (Object) ((wd) this).field_n).a(-70, ((wd) this).field_A, (lk) this);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((wd) this).field_w = true;
          if (((wd) this).field_A) {
            ((wd) this).field_A = false;
            if (((wd) this).field_n != null) {
              if (!(((wd) this).field_n instanceof dc)) {
                return;
              } else {
                ((dc) (Object) ((wd) this).field_n).a(-70, ((wd) this).field_A, (lk) this);
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

    final boolean e(int param0) {
        if (param0 != 1) {
            ((wd) this).field_z = false;
            return ((wd) this).field_A;
        }
        return ((wd) this).field_A;
    }

    void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        L0: {
          if (null == ((wd) this).field_n) {
            break L0;
          } else {
            if (((wd) this).field_n instanceof rc) {
              ((rc) (Object) ((wd) this).field_n).a((byte) 110, param0, param3, param1, (wd) this);
              break L0;
            } else {
              if (param2 < -77) {
                return;
              } else {
                var6 = null;
                ((wd) this).a(-122, -33, 38, (lk) null);
                return;
              }
            }
          }
        }
        if (param2 >= -77) {
          var6 = null;
          ((wd) this).a(-122, -33, 38, (lk) null);
          return;
        } else {
          return;
        }
    }

    wd(String param0, sk param1) {
        this(param0, ma.field_m.field_b, param1);
    }

    protected wd() {
        ((wd) this).field_y = true;
        ((wd) this).field_A = false;
        ((wd) this).field_w = true;
        ((wd) this).field_j = ma.field_m.field_l;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = true;
    }
}
