/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    private int field_h;
    static int[] field_l;
    int field_k;
    private int field_j;
    static boolean field_c;
    private int field_b;
    private boolean field_d;
    static int field_g;
    static dd field_e;
    static int field_f;
    private int field_a;
    static String field_i;
    int field_m;

    final void a(int param0, boolean param1) {
        ((pl) this).field_b = 0;
        ((pl) this).field_j = 0;
        if (0 == ((pl) this).field_a) {
          ((pl) this).field_j = ji.field_a;
          if (param1) {
            L0: {
              if (((pl) this).field_a != 0) {
                break L0;
              } else {
                if (-97 == ji.field_a) {
                  L1: {
                    if (((pl) this).field_k <= 0) {
                      ((pl) this).field_k = ((pl) this).field_m;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  break L0;
                } else {
                  L2: {
                    if (-1 != ((pl) this).field_a) {
                      break L2;
                    } else {
                      if (97 != ji.field_a) {
                        break L2;
                      } else {
                        ((pl) this).field_k = ((pl) this).field_k + 1;
                        if (((pl) this).field_m > ((pl) this).field_k) {
                          ((pl) this).field_d = false;
                          break L2;
                        } else {
                          ((pl) this).field_k = 0;
                          ((pl) this).field_d = false;
                          break L2;
                        }
                      }
                    }
                  }
                  if (0 == ((pl) this).field_a) {
                    if ((ji.field_a ^ -1) != -99) {
                      if ((ji.field_a ^ -1) == -100) {
                        ((pl) this).field_d = false;
                        if (((pl) this).field_k < 0) {
                          ((pl) this).field_k = param0;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ((pl) this).field_d = false;
                      if (((pl) this).field_k < 0) {
                        ((pl) this).field_k = param0;
                        return;
                      } else {
                        return;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            L3: {
              if (-1 != (((pl) this).field_a ^ -1)) {
                break L3;
              } else {
                if (97 != ji.field_a) {
                  break L3;
                } else {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_m > ((pl) this).field_k) {
                    ((pl) this).field_d = false;
                    if (0 == ((pl) this).field_a) {
                      L4: {
                        if ((ji.field_a ^ -1) == -99) {
                          break L4;
                        } else {
                          if ((ji.field_a ^ -1) == -100) {
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                      ((pl) this).field_d = false;
                      if (((pl) this).field_k < 0) {
                        ((pl) this).field_k = param0;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    ((pl) this).field_k = 0;
                    ((pl) this).field_d = false;
                    if (0 == ((pl) this).field_a) {
                      L5: {
                        if ((ji.field_a ^ -1) == -99) {
                          break L5;
                        } else {
                          if ((ji.field_a ^ -1) == -100) {
                            break L5;
                          } else {
                            return;
                          }
                        }
                      }
                      ((pl) this).field_d = false;
                      if (((pl) this).field_k >= 0) {
                        return;
                      } else {
                        ((pl) this).field_k = param0;
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            if (0 == ((pl) this).field_a) {
              L6: {
                if ((ji.field_a ^ -1) == -99) {
                  break L6;
                } else {
                  if ((ji.field_a ^ -1) == -100) {
                    break L6;
                  } else {
                    return;
                  }
                }
              }
              ((pl) this).field_d = false;
              if (((pl) this).field_k >= 0) {
                return;
              } else {
                ((pl) this).field_k = param0;
                return;
              }
            } else {
              return;
            }
          } else {
            ((pl) this).a(-102, (byte) 70);
            if (((pl) this).field_a != 0) {
              L7: {
                if (-1 != ((pl) this).field_a) {
                  break L7;
                } else {
                  if (97 != ji.field_a) {
                    break L7;
                  } else {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_m > ((pl) this).field_k) {
                      ((pl) this).field_d = false;
                      break L7;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (0 != ((pl) this).field_a) {
                  break L8;
                } else {
                  L9: {
                    if ((ji.field_a ^ -1) == -99) {
                      break L9;
                    } else {
                      if (ji.field_a == -100) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  ((pl) this).field_d = false;
                  if (((pl) this).field_k >= 0) {
                    break L8;
                  } else {
                    ((pl) this).field_k = param0;
                    break L8;
                  }
                }
              }
              return;
            } else {
              L10: {
                if (-97 == ji.field_a) {
                  L11: {
                    if (((pl) this).field_k <= 0) {
                      ((pl) this).field_k = ((pl) this).field_m;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L12: {
                if (-1 != (((pl) this).field_a ^ -1)) {
                  break L12;
                } else {
                  if (97 != ji.field_a) {
                    break L12;
                  } else {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_m > ((pl) this).field_k) {
                      ((pl) this).field_d = false;
                      break L12;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      break L12;
                    }
                  }
                }
              }
              L13: {
                if (0 != ((pl) this).field_a) {
                  break L13;
                } else {
                  L14: {
                    if ((ji.field_a ^ -1) == -99) {
                      break L14;
                    } else {
                      if (ji.field_a == -100) {
                        break L14;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ((pl) this).field_d = false;
                  if (((pl) this).field_k >= 0) {
                    break L13;
                  } else {
                    ((pl) this).field_k = param0;
                    break L13;
                  }
                }
              }
              return;
            }
          }
        } else {
          if (param1) {
            L15: {
              if (((pl) this).field_a != 0) {
                break L15;
              } else {
                if (-97 == ji.field_a) {
                  L16: {
                    if (((pl) this).field_k <= 0) {
                      ((pl) this).field_k = ((pl) this).field_m;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  break L15;
                } else {
                  L17: {
                    if (-1 != ((pl) this).field_a) {
                      break L17;
                    } else {
                      if (97 != ji.field_a) {
                        break L17;
                      } else {
                        ((pl) this).field_k = ((pl) this).field_k + 1;
                        if (((pl) this).field_m > ((pl) this).field_k) {
                          ((pl) this).field_d = false;
                          break L17;
                        } else {
                          ((pl) this).field_k = 0;
                          ((pl) this).field_d = false;
                          break L17;
                        }
                      }
                    }
                  }
                  L18: {
                    if (0 != ((pl) this).field_a) {
                      break L18;
                    } else {
                      L19: {
                        if ((ji.field_a ^ -1) == -99) {
                          break L19;
                        } else {
                          if ((ji.field_a ^ -1) == -100) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      ((pl) this).field_d = false;
                      if (((pl) this).field_k >= 0) {
                        break L18;
                      } else {
                        ((pl) this).field_k = param0;
                        break L18;
                      }
                    }
                  }
                  return;
                }
              }
            }
            L20: {
              if (-1 != (((pl) this).field_a ^ -1)) {
                break L20;
              } else {
                if (97 != ji.field_a) {
                  break L20;
                } else {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_m > ((pl) this).field_k) {
                    L21: {
                      ((pl) this).field_d = false;
                      if (0 != ((pl) this).field_a) {
                        break L21;
                      } else {
                        L22: {
                          if ((ji.field_a ^ -1) == -99) {
                            break L22;
                          } else {
                            if ((ji.field_a ^ -1) == -100) {
                              break L22;
                            } else {
                              break L21;
                            }
                          }
                        }
                        ((pl) this).field_d = false;
                        if (((pl) this).field_k >= 0) {
                          break L21;
                        } else {
                          ((pl) this).field_k = param0;
                          break L21;
                        }
                      }
                    }
                    return;
                  } else {
                    ((pl) this).field_k = 0;
                    L23: {
                      ((pl) this).field_d = false;
                      if (0 != ((pl) this).field_a) {
                        break L23;
                      } else {
                        L24: {
                          if ((ji.field_a ^ -1) == -99) {
                            break L24;
                          } else {
                            if ((ji.field_a ^ -1) == -100) {
                              break L24;
                            } else {
                              break L23;
                            }
                          }
                        }
                        ((pl) this).field_d = false;
                        if (((pl) this).field_k >= 0) {
                          break L23;
                        } else {
                          ((pl) this).field_k = param0;
                          break L23;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
            if (0 == ((pl) this).field_a) {
              L25: {
                if ((ji.field_a ^ -1) == -99) {
                  break L25;
                } else {
                  if ((ji.field_a ^ -1) == -100) {
                    break L25;
                  } else {
                    return;
                  }
                }
              }
              ((pl) this).field_d = false;
              if (((pl) this).field_k < 0) {
                ((pl) this).field_k = param0;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L26: {
              ((pl) this).a(-102, (byte) 70);
              if (((pl) this).field_a != 0) {
                break L26;
              } else {
                if (-97 == (ji.field_a ^ -1)) {
                  L27: {
                    if (((pl) this).field_k <= 0) {
                      ((pl) this).field_k = ((pl) this).field_m;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  break L26;
                } else {
                  break L26;
                }
              }
            }
            L28: {
              if (-1 != (((pl) this).field_a ^ -1)) {
                break L28;
              } else {
                if (97 != ji.field_a) {
                  break L28;
                } else {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_m > ((pl) this).field_k) {
                    ((pl) this).field_d = false;
                    break L28;
                  } else {
                    ((pl) this).field_k = 0;
                    ((pl) this).field_d = false;
                    break L28;
                  }
                }
              }
            }
            L29: {
              if (0 != ((pl) this).field_a) {
                break L29;
              } else {
                L30: {
                  if ((ji.field_a ^ -1) == -99) {
                    break L30;
                  } else {
                    if ((ji.field_a ^ -1) == -100) {
                      break L30;
                    } else {
                      break L29;
                    }
                  }
                }
                ((pl) this).field_d = false;
                if (((pl) this).field_k >= 0) {
                  break L29;
                } else {
                  ((pl) this).field_k = param0;
                  break L29;
                }
              }
            }
            return;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        if (((pl) this).field_m > param2) {
          if (((pl) this).field_m <= param1) {
            throw new IllegalArgumentException();
          } else {
            ((pl) this).field_j = 0;
            ((pl) this).field_b = 0;
            if (-1 != (jk.field_r ^ -1)) {
              ((pl) this).field_h = kb.field_p;
              ((pl) this).field_a = jk.field_r;
              ((pl) this).field_b = jk.field_r;
              ((pl) this).field_k = param1;
              ((pl) this).field_d = true;
              if (((pl) this).field_a != 0) {
                L0: {
                  if (-1 != (kc.field_f ^ -1)) {
                    if ((((pl) this).field_h ^ -1) < -1) {
                      ((pl) this).field_h = ((pl) this).field_h - 1;
                      break L0;
                    } else {
                      ((pl) this).field_h = qa.field_k;
                      ((pl) this).field_h = ((pl) this).field_h - 1;
                      break L0;
                    }
                  } else {
                    break L0;
                  }
                }
                L1: {
                  if (jk.field_r != 0) {
                    break L1;
                  } else {
                    if (0 == kc.field_f) {
                      ((pl) this).field_a = 0;
                      break L1;
                    } else {
                      L2: {
                        if (((pl) this).field_a != 0) {
                          break L2;
                        } else {
                          L3: {
                            if (((pl) this).field_d) {
                              break L3;
                            } else {
                              if (field_c) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          if (0 > param2) {
                            if (((pl) this).field_d) {
                              ((pl) this).field_k = -1;
                              break L2;
                            } else {
                              L4: {
                                if (param0 >= 55) {
                                  break L4;
                                } else {
                                  ((pl) this).h(94);
                                  break L4;
                                }
                              }
                              return;
                            }
                          } else {
                            if (param2 != ((pl) this).field_k) {
                              ((pl) this).field_d = true;
                              ((pl) this).field_k = param2;
                              break L2;
                            } else {
                              ((pl) this).field_d = true;
                              ((pl) this).field_k = param2;
                              break L2;
                            }
                          }
                        }
                      }
                      if (param0 < 55) {
                        ((pl) this).h(94);
                        return;
                      } else {
                        return;
                      }
                    }
                  }
                }
                if (((pl) this).field_a != 0) {
                  if (param0 >= 55) {
                    return;
                  } else {
                    ((pl) this).h(94);
                    return;
                  }
                } else {
                  if (!((pl) this).field_d) {
                    if (!field_c) {
                      if (param0 >= 55) {
                        return;
                      } else {
                        ((pl) this).h(94);
                        return;
                      }
                    } else {
                      if (0 > param2) {
                        if (((pl) this).field_d) {
                          ((pl) this).field_k = -1;
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        } else {
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        }
                      } else {
                        if (param2 != ((pl) this).field_k) {
                          ((pl) this).field_d = true;
                          ((pl) this).field_k = param2;
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        } else {
                          ((pl) this).field_d = true;
                          ((pl) this).field_k = param2;
                          if (param0 >= 55) {
                            return;
                          } else {
                            ((pl) this).h(94);
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    if (0 > param2) {
                      if (((pl) this).field_d) {
                        ((pl) this).field_k = -1;
                        if (param0 >= 55) {
                          return;
                        } else {
                          ((pl) this).h(94);
                          return;
                        }
                      } else {
                        if (param0 >= 55) {
                          return;
                        } else {
                          ((pl) this).h(94);
                          return;
                        }
                      }
                    } else {
                      if (param2 != ((pl) this).field_k) {
                        ((pl) this).field_d = true;
                        ((pl) this).field_k = param2;
                        if (param0 < 55) {
                          ((pl) this).h(94);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        ((pl) this).field_d = true;
                        ((pl) this).field_k = param2;
                        if (param0 < 55) {
                          ((pl) this).h(94);
                          return;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                L5: {
                  if (jk.field_r != 0) {
                    break L5;
                  } else {
                    if (0 == kc.field_f) {
                      ((pl) this).field_a = 0;
                      break L5;
                    } else {
                      L6: {
                        if (((pl) this).field_a != 0) {
                          break L6;
                        } else {
                          L7: {
                            if (((pl) this).field_d) {
                              break L7;
                            } else {
                              if (field_c) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (0 > param2) {
                            if (((pl) this).field_d) {
                              ((pl) this).field_k = -1;
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            if (param2 != ((pl) this).field_k) {
                              ((pl) this).field_d = true;
                              ((pl) this).field_k = param2;
                              break L6;
                            } else {
                              ((pl) this).field_d = true;
                              ((pl) this).field_k = param2;
                              break L6;
                            }
                          }
                        }
                      }
                      L8: {
                        if (param0 >= 55) {
                          break L8;
                        } else {
                          ((pl) this).h(94);
                          break L8;
                        }
                      }
                      return;
                    }
                  }
                }
                if (((pl) this).field_a != 0) {
                  if (param0 < 55) {
                    ((pl) this).h(94);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (!((pl) this).field_d) {
                    if (field_c) {
                      if (0 > param2) {
                        if (((pl) this).field_d) {
                          ((pl) this).field_k = -1;
                          if (param0 < 55) {
                            ((pl) this).h(94);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          L9: {
                            if (param0 >= 55) {
                              break L9;
                            } else {
                              ((pl) this).h(94);
                              break L9;
                            }
                          }
                          return;
                        }
                      } else {
                        if (param2 != ((pl) this).field_k) {
                          L10: {
                            ((pl) this).field_d = true;
                            ((pl) this).field_k = param2;
                            if (param0 >= 55) {
                              break L10;
                            } else {
                              ((pl) this).h(94);
                              break L10;
                            }
                          }
                          return;
                        } else {
                          L11: {
                            ((pl) this).field_d = true;
                            ((pl) this).field_k = param2;
                            if (param0 >= 55) {
                              break L11;
                            } else {
                              ((pl) this).h(94);
                              break L11;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      L12: {
                        if (param0 >= 55) {
                          break L12;
                        } else {
                          ((pl) this).h(94);
                          break L12;
                        }
                      }
                      return;
                    }
                  } else {
                    if (0 > param2) {
                      if (((pl) this).field_d) {
                        ((pl) this).field_k = -1;
                        if (param0 < 55) {
                          ((pl) this).h(94);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L13: {
                          if (param0 >= 55) {
                            break L13;
                          } else {
                            ((pl) this).h(94);
                            break L13;
                          }
                        }
                        return;
                      }
                    } else {
                      if (param2 != ((pl) this).field_k) {
                        L14: {
                          ((pl) this).field_d = true;
                          ((pl) this).field_k = param2;
                          if (param0 >= 55) {
                            break L14;
                          } else {
                            ((pl) this).h(94);
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          ((pl) this).field_d = true;
                          ((pl) this).field_k = param2;
                          if (param0 >= 55) {
                            break L15;
                          } else {
                            ((pl) this).h(94);
                            break L15;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
            } else {
              L16: {
                if (((pl) this).field_a == -1) {
                  break L16;
                } else {
                  if (-1 != kc.field_f) {
                    if ((((pl) this).field_h ^ -1) < -1) {
                      ((pl) this).field_h = ((pl) this).field_h - 1;
                      break L16;
                    } else {
                      ((pl) this).field_h = qa.field_k;
                      ((pl) this).field_h = ((pl) this).field_h - 1;
                      break L16;
                    }
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (jk.field_r != 0) {
                  break L17;
                } else {
                  if (0 == kc.field_f) {
                    ((pl) this).field_a = 0;
                    break L17;
                  } else {
                    L18: {
                      if (((pl) this).field_a != 0) {
                        break L18;
                      } else {
                        L19: {
                          if (((pl) this).field_d) {
                            break L19;
                          } else {
                            if (field_c) {
                              break L19;
                            } else {
                              break L18;
                            }
                          }
                        }
                        if (0 > param2) {
                          if (((pl) this).field_d) {
                            ((pl) this).field_k = -1;
                            break L18;
                          } else {
                            break L18;
                          }
                        } else {
                          if (param2 != ((pl) this).field_k) {
                            ((pl) this).field_d = true;
                            ((pl) this).field_k = param2;
                            break L18;
                          } else {
                            ((pl) this).field_d = true;
                            ((pl) this).field_k = param2;
                            break L18;
                          }
                        }
                      }
                    }
                    L20: {
                      if (param0 >= 55) {
                        break L20;
                      } else {
                        ((pl) this).h(94);
                        break L20;
                      }
                    }
                    return;
                  }
                }
              }
              L21: {
                if (((pl) this).field_a != 0) {
                  break L21;
                } else {
                  L22: {
                    if (((pl) this).field_d) {
                      break L22;
                    } else {
                      if (field_c) {
                        break L22;
                      } else {
                        L23: {
                          if (param0 >= 55) {
                            break L23;
                          } else {
                            ((pl) this).h(94);
                            break L23;
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (0 > param2) {
                    if (((pl) this).field_d) {
                      ((pl) this).field_k = -1;
                      break L21;
                    } else {
                      L24: {
                        if (param0 >= 55) {
                          break L24;
                        } else {
                          ((pl) this).h(94);
                          break L24;
                        }
                      }
                      return;
                    }
                  } else {
                    if (param2 != ((pl) this).field_k) {
                      L25: {
                        ((pl) this).field_d = true;
                        ((pl) this).field_k = param2;
                        if (param0 >= 55) {
                          break L25;
                        } else {
                          ((pl) this).h(94);
                          break L25;
                        }
                      }
                      return;
                    } else {
                      L26: {
                        ((pl) this).field_d = true;
                        ((pl) this).field_k = param2;
                        if (param0 >= 55) {
                          break L26;
                        } else {
                          ((pl) this).h(94);
                          break L26;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              if (param0 < 55) {
                ((pl) this).h(94);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    final void a(int param0, byte param1) {
        L0: {
          if (((pl) this).field_a == 0) {
            ((pl) this).field_k = param0;
            ((pl) this).field_d = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 >= -78) {
          ((pl) this).a(61, true);
          return;
        } else {
          return;
        }
    }

    public static void f(int param0) {
        field_l = null;
        field_e = null;
        field_i = null;
        if (param0 != 0) {
            pl.d(-80);
        }
    }

    final void h(int param0) {
        ((pl) this).field_j = param0;
        ((pl) this).field_b = 0;
        if (((pl) this).field_a != 0) {
          L0: {
            if (((pl) this).field_a != 0) {
              break L0;
            } else {
              if (ji.field_a != 98) {
                break L0;
              } else {
                if (-1 > (((pl) this).field_k ^ -1)) {
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  if (((pl) this).field_a == 0) {
                    if ((ji.field_a ^ -1) == -100) {
                      ((pl) this).field_k = ((pl) this).field_k + 1;
                      if (((pl) this).field_k < ((pl) this).field_m) {
                        ((pl) this).field_d = false;
                        return;
                      } else {
                        ((pl) this).field_k = 0;
                        ((pl) this).field_d = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((pl) this).field_k = ((pl) this).field_m;
                  ((pl) this).field_d = false;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  if (((pl) this).field_a == 0) {
                    if ((ji.field_a ^ -1) == -100) {
                      ((pl) this).field_k = ((pl) this).field_k + 1;
                      if (((pl) this).field_k < ((pl) this).field_m) {
                        ((pl) this).field_d = false;
                        return;
                      } else {
                        ((pl) this).field_k = 0;
                        ((pl) this).field_d = false;
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
            }
          }
          if (((pl) this).field_a == 0) {
            if ((ji.field_a ^ -1) == -100) {
              ((pl) this).field_k = ((pl) this).field_k + 1;
              if (((pl) this).field_k < ((pl) this).field_m) {
                ((pl) this).field_d = false;
                return;
              } else {
                ((pl) this).field_k = 0;
                ((pl) this).field_d = false;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          ((pl) this).field_j = ji.field_a;
          if (((pl) this).field_a == 0) {
            if (ji.field_a == 98) {
              if (-1 > (((pl) this).field_k ^ -1)) {
                ((pl) this).field_d = false;
                ((pl) this).field_k = ((pl) this).field_k - 1;
                if (((pl) this).field_a == 0) {
                  if ((ji.field_a ^ -1) == -100) {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_k < ((pl) this).field_m) {
                      ((pl) this).field_d = false;
                      return;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((pl) this).field_k = ((pl) this).field_m;
                ((pl) this).field_d = false;
                ((pl) this).field_k = ((pl) this).field_k - 1;
                if (((pl) this).field_a == 0) {
                  if ((ji.field_a ^ -1) == -100) {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_k < ((pl) this).field_m) {
                      ((pl) this).field_d = false;
                      return;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (((pl) this).field_a == 0) {
                if ((ji.field_a ^ -1) == -100) {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_k < ((pl) this).field_m) {
                    ((pl) this).field_d = false;
                    return;
                  } else {
                    ((pl) this).field_k = 0;
                    ((pl) this).field_d = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (((pl) this).field_a == 0) {
              if ((ji.field_a ^ -1) == -100) {
                ((pl) this).field_k = ((pl) this).field_k + 1;
                if (((pl) this).field_k < ((pl) this).field_m) {
                  ((pl) this).field_d = false;
                  return;
                } else {
                  ((pl) this).field_k = 0;
                  ((pl) this).field_d = false;
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
    }

    final boolean b(int param0) {
        int var2 = 0;
        var2 = -120 % ((45 - param0) / 57);
        if (-1 == (((pl) this).field_b ^ -1)) {
          if (((pl) this).field_j != 84) {
            if ((((pl) this).field_j ^ -1) == -84) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final boolean g(int param0) {
        int var2 = 27 / ((17 - param0) / 62);
        return (((pl) this).field_j ^ -1) == -103 ? true : false;
    }

    final static boolean a(rh param0, rh param1, rh param2, boolean param3) {
        L0: {
          if (!param0.b((byte) -121)) {
            break L0;
          } else {
            if (!param0.a("commonui", -95)) {
              break L0;
            } else {
              if (param1.b((byte) -126)) {
                if (param1.a("commonui", -109)) {
                  L1: {
                    if (param3) {
                      break L1;
                    } else {
                      pl.f(-93);
                      break L1;
                    }
                  }
                  if (param2.b((byte) -125)) {
                    if (!param2.a("button.gif", -101)) {
                      return false;
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
                return false;
              }
            }
          }
        }
        return false;
    }

    final void c(int param0) {
        ((pl) this).field_b = 0;
        ((pl) this).field_j = 0;
        if (param0 <= -2) {
          L0: {
            if (0 == ((pl) this).field_a) {
              ((pl) this).field_j = ji.field_a;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (0 != ((pl) this).field_a) {
              break L1;
            } else {
              if (ji.field_a != 96) {
                break L1;
              } else {
                if ((((pl) this).field_k ^ -1) < -1) {
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  ((pl) this).field_d = false;
                  if (((pl) this).field_a == 0) {
                    if (ji.field_a == 97) {
                      ((pl) this).field_k = ((pl) this).field_k + 1;
                      if (((pl) this).field_m > ((pl) this).field_k) {
                        ((pl) this).field_d = false;
                        return;
                      } else {
                        ((pl) this).field_k = 0;
                        ((pl) this).field_d = false;
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  ((pl) this).field_k = ((pl) this).field_m;
                  ((pl) this).field_k = ((pl) this).field_k - 1;
                  ((pl) this).field_d = false;
                  if (((pl) this).field_a == 0) {
                    if (ji.field_a == 97) {
                      ((pl) this).field_k = ((pl) this).field_k + 1;
                      if (((pl) this).field_m > ((pl) this).field_k) {
                        ((pl) this).field_d = false;
                        return;
                      } else {
                        ((pl) this).field_k = 0;
                        ((pl) this).field_d = false;
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
            }
          }
          if (((pl) this).field_a == 0) {
            if (ji.field_a == 97) {
              ((pl) this).field_k = ((pl) this).field_k + 1;
              if (((pl) this).field_m > ((pl) this).field_k) {
                ((pl) this).field_d = false;
                return;
              } else {
                ((pl) this).field_k = 0;
                ((pl) this).field_d = false;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          L2: {
            field_c = false;
            if (0 == ((pl) this).field_a) {
              ((pl) this).field_j = ji.field_a;
              break L2;
            } else {
              break L2;
            }
          }
          if (0 == ((pl) this).field_a) {
            if (ji.field_a == 96) {
              if ((((pl) this).field_k ^ -1) < -1) {
                ((pl) this).field_k = ((pl) this).field_k - 1;
                ((pl) this).field_d = false;
                if (((pl) this).field_a == 0) {
                  if (ji.field_a == 97) {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_m > ((pl) this).field_k) {
                      ((pl) this).field_d = false;
                      return;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                ((pl) this).field_k = ((pl) this).field_m;
                ((pl) this).field_k = ((pl) this).field_k - 1;
                ((pl) this).field_d = false;
                if (((pl) this).field_a == 0) {
                  if (ji.field_a == 97) {
                    ((pl) this).field_k = ((pl) this).field_k + 1;
                    if (((pl) this).field_m > ((pl) this).field_k) {
                      ((pl) this).field_d = false;
                      return;
                    } else {
                      ((pl) this).field_k = 0;
                      ((pl) this).field_d = false;
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (((pl) this).field_a == 0) {
                if (ji.field_a == 97) {
                  ((pl) this).field_k = ((pl) this).field_k + 1;
                  if (((pl) this).field_m > ((pl) this).field_k) {
                    ((pl) this).field_d = false;
                    return;
                  } else {
                    ((pl) this).field_k = 0;
                    ((pl) this).field_d = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (((pl) this).field_a == 0) {
              if (ji.field_a == 97) {
                ((pl) this).field_k = ((pl) this).field_k + 1;
                if (((pl) this).field_m > ((pl) this).field_k) {
                  ((pl) this).field_d = false;
                  return;
                } else {
                  ((pl) this).field_k = 0;
                  ((pl) this).field_d = false;
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
    }

    final boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        return ((pl) this).field_a != 0 ? true : false;
    }

    final boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -23670) {
          L0: {
            ((pl) this).a(23, 68, true, 121);
            if ((((pl) this).field_j ^ -1) != -98) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((pl) this).field_j ^ -1) != -98) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static int a(CharSequence param0, int param1) {
        if (param1 != -9816) {
          pl.a(83, 14, 100);
          return jc.a(10, 110, true, param0);
        } else {
          return jc.a(10, 110, true, param0);
        }
    }

    final boolean a(byte param0) {
        if (param0 != -29) {
            return true;
        }
        return ((pl) this).field_j == 103 ? true : false;
    }

    final static void d(int param0) {
        if (param0 < 60) {
            field_i = null;
        }
    }

    final boolean e(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 96) {
          L0: {
            ((pl) this).field_a = 48;
            if (((pl) this).field_j != 96) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((pl) this).field_j != 96) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        param0 = param0 * 16;
        param2 = param2 * 16;
        gb.a(si.field_R);
        var3 = ni.field_j * 2 % 16;
        gb.a(var3 + param2, param0 - 4, 16 + (param2 + var3), 16 + param0);
        gb.h(var3 + param2, 4 + param0, 8, 13421632);
        gb.b(si.field_R);
        if (param1 > -63) {
          pl.f(47);
          return;
        } else {
          return;
        }
    }

    final void i(int param0) {
        ((pl) this).field_b = 0;
        if (param0 != -13093) {
          L0: {
            ((pl) this).h(-126);
            ((pl) this).field_j = 0;
            if (((pl) this).field_a == 0) {
              ((pl) this).field_j = ji.field_a;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            ((pl) this).field_j = 0;
            if (((pl) this).field_a == 0) {
              ((pl) this).field_j = ji.field_a;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          ((pl) this).field_a = 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param2) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        ((pl) this).field_d = stackIn_3_1 != 0;
        if (((pl) this).field_d) {
          ((pl) this).field_k = param0;
          if (param3 < -58) {
            return;
          } else {
            boolean discarded$4 = ((pl) this).b(-3);
            return;
          }
        } else {
          ((pl) this).field_k = param1;
          if (param3 < -58) {
            return;
          } else {
            boolean discarded$5 = ((pl) this).b(-3);
            return;
          }
        }
    }

    pl(int param0) {
        ((pl) this).field_k = 0;
        ((pl) this).field_d = false;
        ((pl) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_i = "<%0>Water:<%1> fleas can't swim, so make sure they stay out of any water.";
        field_l = new int[]{41, 30};
        field_f = 0;
    }
}
