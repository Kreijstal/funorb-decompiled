/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class pd {
    java.awt.Image field_g;
    int field_a;
    static String field_b;
    static int[] field_e;
    int[] field_h;
    static Calendar field_f;
    static boolean field_c;
    int field_d;

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
            field_e = null;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            return;
        }
        mi.a(((pd) this).field_h, ((pd) this).field_a, ((pd) this).field_d);
    }

    abstract void a(int param0, int param1, int param2, java.awt.Graphics param3);

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        int stackIn_12_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_134_0 = 0;
        int stackIn_179_0 = 0;
        int stackOut_178_0 = 0;
        int stackOut_177_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        if ((ch.field_b ^ -1) == 0) {
          if (0 != (ql.field_v ^ -1)) {
            kk.field_d = kk.field_d + 1;
            if (param1 == null) {
              L0: {
                if (s.field_ib == null) {
                  L1: {
                    if (!ab.field_u) {
                      if (kg.field_e <= kk.field_d) {
                        if (kg.field_e - -wi.field_l <= kk.field_d) {
                          stackOut_178_0 = 0;
                          stackIn_179_0 = stackOut_178_0;
                          break L1;
                        } else {
                          stackOut_177_0 = 1;
                          stackIn_179_0 = stackOut_177_0;
                          break L1;
                        }
                      } else {
                        stackOut_175_0 = 0;
                        stackIn_179_0 = stackOut_175_0;
                        break L1;
                      }
                    } else {
                      stackOut_173_0 = 0;
                      stackIn_179_0 = stackOut_173_0;
                      break L1;
                    }
                  }
                  L2: {
                    L3: {
                      var2 = stackIn_179_0;
                      if (param1 == null) {
                        break L3;
                      } else {
                        if (ab.field_u) {
                          kk.field_d = kg.field_e;
                          break L2;
                        } else {
                          if (var2 == 0) {
                            break L3;
                          } else {
                            kk.field_d = kg.field_e;
                            break L2;
                          }
                        }
                      }
                    }
                    kk.field_d = 0;
                    break L2;
                  }
                  L4: {
                    bf.field_a = ch.field_b;
                    if (param1 == null) {
                      if (var2 != 0) {
                        ab.field_u = true;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      ab.field_u = false;
                      break L4;
                    }
                  }
                  kd.field_c = ql.field_v;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (ab.field_u) {
                L5: {
                  if (param0 >= 122) {
                    break L5;
                  } else {
                    var4 = null;
                    pd.a(95, (String) null);
                    break L5;
                  }
                }
                L6: {
                  s.field_ib = param1;
                  if (!ab.field_u) {
                    break L6;
                  } else {
                    if (kk.field_d != pj.field_A) {
                      break L6;
                    } else {
                      kk.field_d = 0;
                      ab.field_u = false;
                      break L6;
                    }
                  }
                }
                ch.field_b = -1;
                ql.field_v = -1;
                return;
              } else {
                L7: {
                  if (kg.field_e <= kk.field_d) {
                    break L7;
                  } else {
                    if (ne.field_d) {
                      kd.field_c = ql.field_v;
                      bf.field_a = ch.field_b;
                      kk.field_d = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (param0 >= 122) {
                    break L8;
                  } else {
                    var4 = null;
                    pd.a(95, (String) null);
                    break L8;
                  }
                }
                L9: {
                  s.field_ib = param1;
                  if (!ab.field_u) {
                    break L9;
                  } else {
                    if (kk.field_d != pj.field_A) {
                      break L9;
                    } else {
                      kk.field_d = 0;
                      ab.field_u = false;
                      break L9;
                    }
                  }
                }
                ch.field_b = -1;
                ql.field_v = -1;
                return;
              }
            } else {
              if (param1.equals((Object) (Object) s.field_ib)) {
                L10: {
                  if (ab.field_u) {
                    break L10;
                  } else {
                    if (kg.field_e <= kk.field_d) {
                      break L10;
                    } else {
                      if (ne.field_d) {
                        kd.field_c = ql.field_v;
                        bf.field_a = ch.field_b;
                        kk.field_d = 0;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                L11: {
                  if (param0 >= 122) {
                    break L11;
                  } else {
                    var4 = null;
                    pd.a(95, (String) null);
                    break L11;
                  }
                }
                L12: {
                  s.field_ib = param1;
                  if (!ab.field_u) {
                    break L12;
                  } else {
                    if (kk.field_d != pj.field_A) {
                      break L12;
                    } else {
                      kk.field_d = 0;
                      ab.field_u = false;
                      break L12;
                    }
                  }
                }
                ch.field_b = -1;
                ql.field_v = -1;
                return;
              } else {
                L13: {
                  if (!ab.field_u) {
                    if (kg.field_e <= kk.field_d) {
                      if (kg.field_e - -wi.field_l <= kk.field_d) {
                        stackOut_132_0 = 0;
                        stackIn_134_0 = stackOut_132_0;
                        break L13;
                      } else {
                        stackOut_131_0 = 1;
                        stackIn_134_0 = stackOut_131_0;
                        break L13;
                      }
                    } else {
                      stackOut_129_0 = 0;
                      stackIn_134_0 = stackOut_129_0;
                      break L13;
                    }
                  } else {
                    stackOut_127_0 = 0;
                    stackIn_134_0 = stackOut_127_0;
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    var2 = stackIn_134_0;
                    if (param1 == null) {
                      break L15;
                    } else {
                      if (ab.field_u) {
                        kk.field_d = kg.field_e;
                        break L14;
                      } else {
                        if (var2 == 0) {
                          break L15;
                        } else {
                          kk.field_d = kg.field_e;
                          break L14;
                        }
                      }
                    }
                  }
                  kk.field_d = 0;
                  break L14;
                }
                L16: {
                  bf.field_a = ch.field_b;
                  if (param1 == null) {
                    if (var2 != 0) {
                      ab.field_u = true;
                      break L16;
                    } else {
                      break L16;
                    }
                  } else {
                    ab.field_u = false;
                    break L16;
                  }
                }
                L17: {
                  kd.field_c = ql.field_v;
                  if (ab.field_u) {
                    break L17;
                  } else {
                    if (kg.field_e <= kk.field_d) {
                      break L17;
                    } else {
                      if (ne.field_d) {
                        kd.field_c = ql.field_v;
                        bf.field_a = ch.field_b;
                        kk.field_d = 0;
                        break L17;
                      } else {
                        break L17;
                      }
                    }
                  }
                }
                L18: {
                  if (param0 >= 122) {
                    break L18;
                  } else {
                    var4 = null;
                    pd.a(95, (String) null);
                    break L18;
                  }
                }
                L19: {
                  s.field_ib = param1;
                  if (!ab.field_u) {
                    break L19;
                  } else {
                    if (kk.field_d != pj.field_A) {
                      break L19;
                    } else {
                      kk.field_d = 0;
                      ab.field_u = false;
                      break L19;
                    }
                  }
                }
                ch.field_b = -1;
                ql.field_v = -1;
                return;
              }
            }
          } else {
            L20: {
              L21: {
                ql.field_v = ad.field_m;
                ch.field_b = gb.field_j;
                kk.field_d = kk.field_d + 1;
                if (param1 == null) {
                  if (s.field_ib == null) {
                    break L21;
                  } else {
                    break L20;
                  }
                } else {
                  if (param1.equals((Object) (Object) s.field_ib)) {
                    break L20;
                  } else {
                    break L21;
                  }
                }
              }
              L22: {
                if (!ab.field_u) {
                  if (kg.field_e <= kk.field_d) {
                    if (kg.field_e - -wi.field_l <= kk.field_d) {
                      stackOut_98_0 = 0;
                      stackIn_99_0 = stackOut_98_0;
                      break L22;
                    } else {
                      stackOut_97_0 = 1;
                      stackIn_99_0 = stackOut_97_0;
                      break L22;
                    }
                  } else {
                    stackOut_95_0 = 0;
                    stackIn_99_0 = stackOut_95_0;
                    break L22;
                  }
                } else {
                  stackOut_93_0 = 0;
                  stackIn_99_0 = stackOut_93_0;
                  break L22;
                }
              }
              L23: {
                L24: {
                  var2 = stackIn_99_0;
                  if (param1 == null) {
                    break L24;
                  } else {
                    if (ab.field_u) {
                      kk.field_d = kg.field_e;
                      break L23;
                    } else {
                      if (var2 == 0) {
                        break L24;
                      } else {
                        kk.field_d = kg.field_e;
                        break L23;
                      }
                    }
                  }
                }
                kk.field_d = 0;
                break L23;
              }
              L25: {
                bf.field_a = ch.field_b;
                if (param1 == null) {
                  if (var2 != 0) {
                    ab.field_u = true;
                    break L25;
                  } else {
                    break L25;
                  }
                } else {
                  ab.field_u = false;
                  break L25;
                }
              }
              kd.field_c = ql.field_v;
              break L20;
            }
            L26: {
              if (ab.field_u) {
                break L26;
              } else {
                if (kg.field_e <= kk.field_d) {
                  break L26;
                } else {
                  if (ne.field_d) {
                    kd.field_c = ql.field_v;
                    bf.field_a = ch.field_b;
                    kk.field_d = 0;
                    break L26;
                  } else {
                    break L26;
                  }
                }
              }
            }
            L27: {
              if (param0 >= 122) {
                break L27;
              } else {
                var4 = null;
                pd.a(95, (String) null);
                break L27;
              }
            }
            L28: {
              s.field_ib = param1;
              if (!ab.field_u) {
                break L28;
              } else {
                if (kk.field_d != pj.field_A) {
                  break L28;
                } else {
                  kk.field_d = 0;
                  ab.field_u = false;
                  break L28;
                }
              }
            }
            ch.field_b = -1;
            ql.field_v = -1;
            return;
          }
        } else {
          kk.field_d = kk.field_d + 1;
          if (param1 != null) {
            if (!param1.equals((Object) (Object) s.field_ib)) {
              L29: {
                if (!ab.field_u) {
                  if (kg.field_e <= kk.field_d) {
                    if (kg.field_e - -wi.field_l > kk.field_d) {
                      stackOut_55_0 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      break L29;
                    } else {
                      stackOut_54_0 = 0;
                      stackIn_57_0 = stackOut_54_0;
                      break L29;
                    }
                  } else {
                    stackOut_52_0 = 0;
                    stackIn_57_0 = stackOut_52_0;
                    break L29;
                  }
                } else {
                  stackOut_50_0 = 0;
                  stackIn_57_0 = stackOut_50_0;
                  break L29;
                }
              }
              L30: {
                var2 = stackIn_57_0;
                if (param1 != null) {
                  if (ab.field_u) {
                    kk.field_d = kg.field_e;
                    break L30;
                  } else {
                    if (var2 != 0) {
                      kk.field_d = kg.field_e;
                      break L30;
                    } else {
                      kk.field_d = 0;
                      break L30;
                    }
                  }
                } else {
                  kk.field_d = 0;
                  break L30;
                }
              }
              L31: {
                bf.field_a = ch.field_b;
                if (param1 == null) {
                  if (var2 != 0) {
                    ab.field_u = true;
                    break L31;
                  } else {
                    break L31;
                  }
                } else {
                  ab.field_u = false;
                  break L31;
                }
              }
              L32: {
                kd.field_c = ql.field_v;
                if (ab.field_u) {
                  break L32;
                } else {
                  if (kg.field_e <= kk.field_d) {
                    break L32;
                  } else {
                    if (ne.field_d) {
                      kd.field_c = ql.field_v;
                      bf.field_a = ch.field_b;
                      kk.field_d = 0;
                      break L32;
                    } else {
                      break L32;
                    }
                  }
                }
              }
              L33: {
                if (param0 >= 122) {
                  break L33;
                } else {
                  var4 = null;
                  pd.a(95, (String) null);
                  break L33;
                }
              }
              L34: {
                L35: {
                  s.field_ib = param1;
                  if (!ab.field_u) {
                    break L35;
                  } else {
                    if (kk.field_d != pj.field_A) {
                      break L35;
                    } else {
                      kk.field_d = 0;
                      ab.field_u = false;
                      ch.field_b = -1;
                      ql.field_v = -1;
                      break L34;
                    }
                  }
                }
                ch.field_b = -1;
                ql.field_v = -1;
                break L34;
              }
              return;
            } else {
              L36: {
                if (ab.field_u) {
                  break L36;
                } else {
                  if (kg.field_e <= kk.field_d) {
                    break L36;
                  } else {
                    if (ne.field_d) {
                      kd.field_c = ql.field_v;
                      bf.field_a = ch.field_b;
                      kk.field_d = 0;
                      break L36;
                    } else {
                      break L36;
                    }
                  }
                }
              }
              L37: {
                if (param0 >= 122) {
                  break L37;
                } else {
                  var4 = null;
                  pd.a(95, (String) null);
                  break L37;
                }
              }
              L38: {
                s.field_ib = param1;
                if (!ab.field_u) {
                  break L38;
                } else {
                  if (kk.field_d != pj.field_A) {
                    break L38;
                  } else {
                    kk.field_d = 0;
                    ab.field_u = false;
                    break L38;
                  }
                }
              }
              ch.field_b = -1;
              ql.field_v = -1;
              return;
            }
          } else {
            L39: {
              if (s.field_ib == null) {
                L40: {
                  if (!ab.field_u) {
                    if (kg.field_e <= kk.field_d) {
                      if (kg.field_e - -wi.field_l > kk.field_d) {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L40;
                      } else {
                        stackOut_9_0 = 0;
                        stackIn_12_0 = stackOut_9_0;
                        break L40;
                      }
                    } else {
                      stackOut_7_0 = 0;
                      stackIn_12_0 = stackOut_7_0;
                      break L40;
                    }
                  } else {
                    stackOut_5_0 = 0;
                    stackIn_12_0 = stackOut_5_0;
                    break L40;
                  }
                }
                L41: {
                  var2 = stackIn_12_0;
                  if (param1 != null) {
                    L42: {
                      if (ab.field_u) {
                        break L42;
                      } else {
                        if (var2 != 0) {
                          break L42;
                        } else {
                          kk.field_d = 0;
                          break L41;
                        }
                      }
                    }
                    kk.field_d = kg.field_e;
                    break L41;
                  } else {
                    kk.field_d = 0;
                    break L41;
                  }
                }
                L43: {
                  bf.field_a = ch.field_b;
                  if (param1 == null) {
                    if (var2 != 0) {
                      ab.field_u = true;
                      break L43;
                    } else {
                      break L43;
                    }
                  } else {
                    ab.field_u = false;
                    break L43;
                  }
                }
                kd.field_c = ql.field_v;
                break L39;
              } else {
                break L39;
              }
            }
            L44: {
              if (ab.field_u) {
                break L44;
              } else {
                if (kg.field_e <= kk.field_d) {
                  break L44;
                } else {
                  if (ne.field_d) {
                    kd.field_c = ql.field_v;
                    bf.field_a = ch.field_b;
                    kk.field_d = 0;
                    break L44;
                  } else {
                    break L44;
                  }
                }
              }
            }
            L45: {
              if (param0 >= 122) {
                break L45;
              } else {
                var4 = null;
                pd.a(95, (String) null);
                break L45;
              }
            }
            L46: {
              s.field_ib = param1;
              if (!ab.field_u) {
                break L46;
              } else {
                if (kk.field_d != pj.field_A) {
                  break L46;
                } else {
                  kk.field_d = 0;
                  ab.field_u = false;
                  break L46;
                }
              }
            }
            ch.field_b = -1;
            ql.field_v = -1;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Visit the Account Management section on the main site to view.";
        field_f = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
