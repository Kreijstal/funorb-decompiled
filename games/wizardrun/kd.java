/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd {
    static String field_b;
    static wd field_a;
    static boolean field_c;

    final static int a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = wizardrun.field_H;
        sb.field_d = sb.field_d + 65536;
        if (param0 == 586) {
          L0: while (true) {
            if (uf.a(sb.field_d, fl.field_V, 65535) < 65536) {
              L1: {
                var2 = -1;
                if (null != f.field_d) {
                  var2 = f.field_d.length;
                  break L1;
                } else {
                  if (dc.field_s != null) {
                    var2 = dc.field_s.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (-1 != var2) {
                  L3: {
                    if (fl.field_u > od.field_j) {
                      L4: {
                        od.field_j = od.field_j + 1;
                        if (fl.field_M >= od.field_j) {
                          break L4;
                        } else {
                          L5: {
                            if (null == f.field_d) {
                              break L5;
                            } else {
                              if (null != f.field_d[ej.field_c]) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          od.field_j = od.field_j - 1;
                          break L3;
                        }
                      }
                      if (od.field_j < fl.field_u) {
                        break L3;
                      } else {
                        if (null == f.field_d[(1 + ej.field_c) % var2]) {
                          od.field_j = od.field_j - 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L6: {
                    if (fl.field_u <= od.field_j) {
                      ra.field_o = ej.field_c;
                      if (ei.field_j) {
                        ej.field_c = ej.field_c + 1;
                        if (ej.field_c >= var2) {
                          ej.field_c = ej.field_c - var2;
                          od.field_j = od.field_j - fl.field_u;
                          break L6;
                        } else {
                          od.field_j = od.field_j - fl.field_u;
                          break L6;
                        }
                      } else {
                        ej.field_c = ej.field_c - 1;
                        if ((ej.field_c ^ -1) > -1) {
                          ej.field_c = ej.field_c + var2;
                          od.field_j = od.field_j - fl.field_u;
                          break L6;
                        } else {
                          od.field_j = od.field_j - fl.field_u;
                          break L6;
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  if (fl.field_M < od.field_j) {
                    ei.field_j = true;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (null != ra.field_p) {
                var3 = 357 + -(ra.field_p.field_s / 2);
                var4 = 0;
                if (w.field_c != 0) {
                  if (dh.field_b > var3) {
                    if (var3 - -ra.field_p.field_p > dh.field_b) {
                      L7: {
                        if (tf.field_e <= -ra.field_p.field_z + 269) {
                          break L7;
                        } else {
                          if (tf.field_e < 269) {
                            od.field_j = fl.field_u;
                            var4 = 1;
                            ei.field_j = false;
                            break L7;
                          } else {
                            L8: {
                              if ((tf.field_e ^ -1) >= -587) {
                                break L8;
                              } else {
                                if (586 - -ra.field_p.field_z > tf.field_e) {
                                  ei.field_j = true;
                                  var4 = 1;
                                  od.field_j = fl.field_u;
                                  break L8;
                                } else {
                                  L9: {
                                    if (var4 != 0) {
                                      break L9;
                                    } else {
                                      if (fl.field_M >= od.field_j) {
                                        break L9;
                                      } else {
                                        if (fi.field_B <= var3) {
                                          break L9;
                                        } else {
                                          if (ra.field_p.field_p + var3 <= fi.field_B) {
                                            break L9;
                                          } else {
                                            if (pg.field_n <= -ra.field_p.field_z + 269) {
                                              if (586 >= pg.field_n) {
                                                break L9;
                                              } else {
                                                if (ra.field_p.field_z + 586 <= pg.field_n) {
                                                  break L9;
                                                } else {
                                                  od.field_j = fl.field_M;
                                                  break L9;
                                                }
                                              }
                                            } else {
                                              if (586 >= pg.field_n) {
                                                break L9;
                                              } else {
                                                if (ra.field_p.field_z + 586 <= pg.field_n) {
                                                  break L9;
                                                } else {
                                                  od.field_j = fl.field_M;
                                                  break L9;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (param1) {
                                    L10: {
                                      jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                      if (!jj.field_d.b(param0 ^ -587)) {
                                        break L10;
                                      } else {
                                        if (-1 != (jj.field_d.field_g ^ -1)) {
                                          if (jj.field_d.field_g != 1) {
                                            break L10;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    L11: while (true) {
                                      if (ae.a(103)) {
                                        L12: {
                                          jj.field_d.a((byte) 11, 0);
                                          if (!jj.field_d.b(-1)) {
                                            break L12;
                                          } else {
                                            if (jj.field_d.field_g == 0) {
                                              return 3;
                                            } else {
                                              if (1 == jj.field_d.field_g) {
                                                return 1;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                        if (13 == vk.field_r) {
                                          return 1;
                                        } else {
                                          continue L11;
                                        }
                                      } else {
                                        return 0;
                                      }
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                            }
                            L13: {
                              if (var4 != 0) {
                                break L13;
                              } else {
                                if (fl.field_M >= od.field_j) {
                                  break L13;
                                } else {
                                  if (fi.field_B <= var3) {
                                    break L13;
                                  } else {
                                    if (ra.field_p.field_p + var3 <= fi.field_B) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (pg.field_n <= -ra.field_p.field_z + 269) {
                                          break L14;
                                        } else {
                                          if (-270 < (pg.field_n ^ -1)) {
                                            od.field_j = fl.field_M;
                                            break L14;
                                          } else {
                                            L15: {
                                              if (586 >= pg.field_n) {
                                                break L15;
                                              } else {
                                                if (ra.field_p.field_z + 586 <= pg.field_n) {
                                                  break L15;
                                                } else {
                                                  od.field_j = fl.field_M;
                                                  break L15;
                                                }
                                              }
                                            }
                                            if (param1) {
                                              L16: {
                                                jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                                if (!jj.field_d.b(param0 ^ -587)) {
                                                  break L16;
                                                } else {
                                                  if (-1 != (jj.field_d.field_g ^ -1)) {
                                                    if (jj.field_d.field_g != 1) {
                                                      break L16;
                                                    } else {
                                                      return 2;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                }
                                              }
                                              L17: while (true) {
                                                if (ae.a(103)) {
                                                  L18: {
                                                    jj.field_d.a((byte) 11, 0);
                                                    if (!jj.field_d.b(-1)) {
                                                      break L18;
                                                    } else {
                                                      if (jj.field_d.field_g == 0) {
                                                        return 3;
                                                      } else {
                                                        if (1 == jj.field_d.field_g) {
                                                          return 1;
                                                        } else {
                                                          break L18;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (13 == vk.field_r) {
                                                    return 1;
                                                  } else {
                                                    continue L17;
                                                  }
                                                } else {
                                                  return 0;
                                                }
                                              }
                                            } else {
                                              return 0;
                                            }
                                          }
                                        }
                                      }
                                      if (586 >= pg.field_n) {
                                        break L13;
                                      } else {
                                        if (ra.field_p.field_z + 586 <= pg.field_n) {
                                          break L13;
                                        } else {
                                          L19: {
                                            od.field_j = fl.field_M;
                                            if (!param1) {
                                              break L19;
                                            } else {
                                              L20: {
                                                jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                                if (!jj.field_d.b(param0 ^ -587)) {
                                                  break L20;
                                                } else {
                                                  if (-1 != (jj.field_d.field_g ^ -1)) {
                                                    if (jj.field_d.field_g != 1) {
                                                      break L20;
                                                    } else {
                                                      return 2;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                }
                                              }
                                              L21: while (true) {
                                                if (!ae.a(103)) {
                                                  break L19;
                                                } else {
                                                  L22: {
                                                    jj.field_d.a((byte) 11, 0);
                                                    if (!jj.field_d.b(-1)) {
                                                      break L22;
                                                    } else {
                                                      if (jj.field_d.field_g == 0) {
                                                        return 3;
                                                      } else {
                                                        if (1 == jj.field_d.field_g) {
                                                          return 1;
                                                        } else {
                                                          break L22;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (13 == vk.field_r) {
                                                    return 1;
                                                  } else {
                                                    continue L21;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          return 0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L23: {
                              if (!param1) {
                                break L23;
                              } else {
                                L24: {
                                  jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                  if (!jj.field_d.b(param0 ^ -587)) {
                                    break L24;
                                  } else {
                                    if (-1 != (jj.field_d.field_g ^ -1)) {
                                      if (jj.field_d.field_g != 1) {
                                        break L24;
                                      } else {
                                        return 2;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                                L25: while (true) {
                                  if (!ae.a(103)) {
                                    break L23;
                                  } else {
                                    L26: {
                                      jj.field_d.a((byte) 11, 0);
                                      if (!jj.field_d.b(-1)) {
                                        break L26;
                                      } else {
                                        if (jj.field_d.field_g == 0) {
                                          return 3;
                                        } else {
                                          if (1 == jj.field_d.field_g) {
                                            return 1;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                    }
                                    if (13 == vk.field_r) {
                                      return 1;
                                    } else {
                                      continue L25;
                                    }
                                  }
                                }
                              }
                            }
                            return 0;
                          }
                        }
                      }
                      L27: {
                        if ((tf.field_e ^ -1) >= -587) {
                          break L27;
                        } else {
                          if (586 - -ra.field_p.field_z > tf.field_e) {
                            ei.field_j = true;
                            var4 = 1;
                            od.field_j = fl.field_u;
                            break L27;
                          } else {
                            L28: {
                              if (var4 != 0) {
                                break L28;
                              } else {
                                if (fl.field_M >= od.field_j) {
                                  break L28;
                                } else {
                                  if (fi.field_B <= var3) {
                                    break L28;
                                  } else {
                                    if (ra.field_p.field_p + var3 <= fi.field_B) {
                                      break L28;
                                    } else {
                                      L29: {
                                        if (pg.field_n <= -ra.field_p.field_z + 269) {
                                          break L29;
                                        } else {
                                          if (-270 < (pg.field_n ^ -1)) {
                                            od.field_j = fl.field_M;
                                            break L29;
                                          } else {
                                            L30: {
                                              if (586 >= pg.field_n) {
                                                break L30;
                                              } else {
                                                if (ra.field_p.field_z + 586 <= pg.field_n) {
                                                  break L30;
                                                } else {
                                                  od.field_j = fl.field_M;
                                                  break L30;
                                                }
                                              }
                                            }
                                            L31: {
                                              if (!param1) {
                                                break L31;
                                              } else {
                                                L32: {
                                                  jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                                  if (!jj.field_d.b(param0 ^ -587)) {
                                                    break L32;
                                                  } else {
                                                    if (-1 != (jj.field_d.field_g ^ -1)) {
                                                      if (jj.field_d.field_g != 1) {
                                                        break L32;
                                                      } else {
                                                        return 2;
                                                      }
                                                    } else {
                                                      return 3;
                                                    }
                                                  }
                                                }
                                                L33: while (true) {
                                                  if (!ae.a(103)) {
                                                    break L31;
                                                  } else {
                                                    L34: {
                                                      jj.field_d.a((byte) 11, 0);
                                                      if (!jj.field_d.b(-1)) {
                                                        break L34;
                                                      } else {
                                                        if (jj.field_d.field_g == 0) {
                                                          return 3;
                                                        } else {
                                                          if (1 == jj.field_d.field_g) {
                                                            return 1;
                                                          } else {
                                                            break L34;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (13 == vk.field_r) {
                                                      return 1;
                                                    } else {
                                                      continue L33;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            return 0;
                                          }
                                        }
                                      }
                                      if (586 >= pg.field_n) {
                                        break L28;
                                      } else {
                                        if (ra.field_p.field_z + 586 <= pg.field_n) {
                                          break L28;
                                        } else {
                                          L35: {
                                            od.field_j = fl.field_M;
                                            if (!param1) {
                                              break L35;
                                            } else {
                                              L36: {
                                                jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                                if (!jj.field_d.b(param0 ^ -587)) {
                                                  break L36;
                                                } else {
                                                  if (-1 != (jj.field_d.field_g ^ -1)) {
                                                    if (jj.field_d.field_g != 1) {
                                                      break L36;
                                                    } else {
                                                      return 2;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                }
                                              }
                                              L37: while (true) {
                                                if (!ae.a(103)) {
                                                  break L35;
                                                } else {
                                                  L38: {
                                                    jj.field_d.a((byte) 11, 0);
                                                    if (!jj.field_d.b(-1)) {
                                                      break L38;
                                                    } else {
                                                      if (jj.field_d.field_g == 0) {
                                                        return 3;
                                                      } else {
                                                        if (1 == jj.field_d.field_g) {
                                                          return 1;
                                                        } else {
                                                          break L38;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if (13 == vk.field_r) {
                                                    return 1;
                                                  } else {
                                                    continue L37;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          return 0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            L39: {
                              if (!param1) {
                                break L39;
                              } else {
                                L40: {
                                  jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                  if (!jj.field_d.b(param0 ^ -587)) {
                                    break L40;
                                  } else {
                                    if (-1 != (jj.field_d.field_g ^ -1)) {
                                      if (jj.field_d.field_g != 1) {
                                        break L40;
                                      } else {
                                        return 2;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                                L41: while (true) {
                                  if (!ae.a(103)) {
                                    break L39;
                                  } else {
                                    L42: {
                                      jj.field_d.a((byte) 11, 0);
                                      if (!jj.field_d.b(-1)) {
                                        break L42;
                                      } else {
                                        if (jj.field_d.field_g == 0) {
                                          return 3;
                                        } else {
                                          if (1 == jj.field_d.field_g) {
                                            return 1;
                                          } else {
                                            break L42;
                                          }
                                        }
                                      }
                                    }
                                    if (13 == vk.field_r) {
                                      return 1;
                                    } else {
                                      continue L41;
                                    }
                                  }
                                }
                              }
                            }
                            return 0;
                          }
                        }
                      }
                      L43: {
                        if (var4 != 0) {
                          break L43;
                        } else {
                          if (fl.field_M >= od.field_j) {
                            break L43;
                          } else {
                            if (fi.field_B <= var3) {
                              break L43;
                            } else {
                              if (ra.field_p.field_p + var3 <= fi.field_B) {
                                break L43;
                              } else {
                                L44: {
                                  if (pg.field_n <= -ra.field_p.field_z + 269) {
                                    break L44;
                                  } else {
                                    if (-270 < (pg.field_n ^ -1)) {
                                      od.field_j = fl.field_M;
                                      break L44;
                                    } else {
                                      L45: {
                                        if (586 >= pg.field_n) {
                                          break L45;
                                        } else {
                                          if (ra.field_p.field_z + 586 <= pg.field_n) {
                                            break L45;
                                          } else {
                                            L46: {
                                              od.field_j = fl.field_M;
                                              if (!param1) {
                                                break L46;
                                              } else {
                                                L47: {
                                                  jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                                  if (!jj.field_d.b(param0 ^ -587)) {
                                                    break L47;
                                                  } else {
                                                    if (-1 != (jj.field_d.field_g ^ -1)) {
                                                      if (jj.field_d.field_g != 1) {
                                                        break L47;
                                                      } else {
                                                        return 2;
                                                      }
                                                    } else {
                                                      return 3;
                                                    }
                                                  }
                                                }
                                                L48: while (true) {
                                                  if (!ae.a(103)) {
                                                    break L46;
                                                  } else {
                                                    L49: {
                                                      jj.field_d.a((byte) 11, 0);
                                                      if (!jj.field_d.b(-1)) {
                                                        break L49;
                                                      } else {
                                                        if (jj.field_d.field_g == 0) {
                                                          return 3;
                                                        } else {
                                                          if (1 == jj.field_d.field_g) {
                                                            return 1;
                                                          } else {
                                                            break L49;
                                                          }
                                                        }
                                                      }
                                                    }
                                                    if (13 == vk.field_r) {
                                                      return 1;
                                                    } else {
                                                      continue L48;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            return 0;
                                          }
                                        }
                                      }
                                      L50: {
                                        if (!param1) {
                                          break L50;
                                        } else {
                                          L51: {
                                            jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                            if (!jj.field_d.b(param0 ^ -587)) {
                                              break L51;
                                            } else {
                                              if (-1 != (jj.field_d.field_g ^ -1)) {
                                                if (jj.field_d.field_g != 1) {
                                                  break L51;
                                                } else {
                                                  return 2;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            }
                                          }
                                          L52: while (true) {
                                            if (!ae.a(103)) {
                                              break L50;
                                            } else {
                                              L53: {
                                                jj.field_d.a((byte) 11, 0);
                                                if (!jj.field_d.b(-1)) {
                                                  break L53;
                                                } else {
                                                  if (jj.field_d.field_g == 0) {
                                                    return 3;
                                                  } else {
                                                    if (1 == jj.field_d.field_g) {
                                                      return 1;
                                                    } else {
                                                      break L53;
                                                    }
                                                  }
                                                }
                                              }
                                              if (13 == vk.field_r) {
                                                return 1;
                                              } else {
                                                continue L52;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      return 0;
                                    }
                                  }
                                }
                                if (586 >= pg.field_n) {
                                  break L43;
                                } else {
                                  if (ra.field_p.field_z + 586 <= pg.field_n) {
                                    break L43;
                                  } else {
                                    L54: {
                                      od.field_j = fl.field_M;
                                      if (!param1) {
                                        break L54;
                                      } else {
                                        L55: {
                                          jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                          if (!jj.field_d.b(param0 ^ -587)) {
                                            break L55;
                                          } else {
                                            if (-1 != (jj.field_d.field_g ^ -1)) {
                                              if (jj.field_d.field_g != 1) {
                                                break L55;
                                              } else {
                                                return 2;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          }
                                        }
                                        L56: while (true) {
                                          if (!ae.a(103)) {
                                            break L54;
                                          } else {
                                            L57: {
                                              jj.field_d.a((byte) 11, 0);
                                              if (!jj.field_d.b(-1)) {
                                                break L57;
                                              } else {
                                                if (jj.field_d.field_g == 0) {
                                                  return 3;
                                                } else {
                                                  if (1 == jj.field_d.field_g) {
                                                    return 1;
                                                  } else {
                                                    break L57;
                                                  }
                                                }
                                              }
                                            }
                                            if (13 == vk.field_r) {
                                              return 1;
                                            } else {
                                              continue L56;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    return 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L58: {
                        if (!param1) {
                          break L58;
                        } else {
                          L59: {
                            jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                            if (!jj.field_d.b(param0 ^ -587)) {
                              break L59;
                            } else {
                              if (-1 != (jj.field_d.field_g ^ -1)) {
                                if (jj.field_d.field_g != 1) {
                                  break L59;
                                } else {
                                  return 2;
                                }
                              } else {
                                return 3;
                              }
                            }
                          }
                          L60: while (true) {
                            if (!ae.a(103)) {
                              break L58;
                            } else {
                              L61: {
                                jj.field_d.a((byte) 11, 0);
                                if (!jj.field_d.b(-1)) {
                                  break L61;
                                } else {
                                  if (jj.field_d.field_g == 0) {
                                    return 3;
                                  } else {
                                    if (1 == jj.field_d.field_g) {
                                      return 1;
                                    } else {
                                      break L61;
                                    }
                                  }
                                }
                              }
                              if (13 == vk.field_r) {
                                return 1;
                              } else {
                                continue L60;
                              }
                            }
                          }
                        }
                      }
                      return 0;
                    } else {
                      L62: {
                        if (var4 != 0) {
                          break L62;
                        } else {
                          if (fl.field_M >= od.field_j) {
                            break L62;
                          } else {
                            if (fi.field_B <= var3) {
                              break L62;
                            } else {
                              if (ra.field_p.field_p + var3 <= fi.field_B) {
                                break L62;
                              } else {
                                if (pg.field_n <= -ra.field_p.field_z + 269) {
                                  if (586 >= pg.field_n) {
                                    break L62;
                                  } else {
                                    if (ra.field_p.field_z + 586 <= pg.field_n) {
                                      break L62;
                                    } else {
                                      od.field_j = fl.field_M;
                                      break L62;
                                    }
                                  }
                                } else {
                                  if (586 >= pg.field_n) {
                                    break L62;
                                  } else {
                                    if (ra.field_p.field_z + 586 <= pg.field_n) {
                                      break L62;
                                    } else {
                                      od.field_j = fl.field_M;
                                      break L62;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      if (param1) {
                        L63: {
                          jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                          if (!jj.field_d.b(param0 ^ -587)) {
                            break L63;
                          } else {
                            if (-1 != (jj.field_d.field_g ^ -1)) {
                              if (jj.field_d.field_g != 1) {
                                break L63;
                              } else {
                                return 2;
                              }
                            } else {
                              return 3;
                            }
                          }
                        }
                        L64: while (true) {
                          if (ae.a(103)) {
                            L65: {
                              jj.field_d.a((byte) 11, 0);
                              if (!jj.field_d.b(-1)) {
                                break L65;
                              } else {
                                if (jj.field_d.field_g == 0) {
                                  return 3;
                                } else {
                                  if (1 == jj.field_d.field_g) {
                                    return 1;
                                  } else {
                                    break L65;
                                  }
                                }
                              }
                            }
                            if (13 == vk.field_r) {
                              return 1;
                            } else {
                              continue L64;
                            }
                          } else {
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    L66: {
                      if (var4 != 0) {
                        break L66;
                      } else {
                        if (fl.field_M >= od.field_j) {
                          break L66;
                        } else {
                          if (fi.field_B <= var3) {
                            break L66;
                          } else {
                            if (ra.field_p.field_p + var3 <= fi.field_B) {
                              break L66;
                            } else {
                              L67: {
                                if (pg.field_n <= -ra.field_p.field_z + 269) {
                                  break L67;
                                } else {
                                  if (-270 < (pg.field_n ^ -1)) {
                                    od.field_j = fl.field_M;
                                    break L67;
                                  } else {
                                    L68: {
                                      if (586 >= pg.field_n) {
                                        break L68;
                                      } else {
                                        if (ra.field_p.field_z + 586 <= pg.field_n) {
                                          break L68;
                                        } else {
                                          od.field_j = fl.field_M;
                                          break L68;
                                        }
                                      }
                                    }
                                    if (param1) {
                                      L69: {
                                        jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                        if (!jj.field_d.b(param0 ^ -587)) {
                                          break L69;
                                        } else {
                                          if (-1 != (jj.field_d.field_g ^ -1)) {
                                            if (jj.field_d.field_g != 1) {
                                              break L69;
                                            } else {
                                              return 2;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        }
                                      }
                                      L70: while (true) {
                                        if (ae.a(103)) {
                                          L71: {
                                            jj.field_d.a((byte) 11, 0);
                                            if (!jj.field_d.b(-1)) {
                                              break L71;
                                            } else {
                                              if (jj.field_d.field_g == 0) {
                                                return 3;
                                              } else {
                                                if (1 == jj.field_d.field_g) {
                                                  return 1;
                                                } else {
                                                  break L71;
                                                }
                                              }
                                            }
                                          }
                                          if (13 == vk.field_r) {
                                            return 1;
                                          } else {
                                            continue L70;
                                          }
                                        } else {
                                          return 0;
                                        }
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                              }
                              if (586 >= pg.field_n) {
                                break L66;
                              } else {
                                if (ra.field_p.field_z + 586 <= pg.field_n) {
                                  break L66;
                                } else {
                                  od.field_j = fl.field_M;
                                  if (param1) {
                                    L72: {
                                      jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                      if (!jj.field_d.b(param0 ^ -587)) {
                                        break L72;
                                      } else {
                                        if (-1 != (jj.field_d.field_g ^ -1)) {
                                          if (jj.field_d.field_g != 1) {
                                            break L72;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    L73: while (true) {
                                      if (ae.a(103)) {
                                        L74: {
                                          jj.field_d.a((byte) 11, 0);
                                          if (!jj.field_d.b(-1)) {
                                            break L74;
                                          } else {
                                            if (jj.field_d.field_g == 0) {
                                              return 3;
                                            } else {
                                              if (1 == jj.field_d.field_g) {
                                                return 1;
                                              } else {
                                                break L74;
                                              }
                                            }
                                          }
                                        }
                                        if (13 == vk.field_r) {
                                          return 1;
                                        } else {
                                          continue L73;
                                        }
                                      } else {
                                        return 0;
                                      }
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param1) {
                      L75: {
                        jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                        if (!jj.field_d.b(param0 ^ -587)) {
                          break L75;
                        } else {
                          if (-1 != (jj.field_d.field_g ^ -1)) {
                            if (jj.field_d.field_g != 1) {
                              break L75;
                            } else {
                              return 2;
                            }
                          } else {
                            return 3;
                          }
                        }
                      }
                      L76: while (true) {
                        if (ae.a(103)) {
                          L77: {
                            jj.field_d.a((byte) 11, 0);
                            if (!jj.field_d.b(-1)) {
                              break L77;
                            } else {
                              if (jj.field_d.field_g == 0) {
                                return 3;
                              } else {
                                if (1 == jj.field_d.field_g) {
                                  return 1;
                                } else {
                                  break L77;
                                }
                              }
                            }
                          }
                          if (13 == vk.field_r) {
                            return 1;
                          } else {
                            continue L76;
                          }
                        } else {
                          return 0;
                        }
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  L78: {
                    if (var4 != 0) {
                      break L78;
                    } else {
                      if (fl.field_M >= od.field_j) {
                        break L78;
                      } else {
                        if (fi.field_B <= var3) {
                          break L78;
                        } else {
                          if (ra.field_p.field_p + var3 <= fi.field_B) {
                            break L78;
                          } else {
                            L79: {
                              if (pg.field_n <= -ra.field_p.field_z + 269) {
                                break L79;
                              } else {
                                if (-270 < (pg.field_n ^ -1)) {
                                  od.field_j = fl.field_M;
                                  break L79;
                                } else {
                                  L80: {
                                    if (586 >= pg.field_n) {
                                      break L80;
                                    } else {
                                      if (ra.field_p.field_z + 586 <= pg.field_n) {
                                        break L80;
                                      } else {
                                        od.field_j = fl.field_M;
                                        break L80;
                                      }
                                    }
                                  }
                                  if (param1) {
                                    L81: {
                                      jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                      if (!jj.field_d.b(param0 ^ -587)) {
                                        break L81;
                                      } else {
                                        if (-1 != (jj.field_d.field_g ^ -1)) {
                                          if (jj.field_d.field_g != 1) {
                                            break L81;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    L82: while (true) {
                                      if (ae.a(103)) {
                                        L83: {
                                          jj.field_d.a((byte) 11, 0);
                                          if (!jj.field_d.b(-1)) {
                                            break L83;
                                          } else {
                                            if (jj.field_d.field_g == 0) {
                                              return 3;
                                            } else {
                                              if (1 == jj.field_d.field_g) {
                                                return 1;
                                              } else {
                                                break L83;
                                              }
                                            }
                                          }
                                        }
                                        if (13 == vk.field_r) {
                                          return 1;
                                        } else {
                                          continue L82;
                                        }
                                      } else {
                                        return 0;
                                      }
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                            }
                            if (586 >= pg.field_n) {
                              break L78;
                            } else {
                              if (ra.field_p.field_z + 586 <= pg.field_n) {
                                break L78;
                              } else {
                                od.field_j = fl.field_M;
                                if (param1) {
                                  L84: {
                                    jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                                    if (!jj.field_d.b(param0 ^ -587)) {
                                      break L84;
                                    } else {
                                      if (-1 != (jj.field_d.field_g ^ -1)) {
                                        if (jj.field_d.field_g != 1) {
                                          break L84;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  L85: while (true) {
                                    if (ae.a(103)) {
                                      L86: {
                                        jj.field_d.a((byte) 11, 0);
                                        if (!jj.field_d.b(-1)) {
                                          break L86;
                                        } else {
                                          if (jj.field_d.field_g == 0) {
                                            return 3;
                                          } else {
                                            if (1 == jj.field_d.field_g) {
                                              return 1;
                                            } else {
                                              break L86;
                                            }
                                          }
                                        }
                                      }
                                      if (13 == vk.field_r) {
                                        return 1;
                                      } else {
                                        continue L85;
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param1) {
                    L87: {
                      jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                      if (!jj.field_d.b(param0 ^ -587)) {
                        break L87;
                      } else {
                        if (-1 != (jj.field_d.field_g ^ -1)) {
                          if (jj.field_d.field_g != 1) {
                            break L87;
                          } else {
                            return 2;
                          }
                        } else {
                          return 3;
                        }
                      }
                    }
                    L88: while (true) {
                      if (ae.a(103)) {
                        L89: {
                          jj.field_d.a((byte) 11, 0);
                          if (!jj.field_d.b(-1)) {
                            break L89;
                          } else {
                            if (jj.field_d.field_g == 0) {
                              return 3;
                            } else {
                              if (1 == jj.field_d.field_g) {
                                return 1;
                              } else {
                                break L89;
                              }
                            }
                          }
                        }
                        if (13 == vk.field_r) {
                          return 1;
                        } else {
                          continue L88;
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                if (param1) {
                  L90: {
                    jj.field_d.a(wc.a(29292, fi.field_B, pg.field_n), param0 + -668, wc.a(29292, dh.field_b, tf.field_e));
                    if (!jj.field_d.b(param0 ^ -587)) {
                      break L90;
                    } else {
                      if (-1 != (jj.field_d.field_g ^ -1)) {
                        if (jj.field_d.field_g != 1) {
                          break L90;
                        } else {
                          return 2;
                        }
                      } else {
                        return 3;
                      }
                    }
                  }
                  L91: while (true) {
                    if (ae.a(103)) {
                      L92: {
                        jj.field_d.a((byte) 11, 0);
                        if (!jj.field_d.b(-1)) {
                          break L92;
                        } else {
                          if (jj.field_d.field_g == 0) {
                            return 3;
                          } else {
                            if (1 == jj.field_d.field_g) {
                              return 1;
                            } else {
                              break L92;
                            }
                          }
                        }
                      }
                      if (13 == vk.field_r) {
                        return 1;
                      } else {
                        continue L91;
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  return 0;
                }
              }
            } else {
              sb.field_d = sb.field_d - fl.field_V;
              hj.field_c = hj.field_c + 1;
              continue L0;
            }
          }
        } else {
          return -4;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        if (param0 != 24188) {
            int discarded$0 = kd.a(58, false);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please check if address is correct";
    }
}
