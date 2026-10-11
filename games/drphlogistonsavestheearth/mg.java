/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mg {
    private java.util.zip.Inflater field_b;
    static String[][] field_a;

    private mg(int param0, int param1, int param2) {
    }

    final static int a(boolean param0) {
        if (hj.field_f < 2) {
          return 0;
        }
        if (ob.field_c == 0) {
          if (!qd.field_Jb.a(0)) {
            return 20;
          }
          if (!qd.field_Jb.a(255, "commonui")) {
            return 40;
          }
          if (!sb.field_i.a(0)) {
            return 50;
          }
          if (!sb.field_i.a(255, "commonui")) {
            return 60;
          }
          if (!ig.field_t.a(0)) {
            return 70;
          }
          if (!ig.field_t.c((byte) 54)) {
            return 80;
          }
        } else {
          if (bi.field_I != null) {
            if (!bi.field_I.a(0)) {
              return 14;
            }
            if (!bi.field_I.a((byte) 12, "")) {
              return 29;
            }
            if (!bi.field_I.a(255, "")) {
              return 29;
            }
          }
          if (!qd.field_Jb.a(0)) {
            return 43;
          }
          if (!qd.field_Jb.a(255, "commonui")) {
            return 57;
          }
          if (!sb.field_i.a(0)) {
            return 71;
          }
          if (!sb.field_i.a(255, "commonui")) {
            return 80;
          }
          if (!ig.field_t.a(0)) {
            return 82;
          }
          if (!ig.field_t.c((byte) 22)) {
            return 86;
          }
        }
        if (!param0) {
          return 119;
        }
        return 100;
    }

    final static void a(int param0, int param1, int param2) {
        if (null == ja.field_t ||
          !(ja.field_t.length >= param0)) {
          ja.field_t = new int[2 * param0];
        }
        if (null == rc.field_i ||
          !(rc.field_i.length >= param0)) {
          rc.field_i = new int[param0 * 2];
        }
        if (param1 < 48) {
          mg.a(true);
        }
        if (null != fi.field_h &&
          param0 <= fi.field_h.length) {
          if (kk.field_a == null) {
            kk.field_a = new int[param0 * 2];
            if (null == qj.field_d ||
              !(param0 <= qj.field_d.length)) {
              qj.field_d = new int[param0 * 2];
            }
            if (null == kf.field_c ||
              !(param0 <= kf.field_c.length)) {
              kf.field_c = new int[2 * param0];
            }
            if (null == bj.field_a) {
              bj.field_a = new int[2 * (param2 + param0)];
              if (null == cb.field_c ||
                !(cb.field_c.length >= param0)) {
                cb.field_c = new boolean[param0 * 2];
              }
            } else {
              if (bj.field_a.length < param2 + param0) {
                bj.field_a = new int[2 * (param2 + param0)];
                if (null == cb.field_c ||
                  !(cb.field_c.length >= param0)) {
                  cb.field_c = new boolean[param0 * 2];
                }
              } else {
                if (null == cb.field_c) {
                  cb.field_c = new boolean[param0 * 2];
                } else {
                  if (cb.field_c.length < param0) {
                    cb.field_c = new boolean[param0 * 2];
                  }
                }
              }
            }
          } else {
            if (kk.field_a.length < param0) {
              kk.field_a = new int[param0 * 2];
              if (null == qj.field_d ||
                !(param0 <= qj.field_d.length)) {
                qj.field_d = new int[param0 * 2];
              }
              if (null == kf.field_c ||
                !(param0 <= kf.field_c.length)) {
                kf.field_c = new int[2 * param0];
              }
              if (null == bj.field_a ||
                !(bj.field_a.length >= param2 + param0)) {
                bj.field_a = new int[2 * (param2 + param0)];
              }
            } else {
              if (null == qj.field_d ||
                !(param0 <= qj.field_d.length)) {
                qj.field_d = new int[param0 * 2];
              }
              if (null == kf.field_c ||
                !(param0 <= kf.field_c.length)) {
                kf.field_c = new int[2 * param0];
              }
              if (null == bj.field_a) {
                bj.field_a = new int[2 * (param2 + param0)];
              } else {
                if (bj.field_a.length < param2 + param0) {
                  bj.field_a = new int[2 * (param2 + param0)];
                }
              }
            }
            if (null == cb.field_c) {
              cb.field_c = new boolean[param0 * 2];
            } else {
              if (cb.field_c.length < param0) {
                cb.field_c = new boolean[param0 * 2];
              }
            }
          }
          pf.field_f = -2147483648;
          ha.field_c = 2147483647;
          mh.field_b = -2147483648;
          gg.field_b = 0;
          cc.field_B = 2147483647;
          return;
        }
        fi.field_h = new int[param0 * 2];
        if (kk.field_a == null) {
          kk.field_a = new int[param0 * 2];
          if (null == qj.field_d ||
            !(param0 <= qj.field_d.length)) {
            qj.field_d = new int[param0 * 2];
          }
          if (null == kf.field_c ||
            !(param0 <= kf.field_c.length)) {
            kf.field_c = new int[2 * param0];
          }
          if (null == bj.field_a ||
            !(bj.field_a.length >= param2 + param0)) {
            bj.field_a = new int[2 * (param2 + param0)];
          }
          if (null == cb.field_c ||
            !(cb.field_c.length >= param0)) {
            cb.field_c = new boolean[param0 * 2];
          }
        } else {
          if (kk.field_a.length >= param0) {
            if (null == qj.field_d ||
              !(param0 <= qj.field_d.length)) {
              qj.field_d = new int[param0 * 2];
            }
            if (null == kf.field_c ||
              !(param0 <= kf.field_c.length)) {
              kf.field_c = new int[2 * param0];
            }
            if (null == bj.field_a ||
              !(bj.field_a.length >= param2 + param0)) {
              bj.field_a = new int[2 * (param2 + param0)];
            }
            if (null == cb.field_c ||
              !(cb.field_c.length >= param0)) {
              cb.field_c = new boolean[param0 * 2];
            }
          } else {
            kk.field_a = new int[param0 * 2];
            if (null == qj.field_d ||
              !(param0 <= qj.field_d.length)) {
              qj.field_d = new int[param0 * 2];
            }
            if (null == kf.field_c ||
              !(param0 <= kf.field_c.length)) {
              kf.field_c = new int[2 * param0];
            }
            if (null == bj.field_a ||
              !(bj.field_a.length >= param2 + param0)) {
              bj.field_a = new int[2 * (param2 + param0)];
            }
            if (null != cb.field_c &&
              cb.field_c.length >= param0) {
              pf.field_f = -2147483648;
              ha.field_c = 2147483647;
              mh.field_b = -2147483648;
              gg.field_b = 0;
              cc.field_B = 2147483647;
              return;
            }
            cb.field_c = new boolean[param0 * 2];
          }
        }
        pf.field_f = -2147483648;
        ha.field_c = 2147483647;
        mh.field_b = -2147483648;
        gg.field_b = 0;
        cc.field_B = 2147483647;
    }

    public mg() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte[] param0, od param1, int param2) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          RuntimeException var4_ref = null;
          try {
            if (param1.field_h[param1.field_j] == 31 &&
              param1.field_h[param1.field_j + 1] == -117) {
              if (null == this.field_b) {
                this.field_b = new java.util.zip.Inflater(true);
              }
              try {
                this.field_b.setInput(param1.field_h, param1.field_j + 10, -param1.field_j + (-18 + param1.field_h.length));
                if (param2 != -1) {
                  return;
                }
                this.field_b.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
                this.field_b.reset();
                throw new RuntimeException("");
              }
              this.field_b.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var4_ref;
            stackIn_15_1 = new StringBuilder().append("mg.C(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        if (param0 != 5) {
          return;
        }
        field_a = (String[][]) null;
    }

    static {
        field_a = new String[][]{new String[]{"Dr Phlogiston's personal journal, October 18th", "I have received an urgent telephone call from Major General Fitzroy of the Royal Guard. It seems there is an unknown fleet of flying ships approaching my city!", "I must bring forward the demonstration of my aerial gunboat.", "The Major General had me posing for a photograph of my craft while I awaited the arrival of my pilot.", "My pilot seems a most peculiar young man.", "His name is Captain Piercy.", "", "I hope, for all our sakes, that his piloting skills are better than his manners, and his dress sense!"}, new String[]{"October 20th: Success! My aerial gunboat has proved its worth in the defence of Brighton. The strange invaders were repelled, but it appears they were merely regrouping. I have just received a telegram, from Bath this time. We must fly there immediately to fight off another fleet of these infernal creatures!"}, new String[]{"October 23rd: Cpt. Piercy still worries me. He takes far too much delight in pushing my aerial gunboat to its very limits! Another wave of mechanical monsters is fast approaching London. Cpt. Piercy can scarcely contain his excitement at the prospect of yet another aerial confrontation."}, new String[]{"October 25th: After fighting off three separate fleets, we have enjoyed a brief respite. I have used this time to finish the installation of some new experimental systems.", "We must now take to the skies once again, this time to leave Earth far behind us. The Astronomer Royal came to see me with terrifying news: he has found the invaders in the empty space above our sky!", "Thus do Cpt. Piercy and I rush to the aerial gunboat, to launch ourselves towards them once more."}, new String[]{"October 30th: Captain Piercy's demeanour has become far more serious since we flew into space. Perhaps it has dawned upon him how dangerous this enemy we face is, or perhaps he caught a glimpse, as I did, of the Earth as it looks from this distance. Our home, and everything we have ever seen or done, can now be hidden from view by a single thumb."}, new String[]{"November 4th: I no longer doubt Captain Piercy's skills one jot. We have flown almost to our destination, and he has wielded this craft as a weapon far deadlier than I thought possible. His skills will be tested further still, as another wave of alien craft has been launched against us..."}, new String[]{"November 7th: I can no longer hear Earth on the wireless. It is no surprise given the great distance.", "One thing I can detect, though, is a strange chattering; I assume it to be wireless signals from these...alien...creatures.", "I have given Captain Piercy the signals' bearings. Let us see what fate has in store for us..."}, new String[]{"November 8th: I have modified my wireless equipment to indicate the direction of the strongest signal sources on this alien planet, and we have set course for the nearest of them. I pray it is not too late to head off this invasion and save Earth..."}, new String[]{"November 9th: We barely survived that last attack run. Neither of us can bear to think what will happen to Earth if we do not destroy these invaders once and for all!"}};
    }
}
