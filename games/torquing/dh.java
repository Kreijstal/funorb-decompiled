/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh implements Iterator {
    static String field_d;
    static String[] field_a;
    private int field_c;
    private q field_f;
    private vl field_e;
    private q field_b;

    public static void a(boolean param0) {
        if (!param0) {
            field_d = null;
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_141_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        var3 = Torquing.field_u;
        if (0 == (nd.field_a ^ -1)) {
          if (ad.field_n != -1) {
            L0: {
              L1: {
                lp.field_b = lp.field_b + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) wb.field_t)) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  if (wb.field_t != null) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (!jd.field_E) {
                  if (lp.field_b >= um.field_l) {
                    if (lp.field_b < uf.field_g + um.field_l) {
                      stackOut_139_0 = 1;
                      stackIn_141_0 = stackOut_139_0;
                      break L2;
                    } else {
                      stackOut_138_0 = 0;
                      stackIn_141_0 = stackOut_138_0;
                      break L2;
                    }
                  } else {
                    stackOut_136_0 = 0;
                    stackIn_141_0 = stackOut_136_0;
                    break L2;
                  }
                } else {
                  stackOut_134_0 = 0;
                  stackIn_141_0 = stackOut_134_0;
                  break L2;
                }
              }
              L3: {
                var2 = stackIn_141_0;
                if (param0 == null) {
                  lp.field_b = 0;
                  break L3;
                } else {
                  L4: {
                    if (jd.field_E) {
                      break L4;
                    } else {
                      if (var2 != 0) {
                        break L4;
                      } else {
                        lp.field_b = 0;
                        break L3;
                      }
                    }
                  }
                  lp.field_b = um.field_l;
                  break L3;
                }
              }
              ha.field_a = nd.field_a;
              ll.field_i = ad.field_n;
              if (param0 == null) {
                if (var2 == 0) {
                  break L0;
                } else {
                  jd.field_E = true;
                  break L0;
                }
              } else {
                jd.field_E = false;
                break L0;
              }
            }
            L5: {
              wb.field_t = param0;
              if (!jd.field_E) {
                if (!jd.field_E) {
                  break L5;
                } else {
                  if (fj.field_m != lp.field_b) {
                    break L5;
                  } else {
                    jd.field_E = false;
                    lp.field_b = 0;
                    break L5;
                  }
                }
              } else {
                if (!jd.field_E) {
                  break L5;
                } else {
                  if (fj.field_m != lp.field_b) {
                    break L5;
                  } else {
                    jd.field_E = false;
                    lp.field_b = 0;
                    break L5;
                  }
                }
              }
            }
            nd.field_a = param1;
            ad.field_n = -1;
            return;
          } else {
            L6: {
              L7: {
                ad.field_n = k.field_e;
                nd.field_a = n.field_t;
                lp.field_b = lp.field_b + 1;
                if (param0 != null) {
                  if (param0.equals((Object) (Object) wb.field_t)) {
                    break L6;
                  } else {
                    break L7;
                  }
                } else {
                  if (wb.field_t != null) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (!jd.field_E) {
                  if (lp.field_b >= um.field_l) {
                    if (lp.field_b >= uf.field_g + um.field_l) {
                      stackOut_106_0 = 0;
                      stackIn_108_0 = stackOut_106_0;
                      break L8;
                    } else {
                      stackOut_105_0 = 1;
                      stackIn_108_0 = stackOut_105_0;
                      break L8;
                    }
                  } else {
                    stackOut_103_0 = 0;
                    stackIn_108_0 = stackOut_103_0;
                    break L8;
                  }
                } else {
                  stackOut_101_0 = 0;
                  stackIn_108_0 = stackOut_101_0;
                  break L8;
                }
              }
              L9: {
                var2 = stackIn_108_0;
                if (param0 == null) {
                  lp.field_b = 0;
                  break L9;
                } else {
                  L10: {
                    if (jd.field_E) {
                      break L10;
                    } else {
                      if (var2 != 0) {
                        break L10;
                      } else {
                        lp.field_b = 0;
                        break L9;
                      }
                    }
                  }
                  lp.field_b = um.field_l;
                  break L9;
                }
              }
              ha.field_a = nd.field_a;
              ll.field_i = ad.field_n;
              if (param0 == null) {
                if (var2 == 0) {
                  break L6;
                } else {
                  jd.field_E = true;
                  break L6;
                }
              } else {
                jd.field_E = false;
                break L6;
              }
            }
            L11: {
              wb.field_t = param0;
              if (!jd.field_E) {
                if (!jd.field_E) {
                  break L11;
                } else {
                  if (fj.field_m != lp.field_b) {
                    break L11;
                  } else {
                    jd.field_E = false;
                    lp.field_b = 0;
                    break L11;
                  }
                }
              } else {
                if (!jd.field_E) {
                  break L11;
                } else {
                  if (fj.field_m != lp.field_b) {
                    break L11;
                  } else {
                    jd.field_E = false;
                    lp.field_b = 0;
                    break L11;
                  }
                }
              }
            }
            nd.field_a = param1;
            ad.field_n = -1;
            return;
          }
        } else {
          lp.field_b = lp.field_b + 1;
          if (param0 != null) {
            if (param0.equals((Object) (Object) wb.field_t)) {
              L12: {
                wb.field_t = param0;
                if (jd.field_E) {
                  break L12;
                } else {
                  if (um.field_l <= lp.field_b) {
                    break L12;
                  } else {
                    if (he.field_a) {
                      ll.field_i = ad.field_n;
                      lp.field_b = 0;
                      ha.field_a = nd.field_a;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              L13: {
                L14: {
                  if (!jd.field_E) {
                    break L14;
                  } else {
                    if (fj.field_m != lp.field_b) {
                      break L14;
                    } else {
                      jd.field_E = false;
                      lp.field_b = 0;
                      nd.field_a = param1;
                      ad.field_n = -1;
                      break L13;
                    }
                  }
                }
                nd.field_a = param1;
                ad.field_n = -1;
                break L13;
              }
              return;
            } else {
              L15: {
                if (!jd.field_E) {
                  if (lp.field_b >= um.field_l) {
                    if (lp.field_b < uf.field_g + um.field_l) {
                      stackOut_55_0 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      break L15;
                    } else {
                      stackOut_54_0 = 0;
                      stackIn_57_0 = stackOut_54_0;
                      break L15;
                    }
                  } else {
                    stackOut_52_0 = 0;
                    stackIn_57_0 = stackOut_52_0;
                    break L15;
                  }
                } else {
                  stackOut_50_0 = 0;
                  stackIn_57_0 = stackOut_50_0;
                  break L15;
                }
              }
              L16: {
                var2 = stackIn_57_0;
                if (param0 == null) {
                  lp.field_b = 0;
                  break L16;
                } else {
                  if (!jd.field_E) {
                    if (var2 == 0) {
                      lp.field_b = 0;
                      break L16;
                    } else {
                      lp.field_b = um.field_l;
                      break L16;
                    }
                  } else {
                    lp.field_b = um.field_l;
                    break L16;
                  }
                }
              }
              L17: {
                ha.field_a = nd.field_a;
                ll.field_i = ad.field_n;
                if (param0 == null) {
                  if (var2 == 0) {
                    break L17;
                  } else {
                    jd.field_E = true;
                    break L17;
                  }
                } else {
                  jd.field_E = false;
                  break L17;
                }
              }
              L18: {
                wb.field_t = param0;
                if (jd.field_E) {
                  break L18;
                } else {
                  if (um.field_l <= lp.field_b) {
                    break L18;
                  } else {
                    if (he.field_a) {
                      ll.field_i = ad.field_n;
                      lp.field_b = 0;
                      ha.field_a = nd.field_a;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              L19: {
                L20: {
                  if (!jd.field_E) {
                    break L20;
                  } else {
                    if (fj.field_m != lp.field_b) {
                      break L20;
                    } else {
                      jd.field_E = false;
                      lp.field_b = 0;
                      nd.field_a = param1;
                      ad.field_n = -1;
                      break L19;
                    }
                  }
                }
                nd.field_a = param1;
                ad.field_n = -1;
                break L19;
              }
              return;
            }
          } else {
            if (wb.field_t != null) {
              L21: {
                wb.field_t = param0;
                if (jd.field_E) {
                  break L21;
                } else {
                  if (um.field_l <= lp.field_b) {
                    break L21;
                  } else {
                    if (he.field_a) {
                      ll.field_i = ad.field_n;
                      lp.field_b = 0;
                      ha.field_a = nd.field_a;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              L22: {
                L23: {
                  if (!jd.field_E) {
                    break L23;
                  } else {
                    if (fj.field_m != lp.field_b) {
                      break L23;
                    } else {
                      jd.field_E = false;
                      lp.field_b = 0;
                      nd.field_a = param1;
                      ad.field_n = -1;
                      break L22;
                    }
                  }
                }
                nd.field_a = param1;
                ad.field_n = -1;
                break L22;
              }
              return;
            } else {
              L24: {
                if (!jd.field_E) {
                  if (lp.field_b >= um.field_l) {
                    if (lp.field_b < uf.field_g + um.field_l) {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L24;
                    } else {
                      stackOut_8_0 = 0;
                      stackIn_11_0 = stackOut_8_0;
                      break L24;
                    }
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_11_0 = stackOut_6_0;
                    break L24;
                  }
                } else {
                  stackOut_4_0 = 0;
                  stackIn_11_0 = stackOut_4_0;
                  break L24;
                }
              }
              L25: {
                L26: {
                  var2 = stackIn_11_0;
                  if (param0 == null) {
                    break L26;
                  } else {
                    if (!jd.field_E) {
                      if (var2 == 0) {
                        break L26;
                      } else {
                        lp.field_b = um.field_l;
                        break L25;
                      }
                    } else {
                      lp.field_b = um.field_l;
                      break L25;
                    }
                  }
                }
                lp.field_b = 0;
                break L25;
              }
              L27: {
                ha.field_a = nd.field_a;
                ll.field_i = ad.field_n;
                if (param0 == null) {
                  if (var2 == 0) {
                    break L27;
                  } else {
                    jd.field_E = true;
                    break L27;
                  }
                } else {
                  jd.field_E = false;
                  break L27;
                }
              }
              L28: {
                wb.field_t = param0;
                if (jd.field_E) {
                  break L28;
                } else {
                  if (um.field_l <= lp.field_b) {
                    break L28;
                  } else {
                    if (he.field_a) {
                      ll.field_i = ad.field_n;
                      lp.field_b = 0;
                      ha.field_a = nd.field_a;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                }
              }
              L29: {
                L30: {
                  if (!jd.field_E) {
                    break L30;
                  } else {
                    if (fj.field_m != lp.field_b) {
                      break L30;
                    } else {
                      jd.field_E = false;
                      lp.field_b = 0;
                      nd.field_a = param1;
                      ad.field_n = -1;
                      break L29;
                    }
                  }
                }
                nd.field_a = param1;
                ad.field_n = -1;
                break L29;
              }
              return;
            }
          }
        }
    }

    public final Object next() {
        q var1 = null;
        int var2 = 0;
        var2 = Torquing.field_u;
        if (((dh) this).field_b != ((dh) this).field_e.field_a[-1 + ((dh) this).field_c]) {
          var1 = ((dh) this).field_b;
          ((dh) this).field_b = var1.field_e;
          ((dh) this).field_f = var1;
          return (Object) (Object) var1;
        } else {
          L0: while (true) {
            if (((dh) this).field_c < ((dh) this).field_e.field_e) {
              int fieldTemp$2 = ((dh) this).field_c;
              ((dh) this).field_c = ((dh) this).field_c + 1;
              var1 = ((dh) this).field_e.field_a[fieldTemp$2].field_e;
              if (((dh) this).field_e.field_a[-1 + ((dh) this).field_c] != var1) {
                ((dh) this).field_b = var1.field_e;
                ((dh) this).field_f = var1;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = Torquing.field_u;
        if (((dh) this).field_e.field_a[-1 + ((dh) this).field_c] != ((dh) this).field_b) {
          return true;
        } else {
          L0: while (true) {
            if (((dh) this).field_c < ((dh) this).field_e.field_e) {
              int fieldTemp$2 = ((dh) this).field_c;
              ((dh) this).field_c = ((dh) this).field_c + 1;
              if (((dh) this).field_e.field_a[fieldTemp$2].field_e == ((dh) this).field_e.field_a[((dh) this).field_c + -1]) {
                ((dh) this).field_b = ((dh) this).field_e.field_a[-1 + ((dh) this).field_c];
                continue L0;
              } else {
                ((dh) this).field_b = ((dh) this).field_e.field_a[((dh) this).field_c + -1].field_e;
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    public final void remove() {
        if (!(((dh) this).field_f != null)) {
            throw new IllegalStateException();
        }
        ((dh) this).field_f.f(0);
        ((dh) this).field_f = null;
    }

    private final void a(int param0) {
        ((dh) this).field_b = ((dh) this).field_e.field_a[param0].field_e;
        ((dh) this).field_c = 1;
        ((dh) this).field_f = null;
    }

    dh(vl param0) {
        ((dh) this).field_f = null;
        ((dh) this).field_e = param0;
        this.a(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "OK";
    }
}
