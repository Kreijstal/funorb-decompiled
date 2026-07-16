/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends fc {
    int field_q;
    int field_n;
    int field_i;
    int field_p;
    int field_l;
    int[] field_o;
    int field_k;
    long field_j;
    static int field_m;
    int field_r;

    final static boolean a(boolean param0, ve param1, ve param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var4 = TrackController.field_F ? 1 : 0;
        var3 = -param1.field_R + param2.field_R;
        if (param0) {
          L0: {
            if (la.field_q != param2.field_ib) {
              if (param2.field_ib != null) {
                break L0;
              } else {
                var3 += 200;
                break L0;
              }
            } else {
              var3 -= 200;
              break L0;
            }
          }
          if (la.field_q != param1.field_ib) {
            if (param1.field_ib != null) {
              L1: {
                if (0 >= var3) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L1;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  break L1;
                }
              }
              return stackIn_19_0 != 0;
            } else {
              L2: {
                var3 -= 200;
                if (0 >= var3) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              }
              return stackIn_15_0 != 0;
            }
          } else {
            L3: {
              var3 += 200;
              if (0 >= var3) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            return stackIn_10_0 != 0;
          }
        } else {
          return false;
        }
    }

    final static String a(byte param0) {
        if (param0 != 107) {
            field_m = 13;
            return ne.field_a.g(0);
        }
        return ne.field_a.g(0);
    }

    final static void a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_25_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_161_0 = 0;
        int stackIn_221_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_219_0 = 0;
        int stackOut_217_0 = 0;
        int stackOut_215_0 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_23_0 = 0;
        var3 = TrackController.field_F ? 1 : 0;
        vl.field_H = vl.field_H + 1;
        if (param0 < -117) {
          L0: {
            if (-1 != j.field_c) {
              break L0;
            } else {
              if (nk.field_l == -1) {
                nk.field_l = fg.field_a;
                j.field_c = kf.field_b;
                break L0;
              } else {
                L1: {
                  L2: {
                    if (param1 != null) {
                      if (param1.equals((Object) (Object) nl.field_f)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      if (nl.field_f != null) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (!cd.field_j) {
                      if (vl.field_H >= ib.field_d) {
                        if (kj.field_r + ib.field_d <= vl.field_H) {
                          stackOut_159_0 = 0;
                          stackIn_161_0 = stackOut_159_0;
                          break L3;
                        } else {
                          stackOut_158_0 = 1;
                          stackIn_161_0 = stackOut_158_0;
                          break L3;
                        }
                      } else {
                        stackOut_156_0 = 0;
                        stackIn_161_0 = stackOut_156_0;
                        break L3;
                      }
                    } else {
                      stackOut_154_0 = 0;
                      stackIn_161_0 = stackOut_154_0;
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      var2 = stackIn_161_0;
                      if (param1 == null) {
                        break L5;
                      } else {
                        if (cd.field_j) {
                          vl.field_H = ib.field_d;
                          break L4;
                        } else {
                          if (var2 == 0) {
                            break L5;
                          } else {
                            vl.field_H = ib.field_d;
                            break L4;
                          }
                        }
                      }
                    }
                    vl.field_H = 0;
                    break L4;
                  }
                  L6: {
                    field_m = nk.field_l;
                    if (param1 != null) {
                      cd.field_j = false;
                      break L6;
                    } else {
                      if (var2 == 0) {
                        break L6;
                      } else {
                        cd.field_j = true;
                        break L6;
                      }
                    }
                  }
                  r.field_j = j.field_c;
                  break L1;
                }
                L7: {
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L7;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L7;
                    } else {
                      if (!mg.field_a) {
                        break L7;
                      } else {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  nk.field_l = -1;
                  j.field_c = -1;
                  if (!cd.field_j) {
                    break L8;
                  } else {
                    if (vl.field_H != ib.field_f) {
                      break L8;
                    } else {
                      vl.field_H = 0;
                      cd.field_j = false;
                      break L8;
                    }
                  }
                }
                return;
              }
            }
          }
          L9: {
            if (param1 != null) {
              if (!param1.equals((Object) (Object) nl.field_f)) {
                break L9;
              } else {
                L10: {
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L10;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L10;
                    } else {
                      if (!mg.field_a) {
                        break L10;
                      } else {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        nk.field_l = -1;
                        j.field_c = -1;
                        if (cd.field_j) {
                          if (vl.field_H == ib.field_f) {
                            vl.field_H = 0;
                            cd.field_j = false;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                L11: {
                  nk.field_l = -1;
                  j.field_c = -1;
                  if (!cd.field_j) {
                    break L11;
                  } else {
                    if (vl.field_H != ib.field_f) {
                      break L11;
                    } else {
                      vl.field_H = 0;
                      cd.field_j = false;
                      return;
                    }
                  }
                }
                return;
              }
            } else {
              if (nl.field_f == null) {
                break L9;
              } else {
                L12: {
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L12;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L12;
                    } else {
                      if (!mg.field_a) {
                        break L12;
                      } else {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        nk.field_l = -1;
                        j.field_c = -1;
                        if (cd.field_j) {
                          if (vl.field_H == ib.field_f) {
                            vl.field_H = 0;
                            cd.field_j = false;
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
                nk.field_l = -1;
                j.field_c = -1;
                if (cd.field_j) {
                  if (vl.field_H == ib.field_f) {
                    vl.field_H = 0;
                    cd.field_j = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          L13: {
            if (!cd.field_j) {
              if (vl.field_H >= ib.field_d) {
                if (kj.field_r + ib.field_d <= vl.field_H) {
                  stackOut_220_0 = 0;
                  stackIn_221_0 = stackOut_220_0;
                  break L13;
                } else {
                  stackOut_219_0 = 1;
                  stackIn_221_0 = stackOut_219_0;
                  break L13;
                }
              } else {
                stackOut_217_0 = 0;
                stackIn_221_0 = stackOut_217_0;
                break L13;
              }
            } else {
              stackOut_215_0 = 0;
              stackIn_221_0 = stackOut_215_0;
              break L13;
            }
          }
          var2 = stackIn_221_0;
          if (param1 == null) {
            L14: {
              vl.field_H = 0;
              field_m = nk.field_l;
              if (param1 != null) {
                cd.field_j = false;
                break L14;
              } else {
                cd.field_j = true;
                break L14;
              }
            }
            L15: {
              r.field_j = j.field_c;
              nl.field_f = param1;
              if (cd.field_j) {
                break L15;
              } else {
                if (ib.field_d <= vl.field_H) {
                  break L15;
                } else {
                  if (!mg.field_a) {
                    break L15;
                  } else {
                    r.field_j = j.field_c;
                    vl.field_H = 0;
                    field_m = nk.field_l;
                    break L15;
                  }
                }
              }
            }
            L16: {
              nk.field_l = -1;
              j.field_c = -1;
              if (!cd.field_j) {
                break L16;
              } else {
                if (vl.field_H != ib.field_f) {
                  break L16;
                } else {
                  vl.field_H = 0;
                  cd.field_j = false;
                  break L16;
                }
              }
            }
            return;
          } else {
            L17: {
              if (cd.field_j) {
                vl.field_H = ib.field_d;
                break L17;
              } else {
                if (var2 == 0) {
                  L18: {
                    vl.field_H = 0;
                    field_m = nk.field_l;
                    if (param1 != null) {
                      cd.field_j = false;
                      break L18;
                    } else {
                      if (var2 == 0) {
                        break L18;
                      } else {
                        cd.field_j = true;
                        break L18;
                      }
                    }
                  }
                  L19: {
                    r.field_j = j.field_c;
                    nl.field_f = param1;
                    if (cd.field_j) {
                      break L19;
                    } else {
                      if (ib.field_d <= vl.field_H) {
                        break L19;
                      } else {
                        if (!mg.field_a) {
                          break L19;
                        } else {
                          r.field_j = j.field_c;
                          vl.field_H = 0;
                          field_m = nk.field_l;
                          break L19;
                        }
                      }
                    }
                  }
                  L20: {
                    nk.field_l = -1;
                    j.field_c = -1;
                    if (!cd.field_j) {
                      break L20;
                    } else {
                      if (vl.field_H != ib.field_f) {
                        break L20;
                      } else {
                        vl.field_H = 0;
                        cd.field_j = false;
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  vl.field_H = ib.field_d;
                  break L17;
                }
              }
            }
            field_m = nk.field_l;
            if (param1 != null) {
              L21: {
                cd.field_j = false;
                r.field_j = j.field_c;
                nl.field_f = param1;
                if (cd.field_j) {
                  break L21;
                } else {
                  if (ib.field_d <= vl.field_H) {
                    break L21;
                  } else {
                    if (!mg.field_a) {
                      break L21;
                    } else {
                      L22: {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        nk.field_l = -1;
                        j.field_c = -1;
                        if (!cd.field_j) {
                          break L22;
                        } else {
                          if (vl.field_H != ib.field_f) {
                            break L22;
                          } else {
                            vl.field_H = 0;
                            cd.field_j = false;
                            break L22;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
              }
              L23: {
                nk.field_l = -1;
                j.field_c = -1;
                if (!cd.field_j) {
                  break L23;
                } else {
                  if (vl.field_H != ib.field_f) {
                    break L23;
                  } else {
                    vl.field_H = 0;
                    cd.field_j = false;
                    return;
                  }
                }
              }
              return;
            } else {
              if (var2 == 0) {
                L24: {
                  r.field_j = j.field_c;
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L24;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L24;
                    } else {
                      if (!mg.field_a) {
                        break L24;
                      } else {
                        L25: {
                          r.field_j = j.field_c;
                          vl.field_H = 0;
                          field_m = nk.field_l;
                          nk.field_l = -1;
                          j.field_c = -1;
                          if (!cd.field_j) {
                            break L25;
                          } else {
                            if (vl.field_H != ib.field_f) {
                              break L25;
                            } else {
                              vl.field_H = 0;
                              cd.field_j = false;
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L26: {
                  nk.field_l = -1;
                  j.field_c = -1;
                  if (!cd.field_j) {
                    break L26;
                  } else {
                    if (vl.field_H != ib.field_f) {
                      break L26;
                    } else {
                      vl.field_H = 0;
                      cd.field_j = false;
                      return;
                    }
                  }
                }
                return;
              } else {
                L27: {
                  cd.field_j = true;
                  r.field_j = j.field_c;
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L27;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L27;
                    } else {
                      if (!mg.field_a) {
                        break L27;
                      } else {
                        L28: {
                          r.field_j = j.field_c;
                          vl.field_H = 0;
                          field_m = nk.field_l;
                          nk.field_l = -1;
                          j.field_c = -1;
                          if (!cd.field_j) {
                            break L28;
                          } else {
                            if (vl.field_H != ib.field_f) {
                              break L28;
                            } else {
                              vl.field_H = 0;
                              cd.field_j = false;
                              break L28;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L29: {
                  nk.field_l = -1;
                  j.field_c = -1;
                  if (!cd.field_j) {
                    break L29;
                  } else {
                    if (vl.field_H != ib.field_f) {
                      break L29;
                    } else {
                      vl.field_H = 0;
                      cd.field_j = false;
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
        } else {
          field_m = -86;
          if (-1 == j.field_c) {
            L30: {
              if (nk.field_l == -1) {
                nk.field_l = fg.field_a;
                j.field_c = kf.field_b;
                break L30;
              } else {
                break L30;
              }
            }
            if (param1 != null) {
              if (param1.equals((Object) (Object) nl.field_f)) {
                L31: {
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L31;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L31;
                    } else {
                      if (!mg.field_a) {
                        break L31;
                      } else {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        break L31;
                      }
                    }
                  }
                }
                L32: {
                  nk.field_l = -1;
                  j.field_c = -1;
                  if (!cd.field_j) {
                    break L32;
                  } else {
                    if (vl.field_H != ib.field_f) {
                      break L32;
                    } else {
                      vl.field_H = 0;
                      cd.field_j = false;
                      break L32;
                    }
                  }
                }
                return;
              } else {
                L33: {
                  if (!cd.field_j) {
                    if (vl.field_H >= ib.field_d) {
                      if (kj.field_r + ib.field_d > vl.field_H) {
                        stackOut_116_0 = 1;
                        stackIn_118_0 = stackOut_116_0;
                        break L33;
                      } else {
                        stackOut_115_0 = 0;
                        stackIn_118_0 = stackOut_115_0;
                        break L33;
                      }
                    } else {
                      stackOut_113_0 = 0;
                      stackIn_118_0 = stackOut_113_0;
                      break L33;
                    }
                  } else {
                    stackOut_111_0 = 0;
                    stackIn_118_0 = stackOut_111_0;
                    break L33;
                  }
                }
                L34: {
                  L35: {
                    var2 = stackIn_118_0;
                    if (param1 == null) {
                      break L35;
                    } else {
                      if (cd.field_j) {
                        vl.field_H = ib.field_d;
                        break L34;
                      } else {
                        if (var2 == 0) {
                          break L35;
                        } else {
                          vl.field_H = ib.field_d;
                          break L34;
                        }
                      }
                    }
                  }
                  vl.field_H = 0;
                  break L34;
                }
                L36: {
                  field_m = nk.field_l;
                  if (param1 != null) {
                    cd.field_j = false;
                    break L36;
                  } else {
                    if (var2 == 0) {
                      break L36;
                    } else {
                      cd.field_j = true;
                      break L36;
                    }
                  }
                }
                L37: {
                  r.field_j = j.field_c;
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L37;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L37;
                    } else {
                      if (!mg.field_a) {
                        break L37;
                      } else {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        break L37;
                      }
                    }
                  }
                }
                L38: {
                  nk.field_l = -1;
                  j.field_c = -1;
                  if (!cd.field_j) {
                    break L38;
                  } else {
                    if (vl.field_H != ib.field_f) {
                      break L38;
                    } else {
                      vl.field_H = 0;
                      cd.field_j = false;
                      break L38;
                    }
                  }
                }
                return;
              }
            } else {
              if (nl.field_f != null) {
                L39: {
                  nl.field_f = param1;
                  if (!cd.field_j) {
                    if (ib.field_d > vl.field_H) {
                      if (mg.field_a) {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        nk.field_l = -1;
                        j.field_c = -1;
                        if (!cd.field_j) {
                          break L39;
                        } else {
                          if (vl.field_H != ib.field_f) {
                            break L39;
                          } else {
                            vl.field_H = 0;
                            cd.field_j = false;
                            break L39;
                          }
                        }
                      } else {
                        nk.field_l = -1;
                        j.field_c = -1;
                        if (!cd.field_j) {
                          break L39;
                        } else {
                          if (vl.field_H != ib.field_f) {
                            break L39;
                          } else {
                            vl.field_H = 0;
                            cd.field_j = false;
                            break L39;
                          }
                        }
                      }
                    } else {
                      nk.field_l = -1;
                      j.field_c = -1;
                      if (!cd.field_j) {
                        break L39;
                      } else {
                        if (vl.field_H != ib.field_f) {
                          break L39;
                        } else {
                          vl.field_H = 0;
                          cd.field_j = false;
                          break L39;
                        }
                      }
                    }
                  } else {
                    nk.field_l = -1;
                    j.field_c = -1;
                    if (!cd.field_j) {
                      break L39;
                    } else {
                      if (vl.field_H != ib.field_f) {
                        break L39;
                      } else {
                        vl.field_H = 0;
                        cd.field_j = false;
                        break L39;
                      }
                    }
                  }
                }
                return;
              } else {
                L40: {
                  if (!cd.field_j) {
                    if (vl.field_H >= ib.field_d) {
                      if (kj.field_r + ib.field_d > vl.field_H) {
                        stackOut_59_0 = 1;
                        stackIn_61_0 = stackOut_59_0;
                        break L40;
                      } else {
                        stackOut_58_0 = 0;
                        stackIn_61_0 = stackOut_58_0;
                        break L40;
                      }
                    } else {
                      stackOut_56_0 = 0;
                      stackIn_61_0 = stackOut_56_0;
                      break L40;
                    }
                  } else {
                    stackOut_54_0 = 0;
                    stackIn_61_0 = stackOut_54_0;
                    break L40;
                  }
                }
                L41: {
                  var2 = stackIn_61_0;
                  if (param1 != null) {
                    if (cd.field_j) {
                      vl.field_H = ib.field_d;
                      break L41;
                    } else {
                      if (var2 != 0) {
                        vl.field_H = ib.field_d;
                        break L41;
                      } else {
                        vl.field_H = 0;
                        break L41;
                      }
                    }
                  } else {
                    vl.field_H = 0;
                    break L41;
                  }
                }
                L42: {
                  field_m = nk.field_l;
                  if (param1 != null) {
                    cd.field_j = false;
                    break L42;
                  } else {
                    if (var2 == 0) {
                      break L42;
                    } else {
                      cd.field_j = true;
                      break L42;
                    }
                  }
                }
                L43: {
                  r.field_j = j.field_c;
                  nl.field_f = param1;
                  if (!cd.field_j) {
                    if (ib.field_d > vl.field_H) {
                      if (mg.field_a) {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        nk.field_l = -1;
                        j.field_c = -1;
                        if (!cd.field_j) {
                          break L43;
                        } else {
                          if (vl.field_H != ib.field_f) {
                            break L43;
                          } else {
                            vl.field_H = 0;
                            cd.field_j = false;
                            break L43;
                          }
                        }
                      } else {
                        nk.field_l = -1;
                        j.field_c = -1;
                        if (!cd.field_j) {
                          break L43;
                        } else {
                          if (vl.field_H != ib.field_f) {
                            break L43;
                          } else {
                            vl.field_H = 0;
                            cd.field_j = false;
                            break L43;
                          }
                        }
                      }
                    } else {
                      nk.field_l = -1;
                      j.field_c = -1;
                      if (!cd.field_j) {
                        break L43;
                      } else {
                        if (vl.field_H != ib.field_f) {
                          break L43;
                        } else {
                          vl.field_H = 0;
                          cd.field_j = false;
                          break L43;
                        }
                      }
                    }
                  } else {
                    nk.field_l = -1;
                    j.field_c = -1;
                    if (!cd.field_j) {
                      break L43;
                    } else {
                      if (vl.field_H != ib.field_f) {
                        break L43;
                      } else {
                        vl.field_H = 0;
                        cd.field_j = false;
                        break L43;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            L44: {
              if (param1 != null) {
                if (!param1.equals((Object) (Object) nl.field_f)) {
                  if (cd.field_j) {
                    stackOut_23_0 = 0;
                    stackIn_25_0 = stackOut_23_0;
                    L45: {
                      var2 = stackIn_25_0;
                      if (param1 != null) {
                        L46: {
                          if (cd.field_j) {
                            break L46;
                          } else {
                            if (var2 != 0) {
                              break L46;
                            } else {
                              vl.field_H = 0;
                              break L45;
                            }
                          }
                        }
                        vl.field_H = ib.field_d;
                        break L45;
                      } else {
                        vl.field_H = 0;
                        break L45;
                      }
                    }
                    L47: {
                      field_m = nk.field_l;
                      if (param1 != null) {
                        cd.field_j = false;
                        r.field_j = j.field_c;
                        break L47;
                      } else {
                        if (var2 == 0) {
                          r.field_j = j.field_c;
                          break L47;
                        } else {
                          cd.field_j = true;
                          r.field_j = j.field_c;
                          break L47;
                        }
                      }
                    }
                    nl.field_f = param1;
                    if (cd.field_j) {
                      break L44;
                    } else {
                      if (ib.field_d <= vl.field_H) {
                        break L44;
                      } else {
                        if (!mg.field_a) {
                          break L44;
                        } else {
                          r.field_j = j.field_c;
                          vl.field_H = 0;
                          field_m = nk.field_l;
                          break L44;
                        }
                      }
                    }
                  } else {
                    nl.field_f = param1;
                    if (cd.field_j) {
                      break L44;
                    } else {
                      if (ib.field_d <= vl.field_H) {
                        break L44;
                      } else {
                        if (!mg.field_a) {
                          break L44;
                        } else {
                          r.field_j = j.field_c;
                          vl.field_H = 0;
                          field_m = nk.field_l;
                          break L44;
                        }
                      }
                    }
                  }
                } else {
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L44;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L44;
                    } else {
                      if (!mg.field_a) {
                        break L44;
                      } else {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        break L44;
                      }
                    }
                  }
                }
              } else {
                if (nl.field_f == null) {
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L44;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L44;
                    } else {
                      if (!mg.field_a) {
                        break L44;
                      } else {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        break L44;
                      }
                    }
                  }
                } else {
                  nl.field_f = param1;
                  if (cd.field_j) {
                    break L44;
                  } else {
                    if (ib.field_d <= vl.field_H) {
                      break L44;
                    } else {
                      if (!mg.field_a) {
                        break L44;
                      } else {
                        r.field_j = j.field_c;
                        vl.field_H = 0;
                        field_m = nk.field_l;
                        break L44;
                      }
                    }
                  }
                }
              }
            }
            L48: {
              nk.field_l = -1;
              j.field_c = -1;
              if (!cd.field_j) {
                break L48;
              } else {
                if (vl.field_H != ib.field_f) {
                  break L48;
                } else {
                  vl.field_H = 0;
                  cd.field_j = false;
                  break L48;
                }
              }
            }
            return;
          }
        }
    }

    aj(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = la.field_o;
        la.field_o = la.field_o + 1;
        ((aj) this).field_q = fieldTemp$0 & 65535;
        ((aj) this).field_i = param5;
        ((aj) this).field_k = param3;
        ((aj) this).field_l = param4;
        ((aj) this).field_p = param0;
        ((aj) this).field_r = param2;
        ((aj) this).field_n = param1;
        ((aj) this).field_o = param6;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = -1;
    }
}
